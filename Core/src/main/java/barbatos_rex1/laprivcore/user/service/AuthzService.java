package barbatos_rex1.laprivcore.user.service;

import barbatos_rex1.laprivcore.personal_info.domain.ProfileRepository;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.shared.utils.Validations;
import barbatos_rex1.laprivcore.user.domain.*;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AuthzService implements barbatos_rex1.laprivcore.user.domain.AuthzService, UserService {
    private UserRepository repo;
    private ProfileRepository profileRepository;

    private Optional<User> currentSession = Optional.empty();

    private UserMapper mapper;

    public AuthzService(UserRepository repo, ProfileRepository profileRepository, UserMapper mapper) {
        this.repo = repo;
        this.profileRepository = profileRepository;
        this.mapper = mapper;
    }

    @SneakyThrows
    @Override
    public Optional<UserDTO> login(String email, String password) {
        if (currentSession.isPresent()) {
            return Optional.empty();
        }

        var user = repo.findByEmail(Email.from(email));

        if (user.isEmpty() || user.get().getStatus() == Status.DISABLE) {
            return Optional.empty();
        }

        Password p = Password.secure(user.get().getId().getId(), password);

        if (p.getEncryptedPassword().equals(user.get().getPassword().getEncryptedPassword())) {
            currentSession = user;
            return user.map(mapper::toDTO);
        }
        return Optional.empty();
    }


    @SneakyThrows
    @Override
    public Optional<UserDTO> register(CreateUserDTO user) {
        user.id = null;
        var u = mapper.toDomain(user);
        try {
            Validations.isFalse(repo.findByEmail(Email.from(user.email)).isPresent());
        } catch (BuisnessRuleViolationException e) {
            throw new BuisnessRuleViolationException("Email in question already in use!", e);
        }
        profileRepository.save(u.getProfile());
        var us = repo.save(u);
        return Optional.of(mapper.toDTO(us));
    }


    @Override
    public Optional<UserDTO> logout() {
        if (currentSession.isPresent()) {
            var dto = mapper.toDTO(currentSession.get());
            currentSession = Optional.empty();
            return Optional.of(dto);
        }
        return Optional.empty();
    }

    @Override
    public Optional<UserDTO> currentSession() {
        if (currentSession.isPresent()) {
            return currentSession.map(mapper::toDTO);
        }
        return Optional.empty();
    }

    @Override
    public boolean isAuthorized(Role... roles) {
        if (currentSession().isEmpty()) {
            return false;
        }
        return Arrays.stream(roles).anyMatch(r -> r == currentSession.get().getRole());
    }

    @Override
    public List<UserDTO> all() {
        return repo.findAll().stream().map(u -> mapper.toDTO(u)).toList();
    }

    @Override
    public List<UserDTO> managers() {
        return repo.findAllManagers().stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<UserDTO> teachers() {
        return repo.findAllTeachers().stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<UserDTO> students() {
        return repo.findAllStudents().stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<UserDTO> allEnabled() {
        return repo.findAllEnabled().stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<UserDTO> allDisabled() {
        return repo.findAllDisabled().stream().map(mapper::toDTO).toList();
    }

    @Override
    public boolean enableUser(String userId) {
        var u = repo.findById(StringId.from(userId));
        if (u.isPresent()) {
            var user = u.get();
            boolean b = user.enableUser();
            repo.save(user);
            return b;
        }
        return false;
    }

    @Override
    public boolean disableUser(String disableUser) {
        var u = repo.findById(StringId.from(disableUser));
        if (u.isPresent()) {
            var user = u.get();
            boolean b = user.disableUser();
            repo.save(user);
            return b;
        }
        return false;
    }

    @SneakyThrows
    @Override
    public Optional<UserDTO> user(String userId) {
        Optional<User> user = repo.findById(StringId.from(userId));
        if (user.isEmpty()) {
            throw new BuisnessRuleViolationException("No user with such id!");
        }
        return user.map(mapper::toDTO);
    }
}

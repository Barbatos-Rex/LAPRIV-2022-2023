package barbatos_rex1.laprivcore.user.service;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.utils.Validations;
import barbatos_rex1.laprivcore.user.domain.*;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class AuthzService implements barbatos_rex1.laprivcore.user.domain.AuthzService {
    private UserRepository repo;

    private Optional<User> currentSession = Optional.empty();

    private UserMapper mapper;


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
            return user.map(mapper::toDTO);
        }
        return Optional.empty();
    }


    @SneakyThrows
    @Override
    public Optional<UserDTO> register(CreateUserDTO user) {
        user.id = null;
        var u = mapper.toDomain(user);
        Validations.isFalse(repo.findByEmail(Email.from(user.email)).isPresent());
        var us = repo.save(mapper.toDomain(user));
        return Optional.of(mapper.toDTO(us));
    }


    @Override
    public Optional<UserDTO> logout() {
        return Optional.empty();
    }

    @Override
    public Optional<UserDTO> currentSession() {
        return Optional.empty();
    }

    @Override
    public boolean isAuthorized(Role... roles) {
        if (currentSession().isEmpty()) {
            return false;
        }
        return Arrays.stream(roles).anyMatch(r -> r == currentSession.get().getRole());
    }

}

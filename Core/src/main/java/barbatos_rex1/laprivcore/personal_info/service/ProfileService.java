package barbatos_rex1.laprivcore.personal_info.service;

import barbatos_rex1.laprivcore.personal_info.domain.ProfileDTO;
import barbatos_rex1.laprivcore.personal_info.domain.ProfileMapper;
import barbatos_rex1.laprivcore.personal_info.domain.ProfileRepository;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProfileService implements barbatos_rex1.laprivcore.personal_info.domain.ProfileService {

    private ProfileRepository repo;

    private ProfileMapper mapper;


    @Override
    public List<ProfileDTO> all() {
        return repo.findAll().stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<ProfileDTO> teachers() {
        return repo.findAllTeacherProfiles().stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<ProfileDTO> students() {
        return repo.findAllStudentProfiles().stream().map(mapper::toDTO).toList();
    }

    @Override
    public List<ProfileDTO> managers() {
        return repo.findAllManagerProfiles().stream().map(mapper::toDTO).toList();
    }

    @Override
    public Optional<ProfileDTO> profileOfUser(String userId) {
        var p = repo.findProfileByUserId(StringId.from(userId));
        if (p.isPresent()) {
            return p.map(mapper::toDTO);
        }
        return Optional.empty();
    }

    @Override
    public Optional<ProfileDTO> create(ProfileDTO profile) {
        var p = mapper.toDomain(profile);
        p = repo.save(p);
        if (p == null) {
            return Optional.empty();
        }
        return Optional.of(mapper.toDTO(p));
    }

    @Override
    public Optional<ProfileDTO> delete(String userId) {
        var p = repo.findProfileByUserId(StringId.from(userId));
        if (p.isPresent()) {
            repo.delete(p.get());
            return p.map(mapper::toDTO);
        }
        return Optional.empty();
    }

    @Override
    public Optional<ProfileDTO> patch(ProfileDTO profile) {
        var p = repo.findById(StringId.from(profile.id));
        if (p.isPresent()) {
            var pro = mapper.toDomain(profile);
            repo.save(pro);
            return p.map(mapper::toDTO);
        }
        return Optional.empty();
    }
}

package barbatos_rex1.laprivcore.user.domain;

import barbatos_rex1.laprivcore.personal_info.domain.ProfileMapper;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@AllArgsConstructor
public class UserMapper {

    private ProfileMapper profileMapper;

    private UserRepository repo;


    @SneakyThrows
    public User toDomain(CreateUserDTO dto) {
        User.UserBuilder builder = User.builder();
        var userId = StringId.newId();
        builder.id(userId).shortName(Name.from(dto.shortName)).
                fullName(FullName.from(dto.fullName)).email(Email.from(dto.email))
                .role(dto.role).password(Password.secure(userId.getId(), dto.password))
                .status(Status.ENABLE);
        dto.profile.id = dto.id;
        builder.profile(profileMapper.toDomain(dto.profile));
        return builder.build();
    }

    public UserDTO toDTO(User entity) {
        return new UserDTO(entity.getId().getId(), entity.getEmail().getEmail(),
                entity.getShortName().getName(), entity.getFullName().getName(),
                entity.getRole(), entity.getStatus());
    }

    @SneakyThrows
    public UserProxi toDomain(UserDTO user) {
        return new UserProxi(user, repo);
    }


    public UserDTO toDTO(UserProxi proxi) {
        return new UserDTO(proxi.getId().getId(), proxi.getEmail().getEmail(),
                proxi.getShortName().getName(), proxi.getFullName().getName(),
                proxi.getRole(), proxi.getStatus());
    }

}

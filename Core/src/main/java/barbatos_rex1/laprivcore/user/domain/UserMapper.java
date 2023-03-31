package barbatos_rex1.laprivcore.user.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @SneakyThrows
    public User toDomain(CreateUserDTO dto) {
        User.UserBuilder builder = User.builder();
        builder.id(StringId.from(dto.id)).shortName(Name.from(dto.shortName)).
                fullName(FullName.from(dto.fullName)).email(Email.from(dto.email))
                .role(Role.valueOf(dto.role)).password(Password.secure(dto.id, dto.password));
        return builder.build();
    }

    public UserDTO toDTO(User entity) {
        return new UserDTO(entity.getId().getId(), entity.getEmail().getEmail(),
                entity.getShortName().getName(), entity.getFullName().getName(),
                entity.getRole().name());
    }
}

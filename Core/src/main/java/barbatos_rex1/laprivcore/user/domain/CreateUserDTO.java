package barbatos_rex1.laprivcore.user.domain;

import barbatos_rex1.laprivcore.personal_info.domain.ProfileDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDTO extends UserDTO {
    public String password;
    public ProfileDTO profile;
}

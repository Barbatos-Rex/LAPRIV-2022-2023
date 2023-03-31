package barbatos_rex1.laprivcore.user.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDTO extends UserDTO {
    public String password;
}

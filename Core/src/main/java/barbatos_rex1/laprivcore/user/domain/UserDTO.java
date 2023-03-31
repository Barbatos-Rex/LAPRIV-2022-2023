package barbatos_rex1.laprivcore.user.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    public String id;
    public String email;
    public String shortName;
    public String fullName;
    public String role;
}

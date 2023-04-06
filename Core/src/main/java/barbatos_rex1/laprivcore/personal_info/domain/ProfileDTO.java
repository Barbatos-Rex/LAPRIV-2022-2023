package barbatos_rex1.laprivcore.personal_info.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class ProfileDTO {
    public String id;
    public Date birthDate;
    public String taxNumber;
}

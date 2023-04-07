package barbatos_rex1.laprivcore.personal_info.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class TeacherProfileDTO extends ProfileDTO {
    public String acronym;

    public TeacherProfileDTO(String id, Date birthDate, String taxNumber, String acronym) {
        super(id, birthDate, taxNumber);
        this.acronym = acronym;
    }
}

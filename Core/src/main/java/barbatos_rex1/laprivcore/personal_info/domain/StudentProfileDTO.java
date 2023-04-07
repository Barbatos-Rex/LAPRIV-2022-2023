package barbatos_rex1.laprivcore.personal_info.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class StudentProfileDTO extends ProfileDTO {

    public int mechanographicNumber;

    public StudentProfileDTO(String id, Date birthDate, String taxNumber, int mechanographicNumber) {
        super(id, birthDate, taxNumber);
        this.mechanographicNumber = mechanographicNumber;
    }
}

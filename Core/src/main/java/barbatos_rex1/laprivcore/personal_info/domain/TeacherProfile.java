package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class TeacherProfile extends Profile {

    @AttributeOverride(name = "acronym", column = @Column(unique = true))
    private Acronym acronym;

    TeacherProfile(StringId userId, BirthDate birthDate, TaxNumber taxNumber, Acronym acronym, Calendar calendar) {
        super(userId, birthDate, taxNumber, calendar);
        this.acronym = acronym;
    }
}

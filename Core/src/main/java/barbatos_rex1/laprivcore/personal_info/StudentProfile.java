package barbatos_rex1.laprivcore.personal_info;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class StudentProfile extends Profile {

    @AttributeOverride(name = "mechanographicNumber", column = @Column(unique = true))
    private MechanographicNumber mechanographicNumber;


}

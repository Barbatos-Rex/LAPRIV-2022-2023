package barbatos_rex1.laprivcore.personal_info.domain;

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
public class TeacherProfile extends Profile {

    @AttributeOverride(name = "acronym", column = @Column(unique = true))
    private Acronym acronym;
}

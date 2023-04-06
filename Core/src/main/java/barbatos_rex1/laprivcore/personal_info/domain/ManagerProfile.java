package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class ManagerProfile extends Profile {
    ManagerProfile(StringId userId, BirthDate birthDate, TaxNumber taxNumber, Calendar calendar) {
        super(userId, birthDate, taxNumber, calendar);
    }
}

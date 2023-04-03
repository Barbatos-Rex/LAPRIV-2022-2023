package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.shared.domain.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.util.Date;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class BirthDate implements ValueObject {

    private Date birthDate;

    public static BirthDate from(Date date) {
        return new BirthDate(date);
    }


}

package barbatos_rex1.laprivcore.personal_info.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class MechanographicNumber {
    private int mechanographicNumber;

    public static MechanographicNumber from(int number) {
        return new MechanographicNumber(number);
    }


}

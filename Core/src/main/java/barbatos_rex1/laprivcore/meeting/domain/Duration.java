package barbatos_rex1.laprivcore.meeting.domain;

import barbatos_rex1.laprivcore.shared.domain.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class Duration implements ValueObject {
    //In Minutes
    private int duration;

    public static Duration from(int duration) {
        return new Duration(duration);
    }

}

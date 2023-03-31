package barbatos_rex1.laprivcore.meeting;

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
    private long duration;

    public static Duration from(long duration) {
        return new Duration(duration);
    }

}

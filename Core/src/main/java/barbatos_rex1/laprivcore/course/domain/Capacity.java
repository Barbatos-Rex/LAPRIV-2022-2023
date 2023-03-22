package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class Capacity implements ValueObject {

    private int capacity;

    //TODO Add exceptions
    public static Capacity from(int value) {
        return new Capacity(value);
    }


}

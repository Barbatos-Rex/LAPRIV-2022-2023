package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.EntityId;
import barbatos_rex1.laprivcore.shared.domain.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class Code implements EntityId, ValueObject {
    private String code;

    public static Code from(String value) {
        return new Code(value);
    }


}

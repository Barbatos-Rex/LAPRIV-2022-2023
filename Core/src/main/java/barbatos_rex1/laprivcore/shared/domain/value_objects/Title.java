package barbatos_rex1.laprivcore.shared.domain.value_objects;

import barbatos_rex1.laprivcore.shared.domain.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class Title implements ValueObject {
    private String title;

    //TODO Add exceptions
    public static Title from(String value) {
        return new Title(value);
    }

}

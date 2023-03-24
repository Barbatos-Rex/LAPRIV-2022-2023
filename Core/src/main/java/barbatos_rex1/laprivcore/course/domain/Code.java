package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.EntityId;
import barbatos_rex1.laprivcore.shared.domain.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code1 = (Code) o;
        return Objects.equals(code, code1.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}

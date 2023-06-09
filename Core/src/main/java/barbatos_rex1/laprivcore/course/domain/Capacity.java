package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.ValueObject;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.shared.domain.exception.ValidationException;
import barbatos_rex1.laprivcore.shared.utils.Validations;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class Capacity implements ValueObject {

    private int capacity;

    public static Capacity from(int value) throws BuisnessRuleViolationException {
        try {
            Validations.isPositive(value);
        } catch (ValidationException e) {
            throw new BuisnessRuleViolationException("Capacity's rule violated!",e);
        }
        return new Capacity(value);
    }


}

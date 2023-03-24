package barbatos_rex1.laprivcore.shared.domain.value_objects;

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
public class Title implements ValueObject {
    private String title;

    public static Title from(String value) throws BuisnessRuleViolationException {
        try {
            Validations.areNonBlack(value);
        } catch (ValidationException e) {
            throw new BuisnessRuleViolationException("Title's rules violated!",e);
        }
        return new Title(value);
    }

}

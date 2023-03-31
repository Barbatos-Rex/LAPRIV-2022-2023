package barbatos_rex1.laprivcore.user.domain;

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
public class Name {


    private String name;

    public static Name from(String name) throws BuisnessRuleViolationException{
        try {
            Validations.areNonBlack(name);
            Validations.matches(name,"^\\p{L}{2,}$");
        } catch (ValidationException e) {
            throw new BuisnessRuleViolationException("Name's rules violated!",e);
        }
        return new Name(name);
    }


}

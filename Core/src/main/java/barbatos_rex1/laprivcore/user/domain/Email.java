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
public class Email {
    private String email;


    public static Email from(String email) throws BuisnessRuleViolationException {
        try {
            Validations.areNonBlack(email);
            Validations.matches(email, "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        } catch (ValidationException e) {
            throw new BuisnessRuleViolationException("Email's rules violated!",e);
        }
        return new Email(email);
    }

}

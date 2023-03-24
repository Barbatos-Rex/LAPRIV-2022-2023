package barbatos_rex1.laprivcore.shared.utils;

import barbatos_rex1.laprivcore.shared.domain.exception.ValidationException;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Validations {


    public void isPositive(double value) throws ValidationException {
        if (value <= 0) {
            throw new ValidationException("Value must be positive!");
        }
    }

    public void areNonBlack(String... value) throws ValidationException {
        for (String str : value) {
            if (str == null || str.isBlank()) {
                throw new ValidationException("Values must not be null or blank!");
            }
        }
    }

    public void matches(String str, String s) throws ValidationException{
        if (!str.matches(s)){
            throw new ValidationException(String.format("String does not match regex \"%s\"!", s));
        }
    }
}

package barbatos_rex1.laprivcore.shared.domain.exception;

public class BuisnessRuleViolationException extends Exception{

    public BuisnessRuleViolationException() {
    }

    public BuisnessRuleViolationException(String message) {
        super(message);
    }

    public BuisnessRuleViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuisnessRuleViolationException(Throwable cause) {
        super(cause);
    }
}

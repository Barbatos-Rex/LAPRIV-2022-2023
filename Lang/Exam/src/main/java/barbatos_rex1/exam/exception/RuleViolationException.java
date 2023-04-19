package barbatos_rex1.exam.exception;

public class RuleViolationException extends Exception{
    public RuleViolationException() {
    }

    public RuleViolationException(String message) {
        super(message);
    }

    public RuleViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuleViolationException(Throwable cause) {
        super(cause);
    }

    public RuleViolationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

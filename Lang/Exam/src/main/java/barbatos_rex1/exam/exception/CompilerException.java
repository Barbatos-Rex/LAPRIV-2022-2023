package barbatos_rex1.exam.exception;

public class CompilerException extends Exception{
    private int line;
    private int pos;

    public CompilerException(int line, int pos) {
        super();
        this.line = line;
        this.pos = pos;
    }

    public CompilerException(String message, int line, int pos) {
        super(message+ " on line "+line +" and pos "+pos);
        this.line = line;
        this.pos = pos;
    }

    public CompilerException(String message, Throwable cause, int line, int pos) {
        super(message + " on line "+line +" and pos "+pos, cause);
        this.line = line;
        this.pos = pos;
    }

    public CompilerException(Throwable cause, int line, int pos) {
        super(cause);
        this.line = line;
        this.pos = pos;
    }

    public CompilerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int line, int pos) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.line = line;
        this.pos = pos;
    }

    private String formatCause(String cause){
        return new StringBuilder().append(cause).append(String.format(" on line %d and pos %d", line,pos)).toString();
    }
}

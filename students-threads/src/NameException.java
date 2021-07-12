//Yakov Hazout - 205874233
//Guy Kozliner - 316612662

public class NameException extends Exception {
    public NameException() {
    }

    public NameException(String message) {
        super(message);
    }

    public NameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameException(Throwable cause) {
        super(cause);
    }
}
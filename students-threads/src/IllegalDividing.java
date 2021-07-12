//Yakov Hazout - 205874233
//Guy Kozliner - 316612662

public class IllegalDividing extends Exception {
    public IllegalDividing() {
    }

    public IllegalDividing(String message) {
        super(message);
    }

    public IllegalDividing(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalDividing(Throwable cause) {
        super(cause);
    }

    public IllegalDividing(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

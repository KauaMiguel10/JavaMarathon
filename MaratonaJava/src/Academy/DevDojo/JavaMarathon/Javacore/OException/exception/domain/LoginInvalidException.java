package Academy.DevDojo.JavaMarathon.Javacore.OException.exception.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Login Invalid");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}

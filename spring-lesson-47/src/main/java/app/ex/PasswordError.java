package app.ex;


public class PasswordError extends AuthError {

    public final String passwordProvided;

    public PasswordError(String loginName) {
        super();
        this.passwordProvided = loginName;
    }
}



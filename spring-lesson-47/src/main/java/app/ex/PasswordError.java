package app.ex;

public class PasswordError extends RuntimeException implements AuthError{
    private final String passwordProvided;

    public PasswordError(String passwordProvided) {
        super();
        this.passwordProvided = passwordProvided;
    }
}

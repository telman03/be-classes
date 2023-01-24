package app.ex;

public class LoginError extends RuntimeException implements AuthError{
    private final String loginName;

    public LoginError(String loginName) {
        super();
        this.loginName = loginName;
    }
}

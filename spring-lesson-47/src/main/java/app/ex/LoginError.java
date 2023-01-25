package app.ex;


public class LoginError extends AuthError {

    public final String loginName;

    public LoginError(String loginName) {
        super();
        this.loginName = loginName;
    }
}


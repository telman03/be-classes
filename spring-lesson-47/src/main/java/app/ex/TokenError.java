package app.ex;

import java.time.Instant;
import java.time.Instant;

public class TokenError extends AuthError{

    public final String token;
    public final Instant instant;

    public TokenError(String token, Instant instant) {
        super();
        this.token = token;
        this.instant = instant;
    }

}



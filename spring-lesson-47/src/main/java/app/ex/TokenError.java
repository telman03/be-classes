package app.ex;

import java.time.Instant;

public class TokenError extends RuntimeException implements AuthError{
    private final String token;

    private final Instant instant;


    public TokenError(String token, Instant instant) {
        super();
        this.token = token;
        this.instant = instant;
    }
}

package app;


import app.ex.AuthError;
import app.ex.ErrorPayload;
import app.ex.LoginError;
import app.ex.PasswordError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class WholeAppExceptionHandler {

    @ExceptionHandler({AuthError.class})
    public ResponseEntity<?> handleMyError(HttpServletRequest rq, AuthError myException) {
        String message = switch (myException) {
            case LoginError x1 -> x1.loginName;
            case PasswordError x1 -> x1.passwordProvided;
            default -> myException.getMessage();
        };
        return ResponseEntity.status(502).body(
                new ErrorPayload(myException.getClass().getSimpleName(), message, rq.getRequestURI())
        );
    }

    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseEntity<?> handleMyValidationError(HttpServletRequest rq, ConstraintViolationException ex) {
        // real code here
        ex.getConstraintViolations().forEach(x -> System.out.println(x));

        return ResponseEntity.status(502).build();
    }

}


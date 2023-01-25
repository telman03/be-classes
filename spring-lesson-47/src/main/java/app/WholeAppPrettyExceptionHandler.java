package app;


import app.ex.AuthError;
import app.ex.LoginError;
import app.ex.PasswordError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class WholeAppPrettyExceptionHandler {

    @ExceptionHandler({AuthError.class})
    public ModelAndView handleMyError(HttpServletRequest rq, AuthError myException) {
        String message = switch (myException) {
            case LoginError x1 -> x1.loginName;
            case PasswordError x1 -> x1.passwordProvided;
            default -> myException.getMessage();
        };

        ModelAndView mav = new ModelAndView();
        mav.addObject("url", rq.getRequestURI());
        mav.addObject("ex", myException);
        mav.addObject("message", message);
        mav.addObject("className", myException.getClass().getSimpleName());
        mav.setViewName("pretty_handler");
        mav.setStatus(HttpStatus.NOT_IMPLEMENTED);
        return mav;
    }


}


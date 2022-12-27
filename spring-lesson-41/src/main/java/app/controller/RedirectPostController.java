package app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("redirect_post")
public class RedirectPostController {

    // http://localhost:8080/redirect_post/1
    @PostMapping("1")
    public ModelAndView handle1(HttpServletRequest rq) {
        rq.setAttribute(
                View.RESPONSE_STATUS_ATTRIBUTE,
                HttpStatus.TEMPORARY_REDIRECT
        );
        return new ModelAndView("redirect:/redirect_post/2");
    }

    @PostMapping("2")
    public String handle2() {
        return "";
    }

}


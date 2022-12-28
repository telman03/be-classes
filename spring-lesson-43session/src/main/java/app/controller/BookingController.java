package app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.spec.OAEPParameterSpec;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("booking")
public class BookingController {
    private final String cookieName = "JID";
    private final String NOT_FOUND = "Cookie not found";

    private Optional<Cookie> find(HttpServletRequest rq){
        return Optional.ofNullable(rq.getCookies())
                .flatMap(cc ->
                        Arrays.stream(cc).filter(c -> c.getName().equals(cookieName)).findFirst()
        );
    }


    // http://localhost:8080/booking/z
    @GetMapping("z")
    public String zero(HttpServletResponse rs){
        rs.addCookie(new Cookie(cookieName, UUID.randomUUID().toString()));
        return "cookie set";
    }

    // http://localhost:8080/booking/a
    @GetMapping("a")
    public String first(HttpServletRequest rq){
        Optional<Cookie> cookie = find(rq);
        return "Hello";
    }

}

package app;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {


    // http://localhost:8080/
    @GetMapping()
    public String handle(){
        return "page";
    }
}

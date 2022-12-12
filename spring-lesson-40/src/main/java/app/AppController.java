package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

//    http://localhost:8080/hello?name=Telman
    @RequestMapping("/hello")
    public String test1(String name){
        return String.format("Hello, %s", name);
    }
}

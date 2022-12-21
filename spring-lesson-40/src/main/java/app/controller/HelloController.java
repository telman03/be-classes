package app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
public class HelloController {

//    http://localhost:8080/hello/hello1?name=Jim&age=19
    @GetMapping("hello1")
    public String test1(@RequestParam("name") String name, @RequestParam("age") Optional<Integer> age){
        return String.format("Hello, %s, %s", name, age);
    }


    //    http://localhost:8080/hello/hello2?name=Jim&age=33
    @GetMapping("hello2")
    public String test2(HttpServletRequest rq){
        return String.format("Hello, %s, %s", rq.getParameter("name"), rq.getParameter("age"));
    }

}

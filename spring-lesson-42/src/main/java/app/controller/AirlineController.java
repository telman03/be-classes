package app.controller;

import app.model.Airline;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("airline")
public class AirlineController {
    @GetMapping
    public List<Airline> list(@RequestParam("query") String query){
        throw new IllegalStateException("not implemented");
    }
    @GetMapping
    public void create(){
        throw new IllegalStateException("not implemented");
    }
    @GetMapping
    public void modify(){
        throw new IllegalStateException("not implemented");
    }
    @GetMapping
    public void delete(){
        throw new IllegalStateException("not implemented");
    }
}

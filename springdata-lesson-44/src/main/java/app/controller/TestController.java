package app.controller;


import app.model.Person;
import app.model.PersonCreateRq;
import app.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class TestController {

    private final PersonRepo repo;

    @GetMapping
    public List<Person>  handle1(){
        return repo.findAll();
    }

    @PostMapping
    public void handle2(@RequestBody PersonCreateRq rq){
        Person p = new Person();
        p.setUsername(rq.getUsername());
        p.setPassword(rq.getPassword());
        repo.save(p);
    }
}

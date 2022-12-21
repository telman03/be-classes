package app.controller;


import app.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    //  http://localhost:8080/person
    @GetMapping
    public Person test1(){
        return new Person(44, "James");
    }

    //  http://localhost:8080/person/Jim

    @GetMapping("{name}")
    public Person test2(@PathVariable("name")  String pers0nName){
        return new Person(44, pers0nName);
    }

    @PostMapping
    public String test3(@RequestBody  Person p){
        System.out.println(p);
        return "Look into the logs..";
    }
}

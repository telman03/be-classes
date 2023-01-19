package app.controller;


import app.model.Person;
import app.model.PersonCreateRq;
import app.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class TestController {

    private final PersonRepo repo;

    @GetMapping
    public List<Person>  handle1(){
        List<Person> data = repo.findAll();
        return data;
    }
    @GetMapping("{id}")
    public ResponseEntity<Person> handle2(@PathVariable Integer id){
        Optional<Person> data = repo.findById(id);
        return ResponseEntity.of(data);
    }


    @PostMapping
    public void handle3(@RequestBody PersonCreateRq rq){
        Person p = new Person();
        p.setUsername(rq.getUsername());
        p.setPassword(rq.getPassword());
        repo.save(p);
    }



    public void test(){
        Optional<Person> byId = repo.findById(123);

        /** ANTI-PATTERN !!! it fetches All the reloads */
        List<Person> all = repo.findAll();


        Pageable pageable = Pageable.ofSize(20).withPage(5);
        Page<Person> page = repo.findAll(pageable);
    }
}

package app.controller;

import app.model.Airline;
import app.model.AirlineCreateRq;
import app.model.AirlineUpdateRq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("airline")
public class AirlineController {

    // status: 200 - OK
    //         204 - No Content
    @GetMapping
    public ResponseEntity<List<Airline>> list(@RequestParam("query") String query) {
        // 1. get all the data needed from request (query param, path var, cookie, header, attachment, ...)
        // 2. service call: service.list(query)
        List<Airline> found = null;
        // 3. build response, add the cookie, headers, ...
        return found.isEmpty() ?
                ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
                ResponseEntity.ok(found);
    }

    // status: 201 - Created
    // wrong case: ???
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody AirlineCreateRq rq) {
        // service.create(rq)
        throw new IllegalStateException("not implemented");
    }

    // status: 201 - Created
    // wrong case: ???
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create2(@RequestBody Airline airline) {
        airline.setId(null); // fix to guarantee id is not provided
        // service.create(airline)
        throw new IllegalStateException("not implemented");
    }

    // status: 200 - OK
    //         404 - if id not found
    @PutMapping("{id}")
    public void modify(@PathVariable UUID id, @RequestBody AirlineUpdateRq rq) {
        // service.modify(id, rq)
        throw new IllegalStateException("not implemented");
    }

    // status: 200 - OK
    //         404 - if id not found
    @PutMapping("{id}")
    public void modify2(@PathVariable UUID id, @RequestBody Airline airline) {
        airline.setId(Optional.ofNullable(id));
        // service.modify(airline)
        throw new IllegalStateException("not implemented");
    }

    // status: 200 - OK
    //         404 - if id not found
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        // ...
        Optional<String> data = null; // service.delete(id)
        // ...
        return data.map(x -> ResponseEntity.ok().build())
                .orElseGet(() -> ResponseEntity.notFound().build());

// return ResponseEntity.of(data); // 200 vs 404
// return ResponseEntity.of(data); // 200 vs 404 - always implies body
    }

}


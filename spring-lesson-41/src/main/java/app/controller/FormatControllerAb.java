package app.controller;

import app.model.Line;
import app.service.Formatter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fmt2")
public class FormatControllerAb {

    // WAY #3
    private final Formatter f;

    public FormatControllerAb(@Qualifier("formatterBrackets") Formatter f) {
        this.f = f;
    }


//  http://localhost:8080/fmt2/Jim

    @GetMapping("{name}")
    public Line handle(@PathVariable String name){
        name = f.format(name);
        return new Line(name, 13.34);
    }
}



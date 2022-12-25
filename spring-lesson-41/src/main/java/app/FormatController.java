package app;

import app.model.Line;
import app.service.Formatter;
import app.service.FormatterUpper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("fmt")
public class FormatController {

    // WAY #1
//    private final Formatter f;
    private final FormatterUpper f;

    @GetMapping("{name}")
    public Line handle(@PathVariable String name){
        name = f.format(name);
        return new Line(name, 13.34);
    }
}



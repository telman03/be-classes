package app;

import app.model.Line;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 *  @RestController = @Controller + @ResponseBody
 */

@Controller
public class PageController {
    // http://localhost:8080/page
    @GetMapping("page")
    public String page_handle(Model model){
        return "page01";
    }

    // http://localhost:8080/item
    @ResponseBody
    @GetMapping("item")
    public Line handle_entity1(){
        return new Line("Macbook Pro", 2599.99);
    }


    // http://localhost:8080/item2

    @GetMapping("item2")
    public ResponseEntity<Line> handle_entity2(){
        return ResponseEntity.ok(
                new Line("Macbook Pro", 2500.4)
                );
    }

    // http://localhost:8080/item3
    @GetMapping("item3")
    public ResponseEntity<Line> handle_entity3(){
        // 404 - Optional.empty
        // 200 - Optional.of (Non empty)
        ResponseEntity.status(HttpStatus.CREATED).body("good");
        return ResponseEntity.of(
                Optional.empty()
//                Optional.of(new Line("Macbook Pro", 2600.00))
        );
    }
}

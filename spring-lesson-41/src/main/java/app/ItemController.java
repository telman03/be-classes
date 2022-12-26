package app;

import app.model.Line;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 *  @RestController = @Controller + @ResponseBody
 *
 *
 */

@RestController
@RequestMapping("product")
public class ItemController {
    // http://localhost:8080/product/item5
    @GetMapping("item5")
    public Line handle_entity1(){
        return new Line("Macbook Pro", 2599.99);
    }

}

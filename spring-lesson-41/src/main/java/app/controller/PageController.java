package app.controller;

import app.model.Header;
import app.model.Line;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

/**
 *  @RestController = @Controller + @ResponseBody
 */

@Controller
public class PageController {
    // http://localhost:8080/page
    @GetMapping("page")
    public String page_handle(Model model){
        model.addAttribute("header", new Header("Product name", "Product price"));
        model.addAttribute("lines", Arrays.asList(
                new Line("Iphone 11", 1500.0),
                new Line("Iphone X", 1750.0),
                new Line("Iphone 13", 2000.0),
                new Line("Iphone 14", 2250.0)
        ));
        return "page01";
    }


}

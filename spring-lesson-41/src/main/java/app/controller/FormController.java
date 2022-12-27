package app.controller;

import app.model.FormLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("fm")
public class FormController {

    // http://localhost:8080/fm
    @GetMapping
    public String form_show() {
        return "form1";
    }

    @PostMapping("process")
    @ResponseBody
    public String form_process(FormLogin form) {
        return String.format("Got the form: %s", form);
    }

}

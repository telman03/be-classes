package app.controller;


import app.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalcController {

    private final CalculatorService calculatorService;

    public CalcController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("add")
    public String add(@RequestParam("x") Integer x, @RequestParam("y") Integer y){
        int result = calculatorService.add(x, y);
        return String.format("%d + %d = %d", x, y, result);
    }

    @GetMapping("integral")
    public String add(@RequestParam("x") Double x){
        double result = calculatorService.integral(x, 5);
        return String.format("integral(%f) = %f", x, result);
    }
}

package ru.karen.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCalculator {
    private final ServiceCalculator calculateService;
    private final ServiceCalculator serviceCalculator;
    private final ServiceCalculator service12;
    @Autowired
    public HelloCalculator(ServiceCalculator calculateService, ServiceCalculator serviceCalculator, ServiceCalculator service12) {
        this.calculateService = calculateService;
        this.serviceCalculator = serviceCalculator;
        this.service12 = service12;
    }

    @GetMapping
    public String Calculator () {
        return calculateService.calculator();
    }

    @GetMapping(path = "/calculator")
    public String writeCalculator () {
        return calculateService.writeCalculator();
    }

    @GetMapping(path = "/plus?num1=5&num2=5")
    public Integer plus(@RequestParam ("5") Integer num1, @RequestParam ("5") Integer  num2) {
        return calculateService.plus(5, 5);
    }

    @GetMapping(path = "/minus?num1=5&num2=5")
    public Integer minus(@RequestParam ("5") Integer num1, @RequestParam ("5") Integer  num2) {
        return calculateService.minus(5, 5);
    }

    @GetMapping(path = "/multiply?num1=5&num2=5")
    public Integer multiply(@RequestParam ("5") Integer num1, @RequestParam ("5") Integer  num2) {
        return calculateService.multiply(5, 5);
    }

    @GetMapping(path = "/divide?num1=5&num2=5")
    public Integer divide(@RequestParam ("5") Integer num1, @RequestParam ("5") Integer  num2) {
        return calculateService.divide(5, 5);
    }
}

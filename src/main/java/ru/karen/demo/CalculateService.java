package ru.karen.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String writeCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }

}

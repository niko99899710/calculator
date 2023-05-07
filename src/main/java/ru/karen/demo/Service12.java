package ru.karen.demo;

import org.springframework.stereotype.Service;

@Service
public class Service12 implements ServiceCalculator {
    @Override
    public String calculator() {
        return null;
    }
    @Override
    public String writeCalculator() {
        return null;
    }
    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }
    @Override
   public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }
    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }
    @Override
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}

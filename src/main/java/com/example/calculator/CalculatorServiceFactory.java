package com.example.calculator;

public class CalculatorServiceFactory {
    public CalculatorServiceInterface getService(){
        return new CalculatorService();
    }
}

package com.example.calculator;

public class InputModifier implements InputModifierInterface {
    public String[] modifyInput(String input){
        input=input.replaceAll("\\s",",");
        input=input.replaceAll("-,,-","+");
        return input.split(",");
    }
}

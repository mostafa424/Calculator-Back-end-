package com.example.calculator;

public class InputModifierFactory {
    public InputModifierInterface getModifier(){
        return new InputModifier();
    }
}

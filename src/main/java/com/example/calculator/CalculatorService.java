package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {
        public float add ( float a, float b){
        return a + b;
        }
        public float sub ( float a, float b){
        return a - b;
        }
        public float mult ( float a, float b){
        return a * b;
        }
        public float power ( float a, float b){
                return (float)Math.pow(a,b);
        }
        public float div ( float a, float b){
              return a / b;
        }
        public float square(float a){return (float)Math.pow(a,2);}
        public float squareRoot(float a){return (float)Math.sqrt(a);}
    }


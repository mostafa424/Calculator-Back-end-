package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}
	@PostMapping("/CalculatorController")
	public String calculatorController(@RequestBody String exp){
		InputModifierInterface modifier=new InputModifierFactory().getModifier();
		String[]input= modifier.modifyInput(exp);
		int i=0;
		CalculatorServiceInterface calcService=new CalculatorServiceFactory().getService();
			try{
				if(input.length==1){return exp;}
				 if(input.length==2){
					switch(input[input.length-1]){
						case "^2": input[0]=String.valueOf(calcService.square(Float.parseFloat(input[0])));break;
						case "r": input[0]=String.valueOf(calcService.squareRoot(Float.parseFloat(input[0])));break;
					}
					return input[0];
				}
				while (i + 2 < input.length) {
					switch (input[i + 1]) {
						case "+":
							input[i + 2] = String.valueOf(calcService.add(Float.parseFloat(input[i]), Float.parseFloat(input[i + 2])));
							break;
						case "-":
							input[i + 2] = String.valueOf(calcService.sub(Float.parseFloat(input[i]), Float.parseFloat(input[i + 2])));
							break;
						case "*":
							input[i + 2] = String.valueOf(calcService.mult(Float.parseFloat(input[i]), Float.parseFloat(input[i + 2])));
							break;
						case "/":
							if(input[i+2].equals("0")){return "E";}
							else{input[i + 2] = String.valueOf(calcService.div(Float.parseFloat(input[i]), Float.parseFloat(input[i + 2])));}
							break;
						case "^":
							input[i + 2] = String.valueOf(calcService.power(Float.parseFloat(input[i]), Float.parseFloat(input[i + 2])));
							break;

					}
					i += 2;
				}

			return input[input.length-1];
	}catch(Exception e){return "E";}}
}

package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		//System.out.println("Hello world");
		StandardCalculator calc = new StandardCalculator();
        calc.add(Double.MAX_VALUE, Double.MAX_VALUE); 

        System.out.println(calc.getResult());
		calc.subtract(Double.MAX_VALUE, Double.MAX_VALUE);
        System.out.println(calc.getResult());
		// calc.multiply(3, 2);
        // System.out.println(calc.getResult());
		// calc.divide(4, 2);
        // System.out.println(calc.getResult());
	}

}

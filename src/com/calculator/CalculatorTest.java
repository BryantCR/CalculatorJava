package com.calculator;


public class CalculatorTest {

	public static void main( String args[] ){
		
		Calculator A = new Calculator();
		Calculator B = new Calculator();
		Calculator C = new Calculator();
		Calculator D = new Calculator();
		
		A.setNumber(2);
		A.setNumber2(8);
		A.setOperator("+");
		A.operation();
		A.getResults();
		
		B.setNumber(10);
		B.setNumber2(8);
		B.setOperator("-");
		B.operation();
		B.getResults();
		
		C.setNumber(20);
		C.setNumber2(20);
		C.setOperator("");
		C.operation();
		C.getResults();
		
	}
	
	
}

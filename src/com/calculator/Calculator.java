package com.calculator;

public class Calculator {
	// Atributes
	private double result;
	private double Data1;
	private double Data2;
	private String operator; 
	
	// Controller
	public Calculator() {
		this.result = 0;
		this.Data1 = 0;
		this.Data2 = 0;
		this.operator = "";
	}
	//Getters
	
	
	
	//Setters
	public void setNumber(double input) {
		this.Data1 = input;
	}
	
	public void setNumber2(double input) {
		this.Data2 = input;
	}
	
	public void setOperator(String input) {
		this.operator = input;
	}
	
	public void operation() {
		if( operator == "+" || operator == "-" ) {
			
			if( this.operator == "+"){
				result = Data1 + Data2;
			}
			else if( this.operator == "-"){
				result = Data1 - Data2;
			}
		}
		else {
			System.out.println("You must use a valid operator as: + or - ");
		}
	}
	
	// Print
	public void getResults() {
		System.out.println(result);
	}
}

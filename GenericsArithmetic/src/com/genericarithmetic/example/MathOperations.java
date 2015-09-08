package com.genericarithmetic.example;

public class MathOperations {

	public static void main(String[] args) {
		Integer firstIntOperand = 5;
		Integer secondIntOperand = 4;
		String operator = "+";
		CalcInt calcInt = new CalcInt();
		System.out.println(calcInt.calculate(firstIntOperand, secondIntOperand, "-"));
	}
}

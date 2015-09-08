package com.genericarithmetic.example;

public class CalcInt implements Computable<Integer> {

	public Integer calculate(Integer operand1, Integer operand2, String operator) {
		switch (operator) {
		case ("+"):
			Integer resultSum = add(operand1, operand2);
			return resultSum;
		case ("-"):
			Integer resultSubtract = subtract(operand1, operand2);
			return resultSubtract;
		case ("*"):
			Integer resultMultiply = multiply(operand1, operand2);
			return resultMultiply;
		case ("/"):
			Integer resultDivide = divide(operand1, operand2);
			return resultDivide;
		default:
			return null;
		}
	}

	@Override
	public Integer add(Integer operand1, Integer operand2) {
		return operand1 + operand2;
	}

	@Override
	public Integer subtract(Integer operand1, Integer operand2) {
		return operand1 - operand2;
	}

	@Override
	public Integer multiply(Integer operand1, Integer operand2) {
		return operand1 * operand2;
	}

	@Override
	public Integer divide(Integer operand1, Integer operand2) {
		return operand1 / operand2;
	}

}

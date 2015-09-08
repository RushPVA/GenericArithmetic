package com.genericarithmetic.example;

public class CalcInt implements Computable<Integer> {

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

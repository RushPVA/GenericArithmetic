package com.genericarithmetic.example;

public class CalcDouble implements Computable<Double> {

	@Override
	public Double add(Double operand1, Double operand2) {
		return operand1+operand2;
	}

	@Override
	public Double subtract(Double operand1, Double operand2) {
		return operand1-operand2;
	}

	@Override
	public Double multiply(Double operand1, Double operand2) {
		return operand1*operand2;
	}

	@Override
	public Double divide(Double operand1, Double operand2) {
		return operand1/operand2;
	}

}

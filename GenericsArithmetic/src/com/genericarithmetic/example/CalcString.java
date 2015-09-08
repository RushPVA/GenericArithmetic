package com.genericarithmetic.example;

public class CalcString implements Computable<String> {

	@Override
	public String add(String operand1, String operand2) {
		return operand1+operand2;
	}

	@Override
	public String subtract(String operand1, String operand2) {
		return operand1.substring(operand2.length());
	}

	@Override
	public String multiply(String operand1, String operand2) {
		StringBuilder sb = new StringBuilder(operand1);
		sb.append(operand1).insert(operand1.length(), operand2);
		return sb.toString();
	}

	@Override
	public String divide(String operand1, String operand2) {
		StringBuilder sb = new StringBuilder(operand1);
		sb.reverse();
		return sb.toString();
	}

}

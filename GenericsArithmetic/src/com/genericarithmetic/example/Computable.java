package com.genericarithmetic.example;

public interface Computable <T> {
	
	T add(T operand1, T operand2);
	T subtract(T operand1, T operand2);
	T multiply(T operand1, T operand2);
	T divide(T operand1, T operand2);
}

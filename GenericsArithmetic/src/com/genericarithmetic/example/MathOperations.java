package com.genericarithmetic.example;

import java.util.ArrayList;
import java.util.Vector;

public class MathOperations {

	public static void main(String[] args) {
		Integer firstIntOperand = 5;
		Integer secondIntOperand = 4;
		CalcInt calcInt = new CalcInt();
		System.out.println(calcInt.add(firstIntOperand, secondIntOperand));
		
		CalcDouble calcDouble = new CalcDouble();
		Double firstDoubleOperand = 7.45;
		Double secondDoubleOperand = 4.34;
		System.out.println(calcDouble.divide(firstDoubleOperand, secondDoubleOperand));
		
		CalcString calcString = new CalcString();
		String firstStringOperand = "Can't touch ";
		String secondStringOperand = "this";
		System.out.println(calcString.add(firstStringOperand, secondStringOperand));
		System.out.println(calcString.subtract(firstStringOperand, secondStringOperand));
		System.out.println(calcString.multiply(firstStringOperand, secondStringOperand));
		System.out.println(calcString.divide(firstStringOperand, secondStringOperand));
		
				
		Vector<Integer> vector1 = new Vector<>();
		vector1.add(5);
		vector1.add(3);
		System.out.println(vector1);
		Vector<Integer> vector2 = new Vector<>();
		vector2.add(2);
		vector2.add(-4);
		System.out.println(vector2);
		ArrayList<Vector<Integer>> arrayVector = new ArrayList<>();
		arrayVector.add(vector1);
		arrayVector.add(vector2);
		System.out.println(arrayVector);
	}
}

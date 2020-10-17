package com.syntax.class02;

public class ArithmeticOperators {
//	Arithmetic Operators:

//	+ addition
//	- subtraction
//	* multiplication
//	/ division
//	% modulus operator will help us to find the remainder

//	0.00 decimal десятичный
//	0 whole number
//	0.0000 -> 0.0 rounded

	public static void main(String[] args) {

		int num1, num2;// declare variables
		num1 = 10;
		num2 = 12;// assign variables
		System.out.println(num1 + num2);// 22
		System.out.println(num2 - num1);// 2

		double num3 = 10.99;
		double num4 = 2.99;
		double mult = num3 * num4;
		System.out.println(mult);
		
		double div = num3 / num4;
		System.out.println("The result of division of 2 double values is "+div);//3.6755852842809364
		
		float f=10.99f;
		float f1=2.99f;
		System.out.println("The result of division of 2 float values is "+f/f1);//3.6755853

	}
}

package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {

		int numA = 10;
		int numB;// declaration; happens only once
		numA = 11;// initialization/assign value
		numA = 12;// reassign

		String str1 = "Hello";
		String str2 = "Friends";
		System.out.println(str1 + " " + str2);
		
//      Assignment Operator:
//		=
		
//		Arithmetic Operators:
//		+ addition
//		- subtraction
//		* multiplication
//		/ division
//		% modulus operator will help us to find the remainder
//		0.00 decimal десятичный
//		0 whole number
//		0.0000 -> 0.0 rounded
		
//		Compound or Shorthand Operators:
//		+=
//		-=
//		*=
//		/=
//		%=
		
//		Relational & Equality Operators:
//		> >= < <= == !=
		

		int num1, num2;
		num1 = 100;
		num2 = 200;
		int result = num1 - num2;
		System.out.println(result);

		int whatNumber = 10 + 10 * 10;
		System.out.println(whatNumber);// 110

		int whatNumber1 = (10 + 10) * 10;
		System.out.println(whatNumber1);// 200

		double d = 12.99;
		double e = 2.5;
		double div = d / e;
		System.out.println("Division of 2 double values = " + div);// 5.196

		int a = 12;
		int b = 5;
		System.out.println(a/b);//2, int = whole number
		int result1 = a/b;
		System.out.println(result1);//2
		float result2 = a/b;
		System.out.println(result2);//2.0
		double result3 = a/b;
		System.out.println(result3);//2.0
		
		System.out.println(a%b);//2
		System.out.println(a/b);//2

		
		a = 12;
		b = 7;
		System.out.println(a%b);//5
		System.out.println(a/b);//1

		
		a = 12;
		b = 4;
		System.out.println(a%b);//0
		System.out.println(a/b);//3
		
//		
		
		




	}

}

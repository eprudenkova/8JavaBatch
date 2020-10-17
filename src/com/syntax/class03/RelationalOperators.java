package com.syntax.class03;

public class RelationalOperators {

//	    Relational & Equality Operators:
//		> >= < <= == !=

	public static void main(String[] args) {

		int a = 10;
		int b = 15;
		System.out.println(a > b);//f
		System.out.println(a < b);//t
		System.out.println(a == b);//f
		System.out.println(a != b);//t

		int x = 100;
		int y = 90;
		boolean result = x > y;
		System.out.println(result);//t

		result = x == y;// 2 different operators
		System.out.println(result);//f
		
		System.out.println(x==y);//false
		System.out.println(x=y);//reassign x=100 --> x=90
		
		boolean result1 = x==y;
		System.out.println(result1);//true !!! because of 26

		
		byte num =10;
		byte num1 = 11;
		
		boolean boo = num>num1;
		System.out.println(boo);//false
		a=10;
		b=10;
		boolean boo1 = a>=b;
		System.out.println("Result of boo1 = "+boo1);//true
	}

}

package com.syntax.class06;

public class NotOperator {

//	NOT operator --> reverse the condition

	public static void main(String[] args) {

		boolean b = true;
		System.out.println(b);// true

		boolean anotherBoolean = false;
		System.out.println(anotherBoolean);// false

		boolean b1 = !true;
		System.out.println(b1);// false =!

		boolean anotherBoolean1 = !false;
		System.out.println(anotherBoolean1);// true =!

		boolean isCold = true;
		if (!isCold) {
			System.out.println("isCold = false --> It is NOT cold");
			System.out.println("I am going to the beach");
		} else {
			System.out.println("isCold = true --> It is cold");
			System.out.println("I stay home");
		}
	}
}

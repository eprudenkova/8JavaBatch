package com.syntax.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		boolean isSaturday = false;
		if (isSaturday)
			System.out.println("Taday is a Java class");// if no braces only 1 line will be treated as code for if block
		System.out.println("And tomorrow I will have a Java class");// this code does not belong to the if statement
																	// (because no braces)
		System.out.println("I am a code outside if statement");
	}

}

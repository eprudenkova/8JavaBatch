package com.syntax.class02;

public class Task2 {

//	Write a Java program to add, subtract, multiply and divide 2 decimal values. 
//	Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
//
//
//	Write a program to find the square of the number 3.9. 
//	You program should say “The square of the ____ is ____ ”
//
//
//	Write a program to print the area and perimeter of a rectangle 
//	with width = 5 and  height = 8. Your program should say. “The perimeter of a rectangle 
//	with width ___ and height ____ is equal to _____ and the area is __”

	public static void main(String[] args) {
//		1.
		double num1 = 10.99;
		double num2 = 1.99;
		double add = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		System.out.println("The add of 2 numbers " + num1 + " and " + num2 + " is equal to " + add);
		System.out.println("The subtract of 2 numbers " + num1 + " and " + num2 + " is equal to " + sub);
		System.out.println("The multiply of 2 numbers " + num1 + " and " + num2 + " is equal to " + mult);
		System.out.println("The divide of 2 numbers " + num1 + " and " + num2 + " is equal to " + div);
//		2.
		double num3 = 3.9;
		double square = num3 * num3;
		System.out.println("The square of the " + num3 + " is " + square);
//		3.
		int w = 5;
		int h = 8;
		int area = w * h;
		int perimeter = (w + h) * 2;
		System.out.println("The perimeter of a rectangle with width " + w + " and height " + h + " is equal to "
				+ perimeter + " and the area is equal to " + area + ".");

	}
}

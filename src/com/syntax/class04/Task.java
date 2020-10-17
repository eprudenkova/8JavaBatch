package com.syntax.class04;

public class Task {

	public static void main(String[] args) {

//		1. Create a Java program and declare int variable that will hold a month.
//		Based on the value of the variable your program should print the name of the month.
//		2. Write a program to check whether number is positive or negative.
//		3. Write a Java Program to check whether number is Even or Odd.

//		1.
		int month = 1;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid month");
		}

//		2.
		int number = 0;
		if (number > 0) {
			System.out.println(number + " is positive number");
		} else if (number < 0) {
			System.out.println(number + " is negative number");
		} else {
			System.out.println("The number is 0");
		}

//		3.
		int num = 0;
		if (num % 2 == 0) {
			System.out.println(num + " is Even number");
		} else if (num % 2 != 0) {
			System.out.println(num + " is Odd number");
		}

	}

}

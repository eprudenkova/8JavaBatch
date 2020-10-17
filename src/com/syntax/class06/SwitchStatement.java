package com.syntax.class06;

import java.util.Scanner;

public class SwitchStatement {

//	Java Conditional Statements

//	Conditional Statements are used to insert verification points and error handling.

//	Two types of Conditional Statements in Java

//	1) if statement
//	2) switch statement
	
//	Switch statement executes one statement from multiple conditions.
//	A switch works with the byte, short, char, int and String.
	
//	NO boolean, float, double, long!!!
	
//	Duplicate cases are NOT allowed!!!

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a day number");
		int day = scan.nextInt();

		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we have Manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday we have Manual class");
		} else if (day == 4) {
			System.out.println("Today is Thursday we have Review class");
		} else if (day == 5) {
			System.out.println("Today is Friday we have no class");
		} else if (day == 6) {
			System.out.println("Today is Saturday we have Java class");
		} else if (day == 7) {
			System.out.println("Today is Sunday we have Java class");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println("---SAME EXAMPLE WITH SWITH CASE---");

		String today;

		switch (day) {// data type of variable must match with data type of cases
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today = "Invalid day";
			break;// is optional since it is a last statement
		}
		System.out.println("Today is " + today);
	}
}

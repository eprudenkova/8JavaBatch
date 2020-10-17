package com.syntax.class06;

import java.util.Scanner;

public class HW2_Grade {

//	2. Allow user to enter grade and then provide explanation:
//	A - excellent, B - good, C - average, D - bad, any other grade --> not acceptable.
//	At the end of your program should print each grade was entered by a user with explanation.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String grade;
		String message;
		System.out.println("Please enter your grade");
		grade = input.next().toUpperCase();
		switch (grade) {
		case "A":
			message = "You grade is A - excellent";
			break;
		case "B":
			message = "You grade is B - good";
			break;
		case "C":
			message = "You grade is C - average";
			break;
		case "D":
			message = "You grade is D - bad";
			break;
		default:
			message = "Grade is not acceptable";
			break;
		}
		System.out.println(message);
	}
}

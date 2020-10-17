package com.syntax.class05;

import java.util.Scanner;

public class Task6_Improved {

//	6. Write a program for user to enter his/hers birth month. Based on the month define the season.
//	Example: if user is born in June, July or August → season =”Summer”.
//	At the end of the program we should see output as “You were born ______”.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String month;
		String season = null;

		System.out.println("Please enter your birth month");
		month = input.next();
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January")
				|| month.equalsIgnoreCase("February")) {
			season = "Winter";
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				|| month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Fall";
		} else {
			season = "Invalid month";
		}
		System.out.println("You were born in " + season);

		if (season.equals("Summer")) {
			System.out.println("You are lucky");
		}
	}
}

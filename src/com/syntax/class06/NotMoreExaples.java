package com.syntax.class06;

public class NotMoreExaples {

	public static void main(String[] args) {

		boolean isJavaEasy = false;
		if (!isJavaEasy) {
			System.out.println("Keep study");
		} else {
			System.out.println("Good for you");
		}

		System.out.println("---");

//		Sunday
		String day = "Sunday";
		if (!day.equals("Sunday")) {
			System.out.println("Today is NOT Sunday, I am going to work");
		} else {
			System.out.println("Today is Sunday");// output
		}

//		Monday
		String day1 = "Monday";
		if (!day1.equals("Sunday")) {
			System.out.println("Today is NOT Sunday, I am going to work");// output
		} else {
			System.out.println("Today is Sunday");
		}

//		Monday
		String day2 = "Monday";
		if (!(day2.equals("Sunday") || day2.equals("Saturday"))) {
			System.out.println("Today is NOT Sunday or Saturday, I am going to work");// output
		} else {
			System.out.println("Today is Sunday or Saturday");
		}
	}
}

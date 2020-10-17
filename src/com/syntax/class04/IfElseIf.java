package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

//		We need to compare 2 numbers:
//		bigger, smaller, equal

		int num1 = 99;
		int num2 = 99;
//		next we will have to compare
		if (num1 > num2) {// this true
			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 < num2) {// or this true
			System.out.println(num1 + " is smaller than " + num2);
		} else {// all false
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("---");

//		Based on the day of the week we will print class schedule

		int day = 8;
//		if(day=1) {//error, if works only w/ boolean expressions
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
//		} else {
//			System.out.println("Invalid day");
		}

	}

}

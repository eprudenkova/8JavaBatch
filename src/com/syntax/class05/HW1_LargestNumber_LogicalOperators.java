package com.syntax.class05;

import java.util.Scanner;

public class HW1_LargestNumber_LogicalOperators {

//	1. Write a program to find max of three double values using if-else..if 
//	and logical operators provided by a user (numbers must be distinct)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three distinct double values");
		double num1, num2, num3, max;
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		max = 0.00;
//		1st way
//		if (num1 > num2 && num1 > num3) {
//			max = num1;
//		} else if (num2 > num3) {
//			max = num2;
//		} else {
//			max = num3;
//		}
//		System.out.println("The largest number is " + max);

//		2nd way --> two nearest numbers are equal
//		if (num1 != num2 && num2 != num3) {// !=&&!=
//
//			if (num1 > num2 && num1 > num3) {
//				max = num1;
//			} else if (num2 > num3) {
//				max = num2;
//			} else {
//				max = num3;
//			}
//			System.out.println("The largest number is " + max);
//
//		} else {
//			System.out.println("Numbers are equal");
//		}
//		3rd way --> 3 numbers are equal
		if (!(num1 == num2 && num2 == num3)) {// !(==&&==) //true && true = TRUE ! FALSE --> else part

			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
			System.out.println("The largest number is " + max);

		} else {
			System.out.println("Numbers are equal");
		}
	}
}

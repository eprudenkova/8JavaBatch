package com.syntax.class05;

import java.util.Scanner;

public class HW2_LargestNumber_NestedIf {

//	2. Write a program to find max number among three numbers 
//	using nested if provided by a user (numbers must be distinct)

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three distinct numbers");
		int num1, num2, num3, max;
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		max = 0;
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("The largest number is " + max);

		input.close();//to close scanner
	}
}

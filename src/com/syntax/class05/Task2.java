package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

//	Write a program to ask user to enter numbers of worked years and annual salary.
//	If user worked for more or equals to 5 years than user is eligible for the bonus, 
//	otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, 
//	otherwise bonus=3000.

	public static void main(String[] args) {
		Scanner scan;
		int workedYears;
		double annualSalary;

		scan = new Scanner(System.in);
		System.out.println("Please enter numbers of worked years");
		workedYears = scan.nextInt();
		if (workedYears >= 5) {
			System.out.println("You are eligible for the bonus");
			System.out.println("Please enter annual salary");
			annualSalary = scan.nextDouble();
			if (annualSalary > 50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		} else {
			System.out.println("You are NOT eligible for the bonus");
		}
	}
}

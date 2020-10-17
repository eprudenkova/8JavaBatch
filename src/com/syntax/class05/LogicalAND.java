package com.syntax.class05;

import java.util.Scanner;

public class LogicalAND {

//	I need to define whether number that is entered from user
//	small number is a number between 1 to 10
//	medium number is a number between 11 to 100
//	large number is a number between 101 to 1000

	public static void main(String[] args) {

		Scanner input;
		int number;
		input = new Scanner(System.in);
		System.out.println("Please enter any number");
		number = input.nextInt();

		if (number > 0 && number <= 10) {//T AND F = false
			System.out.println(number + " is small number");
		} else if (number > 10 && number <= 100) {// T AND T = TRUE
			System.out.println(number + " is medium number");
		} else if (number > 100 && number <= 1000) {// F AND F = false
			System.out.println(number + " is large number");
		}
	}
}

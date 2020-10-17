package com.syntax.class06;

import java.util.Scanner;

public class HW3_Calculator {

//	3.Using scanner class create calculator. 
//	Allow user to enter 2 numbers and operator(+,-,*,/).
//	Based on operator provide the result to user.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, result;
		char operator;

		System.out.println("Please enter first number");
		num1 = input.nextInt();

		System.out.println("Please enter any operator (+,-.*,/)");
		operator = input.next().charAt(0);

		if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
			System.out.println("Invalid operator");

		} else {

			System.out.println("Please enter second number");
			num2 = input.nextInt();

			if (num2 == 0 && operator == '/') {
				System.out.println("Dividing by zero");

			} else {

				switch (operator) {

				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				default:
					result = 0;
				}

				System.out.println("The result is " + result);
			}
		}
	}
}
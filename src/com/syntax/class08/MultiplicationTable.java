package com.syntax.class08;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int result = 0;
		int a;
		int b;
		for (a = 1; a <= 10; a++) {
			for (b = 1; b <= 10; b++) {
				result = a * b;
				System.out.println(a + " * " + b + " = " + result);
			}
		}
		System.out.println("---");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = input.nextInt();
		int mult;
		for (int i = 1; i <= 10; i++) {
			mult = i * num;
			System.out.println(num + " * " + i + " = " + mult);
		}
	}
}

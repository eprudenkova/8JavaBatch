package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberWhile {
//	play a lottery where we need to enter number 1-100
//	lucky is 7
//	keep asking until 7

	public static void main(String[] args) {

		Scanner scan;
		int numUser;
		int numLucky = 7;

		scan = new Scanner(System.in);
		System.out.println("Please enter a number 1-100");
		numUser = scan.nextInt();

		while (numUser != numLucky) {
			System.out.println("Please enter a number 1-100");
			numUser = scan.nextInt();
		}
		System.out.println("You won!");
	}
}

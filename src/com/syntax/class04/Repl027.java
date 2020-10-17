package com.syntax.class04;

import java.util.Scanner;

public class Repl027 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age ");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}

}

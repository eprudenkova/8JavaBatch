package com.syntax.class06;

import java.util.Scanner;

public class Repl036_AndOrNone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word1, word2, output;
		int num1, num2;
		System.out.println("Please enter two strings");
		word1 = input.next();
		word2 = input.next();
		System.out.println("Please enter two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if (num1 == num2 && word1.equals(word2)) {
			output = "AND";
		} else if (num1 == num2 || word1.equals(word2)) {
			output = "OR";
		} else if (num1 != num2 && (!word1.equals(word2))) {
			output = "NONE";
		} else {
			output = null;
		}
		System.out.println(output);
	}
}

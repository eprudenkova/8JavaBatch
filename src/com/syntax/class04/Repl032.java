package com.syntax.class04;

import java.util.Scanner;

public class Repl032 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		String gender = input.next();
		System.out.println("Please enter your age");
		int age = input.nextInt();
		if (age > 25) {
			if (gender.equals("M")) {
				System.out.println("Man");
			} else {
				System.out.println("Woman");
			}
		} else {
			if (gender.equals("M")) {
				System.out.println("Boy");
			} else {
				System.out.println("Girl");
			}
		}
	}
}

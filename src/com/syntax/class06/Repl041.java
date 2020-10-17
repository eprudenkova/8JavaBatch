package com.syntax.class06;

import java.util.Scanner;

public class Repl041 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String activity = null;
		System.out.println("enter the age of the Child");
		age = input.nextInt();
		if (age < 1 || age > 4) {
			System.out.println("I don't know how old you are");
		} else {
			switch (age) {
			case 1:
				activity = "Crawl";
				break;
			case 2:
				activity = "Talk";
				break;
			case 3:
				activity = "Dance";
				break;
			case 4:
				activity = "get  Trouble";
				break;
			}
			System.out.println("You can " + activity);
		}
	}
}

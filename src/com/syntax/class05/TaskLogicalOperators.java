package com.syntax.class05;

import java.util.Scanner;

public class TaskLogicalOperators {

//	if day is 1 or 5 --> day off
//	if day is 2 or 3 --> Git class
//	if day is 6 or 7 --> Java class
//	if day is 4 --> Review class
//	 other --> Invalid day

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number of day");
		int day = scan.nextInt();
		if (day == 1 || day == 5) {
			System.out.println("Day off");
		} else if (day == 2 || day == 3) {
			System.out.println("Git class");
		} else if (day == 6 || day == 7) {
			System.out.println("Java class");
		} else if (day == 4) {
			System.out.println("Review class");
		} else {
			System.out.println("Invalid day");
		}
	}
}

package com.syntax.class08;

import java.util.Scanner;

public class TaskSumEvenOdd {

//	write a program that reads a range of integers (start and end point),
//	provided by a user
//	and then from that range prints the sum of the even and odd integers.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter start and end point");
		int start, end;
		int sumEven = 0;
		int sumOdd = 0;
		start = input.nextInt();
		end = input.nextInt();
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("The sum of even numbers from " + start + " to " + end + " = " + sumEven);
		System.out.println("The sum of odd numbers from " + start + " to " + end + " = " + sumOdd);
	}
}

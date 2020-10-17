package com.syntax.class05;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {

//		5.Write a program that will read three inputs of scores
//		(quiz, mid term, and final scores) and determine the grade based on the following rules: 
//			if the average score >=90 → grade=A
//			if the average score >= 70 and <90 → grade=B
//			if the average score>=50 and <70 → grade=C
//			if the average score<50 → grade=F
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quize scores");
		int quize = input.nextInt();
		System.out.println("Please enter your mid term score");
		int midTerm = input.nextInt();
		System.out.println("Please enter your final score");
		int finalScore = input.nextInt();

		int avg = (quize + midTerm + finalScore) / 3;

		if (avg >= 90) {
			System.out.println("Your grade is A");
		} else if (avg >= 70 && avg < 90) {
			System.out.println("Your grade is B");
		} else if (avg >= 50 && avg < 70) {
			System.out.println("Your grade is C");
		} else if (avg < 50) {
			System.out.println("Your grade is D");
		}
	}
}

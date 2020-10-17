package com.syntax.class06;

import java.util.Scanner;

public class Repl035_Loan {

//	For you to do:
//		Create a program that prompt user with question:  "Do you need a loan?"
//		If the result is true then prompt user with question: "What is your credit score?".
//	    Otherwise eligibility is "Unknown"
//		Based on the score define users eligibility:
//		if score is below  600 --> eligibility = "Not eligible"
//		if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
//		if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
//		if score is higher than any other previous values --> eligibility = "Definitely eligible" .   
//
//		Output: The eligibility is ____

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean loan;
		int creditScore;
		System.out.println("Do you need a loan?");
		loan = input.nextBoolean();
		String message;
		if (loan) {
			System.out.println("What is your credit score?");
			creditScore = input.nextInt();
			if (creditScore < 600) {
				message = "Not eligible";
			} else if (creditScore >= 600 && creditScore <= 700) {
				message = "Maybe eligible";
			} else if (creditScore >= 701 && creditScore <= 800) {
				message = "Eligible";
			} else {
				message = "Definitely eligible";
			}
		} else {
			message = "Unknown";
		}
		System.out.println("The eligibility is " + message);
	}
}

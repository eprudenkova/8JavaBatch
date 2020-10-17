package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

//		Nested If - it is If condition inside another If condition

//		if (boolean){
//		code...
//		if(){
//		code..
//		}
//	    }else{
//		}

//		variable for allergy - yes or no
//		if allergy is yes -->
//		pet
//		peanut
//		pollen
//		if no allergy --> you are lucky
		
		System.out.println("-1-");

		boolean allergy = true;
		boolean peanutAllergy = false;
		boolean petAllergy = false;
		boolean pollenAllergy = false;
		if (allergy) {
			System.out.println("Let's do further check");
			if (peanutAllergy) {
				System.out.println("Do not it peanut");
			} else if (petAllergy) {
				System.out.println("No cats");
			} else if (pollenAllergy) {
				System.out.println("Take a drug");
			} else {
				System.out.println("You have to mark your allergy");
			}
		} else {
			System.out.println("You are lucky");

		}

		System.out.println("-2-");

//		if today is Friday we will watch movie but would like to check the date
//		if date is 13 --> scary movie
//		any other date --> comedy
//		if it is no Friday --> study

		boolean dayFriday = false;
		int date = 14;
		boolean dayMonday = false;

		if (dayFriday) {
			System.out.println("Today is Friday! Let's watch the movie!");
			if (date == 13) {
				System.out.println("Scary movie");
			} else {
				System.out.println("Comedy");
			}
		} else {
			System.out.println("Today is not Friday");
			if (dayMonday) {
				System.out.println("It is Monday, I will call Ashley");
			} else {
				System.out.println("And it is not Monday, I will study");
			}
		}
		
		System.out.println("-3-");

	}

}

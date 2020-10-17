package com.syntax.class03;

public class IfStatement {

//	Control Flow:
//	if statement

//	syntax for is statement:

//	if (boolean expression) {
//	      code...
//	}

//	is statement for control flow statement, you have to evaluate (оценить) your condition
//	will be executed only if condition will be true

	public static void main(String[] args) {

        int num1 = 1800;
		int num2 = 1900;

		System.out.println("Start of IfStatement");

		if (num1 > num2) {
			System.out.println("num1 is bigger than num2");
		} else {
			System.out.println("num1 is not bigger than num2");
		}

		System.out.println("End of IfStatement");

		System.out.println("---");

		int temp = 60;
		if (temp > 80) {
			System.out.println("I am going to the beach");
		} else {
			System.out.println("I will stay home");
		}
		
		System.out.println("---");
		
		double expectedHours=20;
		double actualHours=21;
		if(actualHours>=20) {
			System.out.println("I will get a job");
		}else {
			System.out.println("I have to study hard");
		}

	}

}

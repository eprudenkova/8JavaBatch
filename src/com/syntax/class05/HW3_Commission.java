package com.syntax.class05;

import java.util.Scanner;

public class HW3_Commission {
//	You are working in sales and have to calculate commission for the employees;
//
//	You need to ask user a sales amount and based on the amount you need to define their commission
//
//	if user sold products for more than $10 but less than 100 --> commission is 10%
//  if sales is more than 100 but less then 200 --> commission is 20%
//  if sales is more than 200 but less then 500 --> commission is 30%
//  if sales is more than 500 --> commission is 50%
//  You program should print How much in commission user will get

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salesAmount;
		double commission = 0.00;
		System.out.println("Please enter sales amount");
		salesAmount = input.nextDouble();
		if (salesAmount >= 10 && salesAmount < 100) {
			commission = salesAmount * 0.1;
		} else if (salesAmount >= 100 && salesAmount < 200) {
			commission = salesAmount * 0.2;
		} else if (salesAmount >= 200 && salesAmount < 500) {
			commission = salesAmount * 0.3;
		} else if (salesAmount >= 500) {
			commission = salesAmount * 0.5;
		}
		System.out.println("You will get " + commission + "$ commission");
		
//		if you get more than 1K commission --> you are awesome seller
		
		if (commission > 1000) {
			System.out.println("Your are awesome seller");
		}
	}
}

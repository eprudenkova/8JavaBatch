package com.syntax.class08;

import java.util.Scanner;

public class DoWhileTakeYourWater {

	public static void main(String[] args) {

//		ask user to pay for a water
//		water price is $5
//		once user enters money then we need to tell if need more or less
//		once user gives us exact 5 then -> enjoy your water

		Scanner input;
		int money;
		int waterPrice = 5;

		input = new Scanner(System.in);
		System.out.println("Please pay for your water");
		do {
			money = input.nextInt();
			if (money > waterPrice) {
				System.out.println("P;ease give less money");
			} else if (money < waterPrice) {
				System.out.println("Please give more money");
			}
		} while (money != waterPrice);
		System.out.println("Take your water");
	}
}

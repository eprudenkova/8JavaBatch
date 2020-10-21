package com.syntax.class08;

import java.util.Scanner;

public class TaskLeftToPay {

//	Write a program to ask a user to enter item they want to buy and the price of that item.
//	Every time user enters money accumulate the amount and tell the user how much is left to pay off.
//	If user give more money program should return a change.
//	Whenever a user done with payments program should say “Thank you for shopping!”

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String item;
		int price, money, change, more;

		System.out.println("Please enter a item you want to buy and price");
		item = input.nextLine();
		price = input.nextInt();

		System.out.println("Please enter $" + price);
		money = input.nextInt();
		while (money < price) {
			more = price - money;
			System.out.println("Please enter $" + more + " more");
			more = input.nextInt();
			money += more;
		}
		if (money > price) {
			change = money - price;
			System.out.println("Take your change $" + change);
		}
		System.out.println("Take your item");
	}
}

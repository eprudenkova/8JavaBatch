package com.syntax.class06;

import java.util.Scanner;

public class Task_FinalPrice {

//	We are going for shopping:
//	first we check is store has sale:
//	 if no sale --> no shopping
//	 if sale --> we are going for shopping
//	  ask for the price:
//	  if price 10-50 --> 10% discount
//	  if price 50-100 --> 20% discount
//	  if price 100-500 --> 40% discount
//	  if price > 500 --> 50% discount
//	Your program should calculate final price after discount

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isSale;
		double price;
		double finalPrice = 0.00;
		double discount;

		System.out.println("Does the sale start? true/false");
		isSale = input.nextBoolean();

		if (!isSale) {
			System.out.println("No shopping!");

		} else {
			System.out.println("What is the price?");
			price = input.nextDouble();
			if (price >= 10 && price < 50) {
				discount = price * 0.1;
			} else if (price >= 50 && price < 100) {
				discount = price * 0.2;
			} else if (price >= 100 && price < 500) {
				discount = price * 0.4;
			} else if (price >= 500) {
				discount = price * 0.5;
			} else {
				discount = 0;
			}
			finalPrice = price - discount;

			System.out.println("Your product price is $" + price + ", discount is $" + discount + ", final price is $"
					+ finalPrice);
		}
	}
}

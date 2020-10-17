package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {

		double money = 4;
		double icecream = 4.59;

		if (money >= icecream) {
			System.out.println("I buy icecream");
		} else {
			System.out.println("No icecream");
		}
		System.out.println("I am code that executes without any condition");
		
		System.out.println("---");
		
		boolean sleepy = false;
		if(sleepy) {
			System.out.println("Take a nap");
		}else{
			System.out.println("Go study");
		}
		
		System.out.println("---");
		
		boolean hungry = false;
		if (hungry) {
			System.out.println("Go eat");
		}else {
			System.out.println("Keep study");
		}
	}

}

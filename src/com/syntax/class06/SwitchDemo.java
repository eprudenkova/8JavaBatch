package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

//		let's ask a tester on which browser they would like to use

		Scanner scan;
		String browser;
		String message;

		scan = new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser = scan.nextLine().toLowerCase();

		switch (browser) {
		case "safari":
			message = "You code will be executed on Safari";
			break;
		case "chrome":
			message = "You code will be executed on Chrome";
			break;
		case "firefox":
			message = "You code will be executed on FireFox";
			break;
		default:
			message = "Invalid browser";
		}
		System.out.println(message);
		
		System.out.println("---Switch CANNOT work with boolean, double, float, long");
		
		boolean b = true;
		float f = 10.99f;
		double d = 19.99;
		long l = 909909;
//		switch(l) {//CE: cannot switch on a value of type long.
//		}
	}
}

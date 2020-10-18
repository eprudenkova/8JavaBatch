package com.syntax.class08;

public class ForLoop {
	public static void main(String[] args) {

		System.out.println("-Good morning 5 times-");
		for (int i = 1; i <= 5; i++) {// initializing, checking a condition - if true -> increment/decrement
			System.out.println("Good morning");
		}

		System.out.println("--");

		for (int a = 5; a <= 10; a++) {
			System.out.println("Good morning");
		}

		System.out.println("-1 to 10-");
		for (int b = 1; b <= 10; b++) {
			System.out.print(b + " ");
		}

		System.out.println();
		System.out.println("-10 to 1");
		for (int c = 10; c >= 1; c--) {
			System.out.print(c + " ");
		}

		System.out.println();
		System.out.println("---");
		for (int d = 0; d <= 30; d += 3) {
			System.out.print(d + " ");//0 3 6 9 12 15 18 21 24 27 30
		}
	}
}

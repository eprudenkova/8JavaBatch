package com.syntax.class09;

public class Recap {
	public static void main(String[] args) {
//		          1.     2.     8.
		for (int i = 0; i < 5; i++) {// outer loop will control the number of iteration for inner loop
//			3.
			System.out.println("Hello");
//			          4.     5.    7.
			for (int y = 0; y < 3; y++) {// inner loop will do 5 completed iterations
//				6.
				System.out.println("Bye");
			}
		}

		System.out.println("---");

		for (int i = 10; i <= 14; i++) {
			System.out.println(i);
			for (int j = 1; j <= 4; j++) {
				System.out.println(j);
			}
		}
		System.out.println("---");

		for (int i = 10; i <= 14; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.println(i + " " + j);
			}
			System.out.println("---");
		}

		System.out.println("---");

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + "" + j);
			}
			System.out.println("---");
		}

		System.out.println("-clock-");

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":0" + m);
				} else if (h < 10) {
					System.out.println("0" + h + ":" + m);
				} else if (m < 10) {
					System.out.println(h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}
			}
		}
	}
}

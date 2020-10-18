package com.syntax.class08;

public class Task {
	public static void main(String[] args) {

		System.out.println("-1 to 10");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-10 to 1-");
		for (int a = 10; a >= 0; a--) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("-even numbers 20-1 (1 way)-");
		for (int b = 20; b >= 1; b -= 2) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("-even numbers 20-1 (2 way)-");
		for (int c = 20; c >= 1; c--) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
		}
		System.out.println();
		System.out.println("-odd numbers 20-50 (1 way)-");
		for (int d = 21; d <= 50; d += 2) {// !!! start with odd number, because +=2
			System.out.print(d + " ");
		}
		System.out.println();
		System.out.println("-odd numbers 20-50 (2 way)-");
		for (int e = 21; e <= 50; e++) {
			if (e % 2 != 0) {
				System.out.print(e + " ");
			}
		}
	}
}

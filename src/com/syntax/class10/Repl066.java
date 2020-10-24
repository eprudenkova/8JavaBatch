package com.syntax.class10;

public class Repl066 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
			for (int j = i * 2; j <= i * 10; j += i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print((i * j) + " ");
			}

			System.out.println();
		}
	}
}

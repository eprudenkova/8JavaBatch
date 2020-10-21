package com.syntax.class09;

public class Pattern {
//	rows - outer loop
//	columns - inner loop

	public static void main(String[] args) {

		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 6; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---");
		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= 12; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---");
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}

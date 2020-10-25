package com.syntax.class11;

public class GroupTask8_2DArrayOddNumbers {
	public static void main(String[] args) {
//		Create a 2D array to store numbers and calculate sum of all odd numbers.

		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { -9, -10, -11, -12 } };
		for (int[] arr : array) {
			for (int num : arr) {
				if (num % 2 != 0) {
					System.out.print(num + " ");
				}
			}
		}
	}
}

package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {
		int[] array = { -10, -1, -12, -8, -2, -77, -56 };
		int max = array[0];
		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("The largest number is " + max);

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The largest number is " + max);
	}
}

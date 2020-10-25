package com.syntax.class11;

public class GroupTask5_SecondLargestNumber {
	public static void main(String[] args) {
//		Write a java program to find the second largest number in the array?

		int[] array = { -9, -3, -13, -76, -45, -6, 10 };
		int max = array[0];
		int min = array[0];
		int max2 = array[0];
		for (int num : array) {
			if (num > max) {
				max2 = max;
				max = num;
			}
			if (num > max2 && num != max) {
				max2 = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("The max number in the array is " + max);
		System.out.println("The second max number in the array is " + max2);
		System.out.println("The min number in the array is " + min);

	}

}

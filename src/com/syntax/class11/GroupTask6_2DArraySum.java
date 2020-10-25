package com.syntax.class11;

public class GroupTask6_2DArraySum {
	public static void main(String[] args) {
//		Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.

		int sum=0;
		int[][] array = { { 10, 20, 30 }, { 10, 20, 30 } };
		for (int[] arr : array) {
			for (int num : arr) {
				sum=sum+num;
			}
		}
		System.out.println("The sum of the numbers from 2D Array is "+sum);
	}
}

package com.syntax.class11;

public class GroupTask4_MaxMinArray {
	public static void main(String[] args) {

//	Maximum and minimum number in the array?

		int[] array = { 9, 3, 13, -76, -45, -6, 0 };
		int max = array[0];
		int min = array[0];
		for (int num : array) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("The max number in the array is " + max);
		System.out.println("The min number in the array is " + min);
	}
}

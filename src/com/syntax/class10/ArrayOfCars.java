package com.syntax.class10;

public class ArrayOfCars {
	public static void main(String[] args) {
//		Create an array of cars and store 6 elements into it. Print all values from the array.

		String[] cars = { "Toyota", "Volvo", "BMW", "Tesla", "Luxus", "Honda" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

//		Create an array on integers and calculate the sum of all elements in an array.
		int sum = 0;
		int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < integers.length; i++) {
			sum += integers[i];
		}
		System.out.println(sum);

	}

}

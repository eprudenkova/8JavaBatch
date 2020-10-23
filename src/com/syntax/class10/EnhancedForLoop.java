package com.syntax.class10;

public class EnhancedForLoop {
	public static void main(String[] args) {

//		Enhanced For Loop - it works when we have multiple values whenever we work with arrays.
//		It will work only with arrays.

		String[] cars = { "Toyota", "Volvo", "BMW", "Tesla", "Luxus", "Honda" };
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println("");

		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println("");

		int[] numbers = { 10, 100, 90, 600 };
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		System.out.println();
		boolean [] arrayOfBoolean = {true, true, false, true};
		for(boolean boo:arrayOfBoolean) {
			System.out.print(boo+" ");
		}

	}

}

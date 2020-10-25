package com.syntax.class11;

public class TaskCars {
	public static void main(String[] args) {
//		Create an array of cars : american, german, korean, italian. And print all values from a 2D array.

		String[][] cars = { { "Ford", "Tesla" }, { "BMW", "Mercedes", "Audi" }, { "KIA", "Hyumdai" },
				{ "Ferrari", "Fiat" } };
//		1. 
		for (String []car:cars) {
			for(String brand:car ) {
				System.out.print(brand+" ");
			}
			System.out.println();
		}
		System.out.println();
		
//		2.
		for (int r = 0; r < cars.length; r++) {
			for (int c = 0; c < cars[r].length; c++) {
				System.out.print(cars[r][c] + " ");
			}
			System.out.println();
		}
	}
}

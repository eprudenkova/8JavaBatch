package com.syntax.class10;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {

//	1.
//	Create an array of animals and store 6 elements into it. 
//	Using 2 different loops print all elements from the array.

		String[] animals = { "Cat", "Dog", "Wolf", "Cow", "Bird", "Insect" };
//		1.
		for (int i = 1; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
//		2.
		for (String animal : animals) {
			System.out.print(animal + " ");
		}
		
		System.out.println();

//	Create an array on double using scanner and calculate the sum of all elements that was stored in an array.

		Scanner inp = new Scanner(System.in);
		int size;
		double sum=0;
		double[] array;
		System.out.println("Please enter a size of array");
		size = inp.nextInt();
		array = new double [size];
//		store values into array
		for (int i = 0 ; i< size; i++) {
		System.out.println("Please enter double number");
		array [i] = inp.nextDouble();
		}
		
//		1. loop through created array for sum
//		for (int i =0; i<array.length;i++) {
//			sum+=array[i];
//		}
		
//		2. loop through created array for sum
		for (double num:array) {
			sum+=num;
		}
		System.out.println("The sum of your numbers is "+sum);

	}
}

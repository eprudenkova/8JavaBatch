package com.syntax.class10;

public class ArraysInJava {

//	Arrays are containers that store values/data of same type
//	I have 5 students in the class and I need to calculate the avg score.

	public static void main(String[] args) {
		int[] grades = new int[5];
		grades[0] = 98;
		grades[1] = 80;
		grades[2] = 89;
		grades[3] = 67;
		grades[4] = 77;

		double average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;
		System.out.println(average);

		double[] array;// declare
		array = new double[3];// initializing
		array[0] = 12.99;
		array[1] = 10.89;
		array[2] = 5.99;
//		array[3]=7;//ArrayIndexOutOfBoundsException
//		System.out.println(array[3]);ArrayIndexOutOfBoundsException
		System.out.println(array[2]);

		String[] liquid = new String[4];
		liquid[2] = "water";
		liquid[1] = "tea";
		System.out.println(liquid[0]);// null

//		Arrays are fixed in size

	}

}

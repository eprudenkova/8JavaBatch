package com.syntax.class09;

public class ArrayDemo {
	
//	inside array we can put group of values, but they must be of the same type
	
	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

//		to access elements from an array

		System.out.println(num[3]+num[2]);
		
//		change 50 to 100
		
		num[4] = 100;//reassigning
		System.out.println(num[4]);
		
		int [] array = new int[2];
//		array[0]=10.99;//error must be int
		
		String[] arrayString = new String[4];
		arrayString [0] = "Hello";
		arrayString [1] = "Bye";
		arrayString [2] = "Hi";
		arrayString [3] = "Hola";
		System.out.println(arrayString[3]);

		
		
		
		
		
		
		
		
		
		
	}

}

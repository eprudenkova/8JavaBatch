package com.syntax.class11;

public class GroupTask3_Fibonacci {
	public static void main(String[] args) {
//		Write a Java Program to print the first 10 numbers of Fibonacci series.

//		Fibonacci numbers a series of numbers in which each number is the sum of the two preceding numbers.
//		The simplest is the series 0, 1, 1, 2, 3, 5, 8, 13, 21 etc.

//		0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13 etc

		int j = 1;
		for (int i = 0; i < 30; i+=j) {
			j+=i;
			System.out.print(i+" ");
			System.out.print(j+" ");
		}
	}
}

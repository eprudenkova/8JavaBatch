package com.syntax.class11;

public class GroupTask2_Prime {
	public static void main(String[] args) {
//		Write a java program to check whether a given number is prime or not?
//		A prime number is a whole number greater than 1 whose only factors are 1 and itself.
//		2, 3, 5, 7, 11, 13, 17 ...

		int num = 11;
		boolean flag = true;
		if (num > 1) {// prime number should be greater than 1
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}

		} else {
			flag = false;
		}
		System.out.println("The number " + num + " is a prime number? " + flag);

	}

}

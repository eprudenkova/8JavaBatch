package com.syntax.class04;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner input;
		int num1;
		int num2;
		int num3;
//		int big=0;

		input = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

//		if(num1>num2&&num1>num3) {
//			big=num1;
//		}else if(num2>num1&&num2>num3) {
//			big=num2;
//		}else if(num3>num1&&num3>num2) {
//			big=num3;
//		}
//		System.out.println("The largest number is "+big);
//	}

		if (num1 > num2) {
		} else {
			num1 = num2;
		}
		if (num1 > num3) {
			System.out.println(num1);
		} else {
			System.out.println(num3);
		}
	}
}

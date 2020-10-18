package com.syntax.class08;

public class SumLoop {
	public static void main(String[] args) {

		System.out.println("-SUM-");
		int sum = 0;
		for (int m = 1; m < 6; m++) {
			sum = sum + m;
		}
		System.out.println(sum);

		System.out.println("-SUM Outside Loop-");
		int n;
		for (n = 1; n < 6; n++) {
			System.out.println("Value is " + n);
		}
		System.out.println("Outside loop value is " + n);

		System.out.println("-Result1-");
		int result = 0;
		for (int i = 10; i >= 1; i--) {
			result *= i;
		}
		System.out.println(result);// 0

		System.out.println("-Result2-");
		int result1 = 1;
		for (int a = 10; a >= 1; a -= 2) {
			result1 *= a;
		}
		System.out.println(result1);// 3840

//		sum of even and odd numbers 1-50
		System.out.println("-SUM even 1 to 50-");
		int sumEven = 0;
		int sumOdd = 0;
		for (int b = 1; b <= 50; b++) {
			if (b % 2 == 0) {
				sumEven += b;
			} else {
				sumOdd += b;
			}
		}
		System.out.println("SUM of even numbers 1-50 " + sumEven);
		System.out.println("SUM of odd numbers 1-50 " + sumOdd);
	}
}

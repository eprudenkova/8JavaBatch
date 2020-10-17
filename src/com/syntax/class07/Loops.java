package com.syntax.class07;

public class Loops {
	public static void main(String[] args) {

//	Loops in Java - execute same block of code multiple times, help to avoid repetitive code

//	while
//	do while
//	for
//  enhanced for loop, advanced for loop, for each loop

		int time = 10;
		if (time > 12) {
			System.out.println("Good Day");// nothing - condition is false
		}

		System.out.println("---WHILE LOOP---");

//	while (time > 12){
//	System.out.println("Good Day");// INFINITY LOOP
//	}

		while (time > 12) {
			System.out.println("Good Day");// 15>12 = 3
			time++;
		}

//	While SYNTAX
//	initialize variable;
//	while (true){
//	code;
//	increment / decrement; (++/--)
//	}

//	print numbers 1-15

		int num = 1;
		while (num <= 50) {
			System.out.print(num + " ");
			num++;
		}

//	print numbers 100-60
		System.out.println("---");
		int num1 = 100;
		while (num1 >= 60) {
			System.out.print(num1 + " ");
			num1--;
		}
//	print numbers 10-30 even numbers
//	1st way
		System.out.println();
		int num5 = 10;
		while (num5 <= 30) {
			System.out.print(num5 + " ");
			num5 += 2;
		}
		// 2nd way
		System.out.println();
		int num6 = 10;
		while (num6 <= 30) {
			if (num6 % 2 == 0) {
				System.out.print(num6 + " ");
			}
			num6++;
		}
//		3rd way
		System.out.println();
		int num7= 10;
		while (num7 <= 30) {
			System.out.print((num7++)+" ");
			num7 ++;
		}
		
//		System.out.println();
//		int num8 = 10;
//		while (num8 <= 30) {
//			if (num8 % 2 == 0) {
//				System.out.print(num8 + " ");
//			num8++;// we keep increment here - we will get infinite loop
//			}
//		}
		
//		odd 100-1
		System.out.println();
		int num10 = 99;
		while (num10 >=1) {
			System.out.print(num10 + " ");
			num10 -= 2;
		}
	}
}

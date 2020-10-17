package com.syntax.class07;

public class WhileVsDoWhileLoop {
	public static void main(String[] args) {
		
//		What is difference between while loop and do while loop?
//		do-while loop is similar to while loop, however there is a difference between them: 
//		In while loop, condition is evaluated first and then the statements inside loop body gets executed,
//		on the other hand in do-while loop, statements inside do-while gets executed first 
//		and then the condition is evaluated.
		
		System.out.println("---WHILE LOOP---");
		int a = 20;
//		first we check condition
		while (a < 15) {
//			do something
			System.out.println("Hello");
			a++;
		}

		System.out.println("---DO WHILE LOOP---");
		int b = 20;
//		first do something
		do {
			System.out.println("Hi");
			b++;
//			check condition
		} while (b < 15);
		
		
	}

}

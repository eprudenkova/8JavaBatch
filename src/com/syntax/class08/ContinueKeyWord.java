package com.syntax.class08;

public class ContinueKeyWord {

//	CONTINUE - it will skip a current iteration

	public static void main(String[] args) {

//		print numbers 1-5 exept 3
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---");
		
//		print 1-10 exept 3 & 7
		for (int a =1; a<=10; a++) {
			if(a==3||a==7) {
				System.out.print("- ");
				continue;
			}
			System.out.print(a+" ");
		}

	}
}

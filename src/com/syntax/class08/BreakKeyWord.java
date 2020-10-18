package com.syntax.class08;

public class BreakKeyWord {
	
//	BREAK  --> breaks loop and skips all code that you have after break inside the loop
	
	public static void main(String[] args) {
//		print 1-10, when 5 - break

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}

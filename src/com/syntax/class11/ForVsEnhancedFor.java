package com.syntax.class11;

public class ForVsEnhancedFor {
	public static void main(String [] args) {
		
		int [] num = {10,20,30,1};//num.length=4
		
		for (int i =num.length-1; i>=0; i--) {
			System.out.print(num[i] + " ");
		}
//		we can not loop backward using enchanced for loop
	}
}

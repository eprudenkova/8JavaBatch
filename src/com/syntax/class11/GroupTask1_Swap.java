package com.syntax.class11;

public class GroupTask1_Swap {
	public static void main(String[] args) {
//		Write a program to 
//		swap 2 numbers without a temporary variable
		
		int num1=10;
		int num2=20;
		System.out.println("Num1 before swap = "+num1);
		System.out.println("Num2 before swap = "+num2);
		
		num1=num1+num2;//10+20=30
		num2=num1-num2;//30-20=10
		num1=num1-num2;//30-10=20
		
		System.out.println("Num1 after swap = "+num1);
		System.out.println("Num2 after swap = "+num2);
		
//		swap 2 strings without a temporary variable
		
		String str1 = "first";
		String str2 = "second";
		
		System.out.println("Str1 before swap = "+str1);
		System.out.println("Str2 before swap = "+str2);
		
		str1=str1+str2;//firstsecond
		str2=str1.replaceAll(str2, "");//first
		str1=str1.replaceAll(str2, "");//second
		
		System.out.println("Str1 after swap = "+str1);
		System.out.println("Str2 after swap = "+str2);
		

	}

}

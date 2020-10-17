package com.syntax.class03;

public class Task2 {
	
//	Create a Java program and name it Double Comparison. 
//	Declare 2 double values and if value of first variable is higher then the second, 
//	print “Double value __ is larger than __ .” Otherwise print...

//  Create a Java program and name it Temperature Check. 
//	Create variable to store temperature. 
//	Your program should check if temperature is below 32 then it should print 
//	“Water will freeze with temperature __“, otherwise “Water will NOT freeze with temperature __“.

	
	public static void main(String[] args) {
		
//		1. Double Comparison
		double num1 = 5.99;
		double num2 = 10.99;
		
		if (num1>num2) {
			System.out.println("Double value "+num1+" is large than "+num2);
		}else {
			System.out.println("Double value "+num1+" is NOT large than "+num2);
		}
		
//		2. Temperature Check
		int temp = 66;
		int freeze = 32;
		if (temp<freeze) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
			System.out.println("Water will NOT freeze with temperature "+temp);
		}
		
	}

}

package com.syntax.class03;

public class PrimitiveCasting {
	
//	    In Java, there are two types of casting: 
//		Widening Casting (automatically) - converting a smaller type to a larger type size. 
//		byte -> short -> char -> int -> long -> float -> double. 
//		Narrowing Casting (manually) - converting a larger type to a smaller size type. 
//		double -> float -> long -> int -> char -> short -> byte.
		
//		Casting in Java --> converting 1 type to another
//		2 type of casting:
//		widening - implicit (automatic)
//		byte --> short --> int --> long --> float --> double
//		narrowing - explicit (manual)
//		double --> float --> long --> int --> short --> byte
	
	public static void main(String[] args) {
		
		double d = 12/7;//widening
		System.out.println(d);//1.0
		
		double e = 9;//widening - no problem
		System.out.println(e);//9.0
		
//		int i = 9.99;//compiler error
		int i = (int)9.99;//narrowing - with problem
		System.out.println(i);//9
		
//		byte b = 127;// it is ok
//		byte b = 130;//compiler error
		byte b = (byte)130;//narrowing
		System.out.println(b);//crazy number -126
		
	}

}

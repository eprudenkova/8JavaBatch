package com.syntax.class11;

public class Array2D {
	
	public static void main(String[] args) {
		char [][] $array = new char[3][4];
//		1st row [0]
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
//		2nd row [1]
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
//		3rd row [2]
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='B';
		$array[2][3]='R';
	
		System.out.println($array[1][3]);//Z
		
		System.out.println("-another way to declare an array-");
		
		int [] [] array = {
				{1,2,3},
				{10,20,30},
				{100,200,300}
		
		};
		System.out.println(array[2][1]);//200
		System.out.println("The size of array of integers = "+array.length);
		
		
		
	}
}

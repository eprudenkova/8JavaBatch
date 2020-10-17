package com.syntax.class03;

public class Task {

	public static void main(String[] args) {
		
//		1. Declare variable and increase by 100 using shorthand operator
//		2. Declare variable and decrease by 67 using shorthand operator
//		3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
//		4. Declare variable cakePiece=25 and divide cake between 7 people. 
//		Using shorthand operator found out how many pieces of cake left after 
//		it was distributed equally among 7 people.
		
//		1
		int num1 = 7;
		num1 += 100;// increase by 100
		System.out.println(num1);// 107
//		2
		num1 -= 67;// decrease by 67
		System.out.println(num1);// 40
//		3
		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);// 2
//		4
		int cake = 25;
		cake /= 7;
		System.out.println(cake);// 3
		cake %= 7;
		System.out.println(cake);// 3
	}
}


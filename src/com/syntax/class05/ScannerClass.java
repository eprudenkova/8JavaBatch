package com.syntax.class05;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.println("Plese enter any sentence");
		String sentence = scanner.nextLine();//whole line
		System.out.println("You entered sentence: "+sentence);
		
		System.out.println("Plese enter any number");
		int number = scanner.nextInt();
		System.out.println("You entered sentence: "+number);
		
		System.out.println("Plese enter any word");
		String word = scanner.next();//until the space
		System.out.println("You entered sentence: "+word);
		
		System.out.println("Plese enter any single character");
		char singleCharacter = scanner.next().charAt(0);
		System.out.println("You entered sentence: "+singleCharacter);//alt + space

	}

}

package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	
//	ask user their name 5 times --> hello + name
	
	public static void main(String[] args) {
		Scanner scan;
		String name;
		int num = 1;
		scan = new Scanner (System.in);
		while(num<=5) {
		System.out.println("What is your name?");
		name = scan.nextLine();
		System.out.println("Nice to meet you "+name);
		num++;
		}
	
	}

}

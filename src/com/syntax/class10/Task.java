package com.syntax.class10;

public class Task {
	public static void main(String[] args) {
		
//		Create an array of chars and store grades into it: A,B,C,D,E,F. 
//		Then print a grade B (use 2 different ways of creating an array).
		char[] grade = { 'A', 'B', 'C', 'D', 'E' };
		System.out.println(grade[1]);
		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		System.out.println(grades[1]);

//		Create an array of names and store all names of your group. 
//		Then print your name from that array. (use 2 different ways of creating an array).
		String[] name = { "Anna", "Jack", "John", "Ashley", "Zhenya" };
		System.out.println(name[4]);
		String[] names = new String[5];
		names[0] = "Anna";
		names[1] = "Jack";
		names[2] = "John";
		names[3] = "Ashley";
		names[4] = "Zhenya";
		System.out.println(names[4]);
		System.out.println(names[names.length-1]);
		int a = 2;
		System.out.println(names[a]);//John
		a+=2;
		System.out.println(name[a]);//Zhenya
		
		System.out.println("---");
		
		for (int i=0; i<names.length; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("---");
		

//		for (int i=0; i<=names.length; i++) {//out of bounds
//			System.out.println(names[i]);
//		}
		for (int i=0; i<=names.length-1; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("***");
		

		
//		Create an array of words: Java, Saturday, day, coding, is. 
//		Print the following sentence using elements of array: “Saturday is Java coding Day”.
		String [] word = {"Java", "Saturday", "day", "coding", "is"};
		String sentence = word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2];
		System.out.println(sentence);
	}

}

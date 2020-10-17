package com.syntax.class02;

public class StringConcatination {

	public static void main(String[] args) {
		
		String name = "John";
//		I'd like to make a sentence
		System.out.println("My name is "+name);
		String lastName = "Smith";
		System.out.println(name +" "+lastName);
		String city = "New York";
		System.out.println(name+" "+lastName+" lives in "+city);
		char grade ='B';
		System.out.println(name+" is a "+grade+" student");
		int age = 30;
		System.out.println(name+" is "+age+" years old");
		
//		to attach / concatenate ANY value (char, int, String, double)
//		to a String we use + (String concatenation operator)
		
		int date = 27;
//		27 septrmber
		String month = "September";
		System.out.println(date+" "+month);
		
		String state = "DC";
		String anotherState = "   DC";
		System.out.println(state);
		System.out.println(anotherState);
		
		
		

	}

}

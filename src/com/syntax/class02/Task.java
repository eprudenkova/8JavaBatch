package com.syntax.class02;

public class Task {
	public static void main(String[] args) {

// 1. Create a Java program and name it Practice Variables.
// In your program create variables to store all different types of primitive data to test the range.
// Print the value of each variable.

		byte oneByte = 127;
		short twoBytes = 32767;
		int fourBytes = 2147483647;
		long eightBytes = 9223372036854775807l;
		float floatNumber = 00.01f;
		double doubleNumber = 0.11111;
		char singleCharacter = 'A';
		boolean trueOrFalse = true;
		System.out.println(oneByte);
		System.out.println(twoBytes);
		System.out.println(fourBytes);
		System.out.println(eightBytes);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(singleCharacter);
		System.out.println(trueOrFalse);

//	2. Create a Java program and name it Variable Values.
//	In your program create variables to store all different types of primitive data.
//	Update value of each variable.
//	Print the value of each variable.

		byte a = 11;
		a = 22;
		System.out.println(a);
		short b = 3333;
		b = 4444;
		System.out.println(b);
		int c = 555555;
		c = 66666666;
		System.out.println(c);
		long d = 7777777777777l;
		d = 8888888888l;
		System.out.println(d);
		float e = 1.11f;
		e = 2.22f;
		System.out.println(e);
		double f = 3.3333333333;
		f = 4.4444444;
		System.out.println(f);
		char g = 'G';
		g = 'H';
		System.out.println(g);
		boolean night = true;
		boolean morning = false;
		night = false;
		morning = true;
		System.out.println(night + " " + morning);

//	3. Create a Java program and name it Variables.
//	a) In your program create different type of variables to store student's information
//	and then print value of those variables:
//	name
//	lastName
//	grade
//	city
//	state
//	phoneNumber
//	b) Change student's city, state, phone number and grade. And print those updated values.

		String name = "Evgeniya";
		String lastName = "Prudenkova";
		int grade = 5;
		String city = "Brooklyn";
		String state = "New York";
		long phoneNumber =11111L;
		int house = 1316;
		name = "Zhenya";
		phoneNumber = 99999L;

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(house);

		System.out.println("My name is " + name + ", my last name is " + lastName + ".");
		System.out.println("I live in " + city + ", " + state + " State, my phone number is " + phoneNumber + "!");

	}

}

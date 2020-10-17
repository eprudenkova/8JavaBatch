package com.syntax.class07;

public class RecapSwitch {

	public static void main(String[] args) {
		String timeOfDay = "Morning";
		String day = "Saturday";
		switch (timeOfDay) {
		
		case "Morning":
			System.out.print("Good morning ");
//			nested if
//			1.
//			if (day.equals("Saturday")) {
//				System.out.println("Class!");
//			} else if (day.equals("Monday")) {
//				System.out.println("Colleague");
//			}
			
//			2.
			switch (day) {
			case "Monday":
				System.out.println("Collegue!");
				break;
			case "Tuesday":
				System.out.println("Asghar!");
				break;
			case "Saturday":
				System.out.println("Class!");
				break;
			}
			
			
			break;
		case "Noon":
			System.out.println("Good Afternoon!");
			break;
		case "Evenning":
			System.out.println("Good Evening!");
			break;
		case "Night":
			System.out.println("Good Night!");
			break;
		default:
			System.out.println("N/A");
		}
	}
}

package com.syntax.class07;

public class SwitchExample {
	public static void main(String[] args) {
		String month = "March";

//		if month is Dec - Feb = winter ... and so on

		switch (month) {

		case "December":
		case "January":
		case "February":
			System.out.println("It is winter");
			break;

		case "March":
		case "April":
		case "May":
			System.out.println("It is spring");
			break;

		case "June":
		case "July":
		case "August":
			System.out.println("It is summer");
			break;

		case "September":
		case "October":
		case "November":
			System.out.println("It is fall");
			break;
		}
	}
}

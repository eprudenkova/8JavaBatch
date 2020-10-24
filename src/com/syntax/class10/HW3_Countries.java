package com.syntax.class10;

public class HW3_Countries {
	public static void main(String[] args) {
//		Create an array of countries. While retrieving all values from an array print capital for each country. 
//		(use 2 different loops).

		String[] countries = { "USA", "Italy", "France", "Spain", "Canada" };
		String capital;
		for (String country : countries) {

			switch (country) {
			case "USA":
				capital = "Washington DC";
				break;
			case "Italy":
				capital = "Rome";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Spain":
				capital = "Madrid";
				break;
			default:
				capital = "I do not know";
			}
			System.out.println("The capital of " + country + " is " + capital);
		}
	}
}

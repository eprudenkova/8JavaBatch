package com.syntax.class11;

public class GroupTask9_Countries {
	public static void main(String[] args) {
//		Create an array of countries: 
//		north america countries, south america countries, europe countries, asian countries, african countries. 
//		Then print all values from that array using 2 different loops 
//		and calculate how many total countries been stored.

		String[][] array = { { "USA", "Canada", "Mexico" }, { "Brazil", "Argentina", "Colombia", "Pery", "Chile" },
				{ "Germany", "France", "Italy", "UK" }, { "Japan", "China", "South Korea" },
				{ "Nigeria", "Kenya", "Ghana" } };
		for (String[] countries : array) {
			for (String country : countries) {
				System.out.print(country + " ");
			}
			System.out.println();
		}

		System.out.println();
		int size=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
				size++;

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Total "+size+" countries");
	}
}

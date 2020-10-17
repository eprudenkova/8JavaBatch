package com.syntax.class06;

import java.util.Scanner;

public class HW1_CountryLanguage {
	
//	1. Ask user to enter their country and capture it. 
//	Once values are captured print which language user speaks.
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String country;
		String language;
		System.out.println("Please enter yur country");
		country = input.nextLine().toLowerCase();
		
		switch (country) {
		
		case "usa":
			language = "The official language of USA is English";
			break;
		case "canada":
			language = "The official language of Canada is English and French";
			break;
		case "france":
			language = "The official language of France is French";
			break;
		case "china":
			language = "The official language of China is Mandarin";
			break;
		case "russia":
			language = "The official language of Russia is Russian";
			break;
		default:
			language = "Invalid";
			break;
		}
		System.out.println(language);
		}	
	}

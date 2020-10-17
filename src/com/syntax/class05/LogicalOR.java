package com.syntax.class05;

public class LogicalOR {
	public static void main(String[] args) {
		String day = "Saturday";
		
		if (day.equals("Saturday")||day.equals("Sunday")) {//T OR F = TRUE
			System.out.println("1 Weekend");
		}
		if (day.equals("Sunday")||day.equals("Saturday")) {//F OR T = TRUE
			System.out.println("2 Weekend");
		}
		if (day.equals("Sunday")&&day.equals("Saturday")) {//F AND T = FALSE
			System.out.println("3 Weekend");// no output
		}
		
		String day1 = "Monday";
		if (day1.equals("Sunday")||day1.equals("Saturday")) {//F OR F = FALSE
			System.out.println("4 Weekend");// no output
		}
	}

}

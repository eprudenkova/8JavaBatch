package com.syntax.class08;

public class NestedLoop {

//	NESTED LOOP - is loop inside another loop

	public static void main(String[] args) {
		for (int i = 1; i < 3; i++) {
			for (int y = 0; y <= 3; y++) {
				System.out.println(i + " " + y);
			}
		}
	}
}

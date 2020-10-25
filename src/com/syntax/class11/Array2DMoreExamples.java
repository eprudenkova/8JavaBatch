package com.syntax.class11;

public class Array2DMoreExamples {
	public static void main(String[] args) {
	
//		food
//		american
//		italian
//		asian
//		
		
		String [][]food= {
				{"steak","hot dog","mac & cheese"},
				{"pizza","pasta","tiramisu"},
				{"sushi","ramen","dumplings"},
				{"kebab","manto"},
				{"chicken tikka masala","curry","biryani"}
		};
		for(String [] dishes:food) {
			for(String dish:dishes) {
				System.out.print(dish+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int r=0; r<food.length;r++) {
			for(int c = 0; c<food[r].length;c++) {
				System.out.print(food[r][c]+" ");
			}
			System.out.println();
		}

	}

}

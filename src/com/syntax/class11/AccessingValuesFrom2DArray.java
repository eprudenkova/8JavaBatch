package com.syntax.class11;

public class AccessingValuesFrom2DArray {
	public static void main(String[] args) {
		char[][] $array = new char[3][4];
//		1st row [0]
		$array[0][0] = 'A';
		$array[0][1] = 'B';
		$array[0][2] = 'C';
		$array[0][3] = 'D';
//		2nd row [1]
		$array[1][0] = 'W';
		$array[1][1] = 'X';
		$array[1][2] = 'Y';
		$array[1][3] = 'Z';
//		3rd row [2]
		$array[2][0] = 'Q';
		$array[2][1] = 'W';
		$array[2][2] = 'B';
		$array[2][3] = 'R';

		System.out.println($array.length);// 3 one array = one row

		// get elements using advanced for loop
		for (char[] r : $array) {
			for (char c : r) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		System.out.println();
		// get elements using for loop
		for (int r = 0; r < $array.length; r++) {
			for (int c = 0; c < $array[r].length; c++) {
				System.out.print($array[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int[][] array = { { 10, 20, 30 }, { 1, 2, 3 }, { 100, 200, 300 } };
		for (int i = 0; i < array.length; i++) {// loops through rows
			for (int j = 0; j < array[i].length; j++) {// loops through columns
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}

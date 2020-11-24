package com.syntax.class22;

public class Repl135_StaticMethodReturnType2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);
        //print the elements from new array
    }

    //create method reduce10 here
    static int[][] reduce10(int[][] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array[i].length - 1; j++) {
                array[i][j] = array[i][j] - 10;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    static void printArray() {
    }
}

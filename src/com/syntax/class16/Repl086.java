package com.syntax.class16;

public class Repl086 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int sumRows = 0;
        for (int[] r : a) {
            for (int c : r) {
                sumRows += c;
            }
            System.out.println(sumRows);
            sumRows=0;
        }
    }
}
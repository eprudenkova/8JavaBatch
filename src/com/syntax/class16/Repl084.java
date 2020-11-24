package com.syntax.class16;

public class Repl084 {
    public static void main(String[] args) {
        int[][] a = {
                {5, 2, 3, 7},
                {1, 5, 1, 1},
                {8, 3, 1, 2}
        };
        int max = a[0][0];
        for (int[] r : a) {
            for (int c : r) {
                if (c > max) {
                    max = c;
                }
            }
        }
        System.out.println(max);
    }
}


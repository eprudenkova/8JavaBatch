package com.syntax.class16;

public class Repl087 {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int count=0;
        for (int[] r : a) {
            for (int c : r) {
                if (c < 0 && c % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


package com.syntax.class16;

public class Repl088 {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if (r % 2 == 0 && c % 2 == 0) {
                    sum += a[r][c];
                }
            }
        }
        System.out.println(sum);
    }
}
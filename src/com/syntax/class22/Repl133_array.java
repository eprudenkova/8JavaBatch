package com.syntax.class22;

public class Repl133_array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array) {
        for (int b : array) {
            if (b % 2 == 0) {
                b = b / 2;
            } else {
                b = b * 10;
            }
            System.out.print(b + " ");
        }
    }
}

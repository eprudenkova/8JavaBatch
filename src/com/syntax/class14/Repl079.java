package com.syntax.class14;

import java.util.Scanner;

public class Repl079 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] array = new String[7];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter day " + (i+1) + " of week");
            array[i] = inp.nextLine();
        }
        for (String day:array) {
            System.out.println(day);
        }
    }
}

package com.syntax.class15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
print the character in the middle of the String.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any word");
        String name = input.nextLine();
        if (!name.isEmpty()) {
            if ((name.length() % 2 != 0) && (name.length() > 3)) {
                System.out.println("The character in the middle is " + name.charAt(name.length() / 2));
            } else {
                System.out.println("Please choose another word");
            }
        } else {
            System.out.println("Your word is empty");
        }
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}

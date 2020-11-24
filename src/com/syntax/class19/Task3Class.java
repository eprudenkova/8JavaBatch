package com.syntax.class19;

public class Task3Class {
//    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
//    Method should be available inside the class only where it was declared and executed by calling it is name.

    private static String vowelsOnly(String string) {
        return string.replaceAll("[^AEIOUaeiou]", "");//^ means not replace
    }

    public static void main(String[] args) {
        System.out.println(vowelsOnly("AEIOU aeiou ZX zx"));//because static method
    }
}

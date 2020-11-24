package com.syntax.class22;

public class Repl132_MixString {

    static String mixString(String s1, String s2) {
        String letter = "";
        String word = "";
        for (int i = 0; i < s1.length(); i++) {
            word = word + s1.charAt(i) + s2.charAt(i);
        }
        return word;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);
    }
}

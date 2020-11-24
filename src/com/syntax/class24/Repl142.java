package com.syntax.class24;

public class Repl142 {
    static String alphabetical(String str){
        char previous = str.charAt(0);
        String strNew = "" + previous;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > previous) {
                strNew += str.charAt(i);
            }
            previous = str.charAt(i);
        }
        return strNew;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}

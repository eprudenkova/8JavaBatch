package com.syntax.class14;

public class LengthMethod {
    public static void main(String[] args) {
        String name = "Qasim";
        int length = name.length();
        System.out.println(length);//5
        name = "";
        System.out.println(name.length());//0
        name = "Ahmed Qasim";
        System.out.println(name.length());//11
        name = "Ahmed      ";
        System.out.println(name.length());//11

        if (name.length()>10){
            System.out.println("You are great!");
        }




    }
}

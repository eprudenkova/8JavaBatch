package com.syntax.classReview5;

public class StringPool {
    public static void main(String[] args) {
        String name = "LOL";
        String name1 = "LOL";
        String name2 = new String ("LOL");
        System.out.println(name==name1);//true
        System.out.println(name.equals(name1));//true

        System.out.println(name==name2);//false
        System.out.println(name.equals(name2));//true
    }
}

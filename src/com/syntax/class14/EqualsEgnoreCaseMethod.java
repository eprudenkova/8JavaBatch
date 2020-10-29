package com.syntax.class14;

public class EqualsEgnoreCaseMethod {
    public static void main(String[] args) {
        String name = "John";
        String name2 = "JOHN";
        System.out.println(name.equalsIgnoreCase(name2));//true
        System.out.println(name2.equalsIgnoreCase(name));//true
    }
}

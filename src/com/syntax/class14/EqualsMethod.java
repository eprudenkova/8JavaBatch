package com.syntax.class14;

public class EqualsMethod {
    public static void main(String[] args) {
        String name = "John";
        String name2 = "John";
        String name3 = "Jack";
        System.out.println(name.equals(name2));//true
        System.out.println(name.equals(name3));//false
        System.out.println(name == name2);//true
        System.out.println(name == name3);//false

        System.out.println();

        name = new String("John");
        name2 = new String("John");
        name3 = new String("Jack");
        System.out.println(name.equals(name2));//true
        System.out.println(name.equals(name3));//false
        System.out.println(name == name2);//!!!false == does not work
        System.out.println(name == name3);//false ==does not work
    }
}

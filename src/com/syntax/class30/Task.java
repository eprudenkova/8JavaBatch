package com.syntax.class30;

import java.util.ArrayList;

public class Task {
//    Create an ArrayList that will store 5 names into it.
//    Find out whether the given ArrayList is empty or not?
//    Check whether the specific name is present in an ArrayList or not?
//    Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Anna");
        names.add("John");
        names.add("Mike");
        names.add("Ali");
        System.out.println(names.isEmpty());//false
        System.out.println(names.contains("Jack"));//true
        System.out.println(names.contains("Asghar"));//false
        System.out.println(names.size());//5
        System.out.println(names);

    }
}

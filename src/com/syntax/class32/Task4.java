package com.syntax.class32;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//    Create a Set collection in which you need to add names of the countries.
//    In this set we want all objects to be sorted in alphabetical order.
//    Using 2 different ways retrieve all elements from set.

public class Task4 {
    public static void main(String[] args) {
        Set<String> countriesTreeSet = new TreeSet<>();//TreeSet<>() because we want all objects to be sorted in alphabetical order
        countriesTreeSet.add("USA");
        countriesTreeSet.add("Canada");
        countriesTreeSet.add("Mexico");

        for(String country: countriesTreeSet){
            System.out.println(country);
        }

        System.out.println("-----");

        Iterator<String> iterator = countriesTreeSet.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}

package com.syntax.class32;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {

//      How can you remove all duplicates from ArrayList?

        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
//        aList.add("John");
//        aList.add("John");
//        aList.add("John");
//        aList.add("John");
//        aList.add("John");

        System.out.println(aList);

        Set<String> removeDuplicate = new LinkedHashSet<>(aList);
        aList = new ArrayList<>(removeDuplicate);
        System.out.println(aList);
    }
}

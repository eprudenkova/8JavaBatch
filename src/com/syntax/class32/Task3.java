package com.syntax.class32;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

//      How can you remove all duplicates from ArrayList?

        List<String> arrayList = new ArrayList<>();
        arrayList.add("E");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("A");

        System.out.println(arrayList);//[E, D, C, B, A, A, A]

        HashSet<String> removeDuplicateWithHashSet = new HashSet<>(arrayList);//this constructor has loop inside
        System.out.println(removeDuplicateWithHashSet);//[A, B, C, D, E] order depends on the hash function

        LinkedHashSet<String> removeDuplicateWithLinkedHashSet = new LinkedHashSet<>(arrayList);//this constructor has loop inside
        System.out.println(removeDuplicateWithLinkedHashSet);//[E, D, C, B, A] keeps order

        TreeSet<String> removeDuplicateWithTreeSet = new TreeSet<>(arrayList);//this constructor has loop inside
        System.out.println(removeDuplicateWithTreeSet);//[A, B, C, D, E] ascending order

//        back to the ArrayList but now duolicates are remove
        arrayList = new ArrayList<>(removeDuplicateWithTreeSet);//this constructor has loop inside
        System.out.println(arrayList);//[A, B, C, D, E]
    }
}

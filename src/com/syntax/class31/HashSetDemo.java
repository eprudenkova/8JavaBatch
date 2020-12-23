package com.syntax.class31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("Strawberry");
        hashSet.add("Avocado");
        hashSet.add("Olive");

        System.out.println(hashSet);
//        [Olive, Apple, Kiwi, Strawberry, Mango, Avocado]

    }
}

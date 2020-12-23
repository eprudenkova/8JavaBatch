package com.syntax.class31;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Kiwi");
        treeSet.add("Apple");
        treeSet.add("Strawberry");
        treeSet.add("Avocado");
        treeSet.add("Olive");

        System.out.println(treeSet);
//      [Apple, Avocado, Kiwi, Mango, Olive, Strawberry]

        Set<Integer> linkedHashSet2 = new TreeSet<>();
        linkedHashSet2.add(10);
        linkedHashSet2.add(20);
        linkedHashSet2.add(100);
        linkedHashSet2.add(100);
        linkedHashSet2.add(5);

        System.out.println(linkedHashSet2);
//      [5, 10, 20, 100]
    }
}

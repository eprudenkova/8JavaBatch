package com.syntax.class31;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Kiwi");
        treeSet.add("Apple");
        treeSet.add("Strawberry");
        treeSet.add("Avocado");
        treeSet.add("Olive");
        treeSet.add("avocado");
        treeSet.add("olive");

        System.out.println(treeSet);// do NOT allow duplicates, ascending order A to Z then a-z; ASCII for alphabets
//      [Apple, Avocado, Kiwi, Mango, Olive, Strawberry]

        Set<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(10);
        treeSet2.add(20);
        treeSet2.add(100);
        treeSet2.add(100);
        treeSet2.add(5);
        treeSet2.add(0);
        treeSet2.add(-1);

        System.out.println(treeSet2);// do NOT allow duplicates, ascending order -10... to 10...
//      [5, 10, 20, 100]
    }
}

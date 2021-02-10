package com.syntax.classReview17;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionsDemo3 {
    public static void main(String[] args) {
//        HashSet<Person> treeSet = new HashSet<>();
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("Kerim",20));
        treeSet.add(new Person("Jack",25));
        treeSet.add(new Person("Eduard",22));
        treeSet.add(new Person("Ali",18));
        treeSet.add(new Person("Ilya",50));

        System.out.println(treeSet);//Person cannot be cast to java.lang.Comparable
    }
}

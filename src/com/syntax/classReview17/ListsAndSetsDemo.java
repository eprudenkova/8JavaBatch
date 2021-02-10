package com.syntax.classReview17;

import com.syntax.class31.TreeSetDemo;

import java.util.*;

public class ListsAndSetsDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add(0,"Kiwi");
//        arrayList.addFirst("Kiwi");//this method is not present on list

        linkedList.add("Banana");
        linkedList.add("Apple");
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.addFirst("Kiwi");

        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Apple");
        hashSet.add("Orange");
//        hashSet.addFirst("Kiwi");//it is not implementing the List interface.
//        Not present in the Set or collection interface

        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
//        linkedHashSet.addFirst("Kiwi");//it is not implementing the List interface.


       treeSet.add("Banana");
       treeSet.add("Apple");
       treeSet.add("Apple");
       treeSet.add("Orange");
//       treeSet.addFirst("Kiwi");//it is not implementing the List interface.

        System.out.println("ArrayList");
        System.out.println(arrayList);
        System.out.println("LinkedList");
        System.out.println(linkedList);
        System.out.println("HashSet");
        System.out.println(hashSet);//no duplicte
        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);//no duplicate
        System.out.println("TreeSet");
        System.out.println(treeSet);//ascending order, no duplicate
//        when we use treeSet - to eliminate the duplicate

    }
}

package com.syntax.class32;

import java.util.*;

public class DifferenceBetweenListAndSet {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("Strawberry");
        hashSet.add("Avocado");
        hashSet.add("Olive");
//        hashSet.get(0);

        for(String element: hashSet){
            System.out.println(element);//use loop or iterator to retrieve all of the elements from Set
        }

        System.out.println("---");

        for(String element: hashSet){
            if (element.equals("Olive")){
                System.out.println(element);
            }
        }

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("Kiwi");
        arrayList.add("Apple");
        arrayList.add("Strawberry");
        arrayList.add("Avocado");
        arrayList.add("Olive");

        System.out.println("---");

        System.out.println(arrayList.get(0));//index 0

    }
}

package com.syntax.class31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayClassDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);
        doubleArrayList.add(152.00);
        doubleArrayList.add(189.00);
        doubleArrayList.add(185.00);
        doubleArrayList.add(15.90);//allows duplicate

        System.out.println("Before removing");
        System.out.println(doubleArrayList);

        System.out.println("After removing");

        Iterator<Double> iterator = doubleArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 20) {
                iterator.remove();
            }
        }
        System.out.println(doubleArrayList);//[150.0, 152.0, 189.0, 185.0]


//        RuntimeException because we are trying to perform 2 operations at the same time  on a data structure
//        for (Double element : doubleArrayList) {
//            if (element < 20) {
//                doubleArrayList.remove(element);
//            }
//            System.out.println(doubleArrayList);
//        }

//        Unexpected results or RuntimeException
//        List is dynamic, that's why 15.90 will be at the index [0] after first iteration and removing 18.99
//        for (int i = 0; i < doubleArrayList.size(); i++) {
//            if (doubleArrayList.get(i) < 20.0) {
//                doubleArrayList.remove(doubleArrayList.get(i));
//            }
//        }
//        System.out.println(doubleArrayList);//[15.9, 150.0, 152.0, 189.0, 185.0]
    }
}

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
        doubleArrayList.add(15.00);
        System.out.println("Before removing");
        System.out.println(doubleArrayList);

//        for (Double element : doubleArrayList) {
//            if(element<20){
//                doubleArrayList.remove(element);
//            }
//        }


//        unexpected results or runtime exception
//        for (int i = 0; i < doubleArrayList.size(); i++) {
//            if (doubleArrayList.get(i) < 20) {
//                doubleArrayList.remove(doubleArrayList.get(i));
//            }
//        }

//        Iterator<Double>iterator = doubleArrayList.iterator();
//        while(iterator.hasNext()){
//            System.out.println("Inside the loop");
//            Double next = iterator.next();
//            System.out.println("Double next = iterator.next(); "+next);
//            Double next1 = iterator.next();
//            System.out.println("Double next1 = iterator.next(); "+next1);
//            if(next1<20){
//                System.out.println("removing the element");
//                iterator.remove();
//            }
//        }
//        System.out.println("After removing <20");
//        System.out.println(doubleArrayList);
    }
}

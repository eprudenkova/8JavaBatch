package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);

        System.out.println("Before iteration");
        System.out.println(doubleArrayList);

        Iterator<Double> iterator = doubleArrayList.iterator();//iterator can be use only ONCE, new iterator fo again
        while (iterator.hasNext()) {
            if (iterator.next() < 20) {
                iterator.remove();
            }
        }
        System.out.println("After iteration");
        System.out.println(doubleArrayList);
//        System.out.println(iterator.next());//error bcs we do not have next element after remove
    }
}

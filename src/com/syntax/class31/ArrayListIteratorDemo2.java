package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo2 {

    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(150.00);

//      iterator can be use only ONCE, new iterator fo again
        Iterator<Double> iterator = doubleArrayList.iterator();
        System.out.println(iterator.hasNext());//true
        System.out.println(iterator.next());//18.99
        System.out.println(iterator.hasNext());//true
        System.out.println(iterator.next());//15.90
        System.out.println(iterator.hasNext());//true
        System.out.println(iterator.next());//150.00
        System.out.println(iterator.hasNext());//false
//        System.out.println(iterator.next());



    }
}

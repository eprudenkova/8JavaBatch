package com.syntax.classReview17;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.function.DoubleToIntFunction;

public class CollectionsDemo {

    public static void main(String[] args) {

//    Variable can store one value at a time
        String name1 = "Anna";
        String name2 = "Danilo";
        String name3 = "Jack";

//    Arrays can store multiple objects
        String[] names = new String[3];
        names[0] = "Anna";
        names[1] = "Danilo";
        names[2] = "Jack";

        String[] name = {"Anna"};
        String[] names2 = {"Anna", "Danilo", "Jack"};

//        Collections frame
        ArrayList arrayList = new ArrayList();//we will get runtme error
        arrayList.add("Ali");//it is a object, we have to
        arrayList.add(12);//it is a object
        System.out.println(((String) arrayList.get(0)).length());
//        System.out.println(((String)arrayList.get(1)).length());//ClassCastException

        ArrayList<String> arrayList1 = new ArrayList();//we will get runtme error
        arrayList1.add("Christina");
        arrayList1.add("Ali");
        System.out.println(arrayList1.get(0).length());
        System.out.println(arrayList1.get(1).length());
//        reading is good for ArrayList


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Danilo");
        linkedList.add("Anna");
//        every element in LinkedList is connected only with the next element
//        linked list is great for inside and beginning list manipulation
//        linked list can manipulate easier. It can be delete, add easily

        Deque<String> deque = new LinkedList<>();//we can only call methods from parent class




    }
}

package com.syntax.class30;

import java.util.ArrayList;
import java.util.List;

public class ArraysDemo2 {
    public static void main(String[] args) {
        List<Integer>arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(102);
        arrayList.add(105);
        System.out.println(arrayList.size());//4
        arrayList.remove(3);// remove 105
        System.out.println(arrayList);//10,100,102
        System.out.println(arrayList.size());//3
//        Integer integer = 100;
//        arrayList.remove(integer);
        arrayList.remove(new Integer(100));
        System.out.println(arrayList);//10,102
        System.out.println(arrayList.size());//2

        arrayList.clear();
        System.out.println(arrayList);//[]



    }
}

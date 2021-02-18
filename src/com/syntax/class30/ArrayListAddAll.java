package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("E");

        ArrayList<String> stringArrayList2 = new ArrayList<>();
        stringArrayList2.add("1");
        stringArrayList2.add("2");
        stringArrayList2.add("3");
        stringArrayList2.add("4");
        stringArrayList2.add("5");

//      addAll
//        stringArrayList2.addAll(stringArrayList);//[1, 2, 3, 4, 5, A, B, C, D, E]
//        stringArrayList2.addAll(0, stringArrayList);//[A, B, C, D, E, 1, 2, 3, 4, 5]
//        stringArrayList2.addAll(5, stringArrayList);//[1, 2, 3, 4, 5, A, B, C, D, E]
        stringArrayList2.addAll(3, stringArrayList);//[1, 2, 3, A, B, C, D, E, 4, 5]

        System.out.println(stringArrayList2);//[1, 2, 3, A, B, C, D, E, 4, 5]
        Collections.sort(stringArrayList2);
        System.out.println(stringArrayList2);//.Collection.sort() [1, 2, 3, 4, 5, A, B, C, D, E]

        Collections.reverse(stringArrayList2);
        System.out.println(stringArrayList2);//[E, D, C, B, A, 5, 4, 3, 2, 1]
    }
}

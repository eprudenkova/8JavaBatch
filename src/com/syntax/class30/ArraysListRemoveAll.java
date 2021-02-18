package com.syntax.class30;

import java.util.ArrayList;

public class ArraysListRemoveAll {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        stringArrayList.add("4");
        stringArrayList.add("5");
        stringArrayList.add("6");
        stringArrayList.add("7");
        stringArrayList.add("8");
        stringArrayList.add("9");
        stringArrayList.add("10");

        ArrayList<String> stringArrayList2 = new ArrayList<>();
        stringArrayList2.add("1");
        stringArrayList2.add("2");
        stringArrayList2.add("3");
        stringArrayList2.add("4");
        stringArrayList2.add("5");

        System.out.println(stringArrayList);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        stringArrayList.removeAll(stringArrayList2);
        System.out.println(stringArrayList);//[6, 7, 8, 9, 10]
    }
}

package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetainAll {
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

//      retainAll is used to remove all the array list’s elements that are not contained in the specified collection
//      retainAll keeps duplicates
        System.out.println(stringArrayList);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(stringArrayList.size());//10
        stringArrayList.retainAll(stringArrayList2);//retainAll [1, 2, 3, 4, 5]
        System.out.println(stringArrayList.size());//5
        System.out.println(stringArrayList);//[1, 2, 3, 4, 5]

//        that's why they have not called this method as a replace
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(Arrays.toString(arr));//[10, 20]
        arr[0] = 20;
        System.out.println(Arrays.toString(arr));//[20, 20]
    }
}

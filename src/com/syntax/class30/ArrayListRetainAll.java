package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetainAll {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Danilo");
        stringArrayList.add("Asghar");
        stringArrayList.add("Burju");
        stringArrayList.add("Eduard");
        stringArrayList.add("Daria");
        stringArrayList.add("Davit");
        stringArrayList.add("Ali");
        stringArrayList.add("Mike");
        stringArrayList.add("Vlad");
        stringArrayList.add("Anastasia");
        System.out.println(stringArrayList.size());//10

        ArrayList<String> stringArrayList2 = new ArrayList<>();
        stringArrayList2.add("Davit");
        stringArrayList2.add("Ali");
        stringArrayList2.add("Mike");
        stringArrayList2.add("Vlad");
        stringArrayList2.add("Anastasia");

//      retainAll keeps duplicates
        stringArrayList.retainAll(stringArrayList2);
        System.out.println(stringArrayList.size());//5
        System.out.println(stringArrayList);//[Davit, Ali, Mike, Vlad, Anastasia]

        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(Arrays.toString(arr));//[10, 20]
        arr[0] = 20;
        System.out.println(Arrays.toString(arr));//[20, 20]
    }
}

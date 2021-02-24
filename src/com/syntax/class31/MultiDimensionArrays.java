package com.syntax.class31;

import java.util.ArrayList;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outerArrayList = new ArrayList<>();

        ArrayList<Integer> innerArrayList1 = new ArrayList<>();
        innerArrayList1.add(10);
        innerArrayList1.add(20);
        innerArrayList1.add(30);
        innerArrayList1.add(40);

        ArrayList<Integer> innerArrayList2 = new ArrayList<>();
        innerArrayList2.add(110);
        innerArrayList2.add(120);
        innerArrayList2.add(130);
        innerArrayList2.add(140);

        outerArrayList.add(innerArrayList1);
        outerArrayList.add(innerArrayList2);

        System.out.println(outerArrayList);
        System.out.println(innerArrayList1);
        System.out.println(innerArrayList2);


    }
}

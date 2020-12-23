package com.syntax.class31;

import java.util.ArrayList;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outerArrayList = new ArrayList<>();

        ArrayList<Integer> innerArrayList = new ArrayList<>();
        innerArrayList.add(10);
        innerArrayList.add(20);
        innerArrayList.add(30);
        innerArrayList.add(40);

        ArrayList<Integer> innerArrayList1 = new ArrayList<>();
        innerArrayList1.add(110);
        innerArrayList1.add(120);
        innerArrayList1.add(130);
        innerArrayList1.add(140);

        outerArrayList.add(innerArrayList);
        outerArrayList.add(innerArrayList1);

        System.out.println(outerArrayList);
        System.out.println(innerArrayList);
        System.out.println(innerArrayList1);


    }
}

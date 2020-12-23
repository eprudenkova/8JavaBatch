package com.syntax.class30;

import java.util.ArrayList;

public class ArrayListClearAll {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Danilo");
        stringArrayList.add("Asghar");
        stringArrayList.add("Burju");
        stringArrayList.add("Eduard");
        stringArrayList.add("Daria");
        System.out.println(stringArrayList);//[Danilo, Asghar, Burju, Eduard, Daria]
        stringArrayList.clear();//removes the total no of element from the collection
        System.out.println(stringArrayList);//[]
    }
}

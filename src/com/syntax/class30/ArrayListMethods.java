package com.syntax.class30;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Danilo");
        stringArrayList.add("Asghar");
        stringArrayList.add("Burju");
        stringArrayList.add("Eduard");
        stringArrayList.add("Daria");

        ArrayList<String> stringArrayList2 = new ArrayList<>();
        stringArrayList2.add("Davit");
        stringArrayList2.add("Ali");
        stringArrayList2.add("Mike");
        stringArrayList2.add("Vlad");
        stringArrayList2.add("Anastasia");

//      addAll
//        stringArrayList2.addAll(stringArrayList);//[Davit, Ali, Mike, Vlad, Anastasia, Danilo, Asghar, Burju, Eduard, Daria]
//        stringArrayList2.addAll(0, stringArrayList);//[Danilo, Asghar, Burju, Eduard, Daria, Davit, Ali, Mike, Vlad, Anastasia]
//        stringArrayList2.addAll(1, stringArrayList);//[Davit, Danilo, Asghar, Burju, Eduard, Daria, Ali, Mike, Vlad, Anastasia]
        stringArrayList2.addAll(3, stringArrayList);//[Davit, Ali, Mike, Danilo, Asghar, Burju, Eduard, Daria, Vlad, Anastasia]


        System.out.println(stringArrayList2);
//        Collections.sort(stringArrayList2);
//        System.out.println(stringArrayList2);

    }
}

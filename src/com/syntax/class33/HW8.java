package com.syntax.class33;

//    8. Create a collection of integers in which you can keep duplicates.
//    Write a logic to find sum of all integers

import java.util.LinkedList;

public class HW8 {
    public static void main(String[] args){

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);

        int sum = 0;
        for(Integer object : linkedList){
            sum+=object;
        }
        System.out.println(sum);
    }
}

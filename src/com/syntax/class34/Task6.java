package com.syntax.class34;

//    Create a collection of integers in which you can keep duplicates.
//    Write a logic to find sum of all integers

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
//        ArrayList allows duplicate values while HashSet doesn't allow duplicates values.
//        Ordering : ArrayList maintains the order of the object in which they are inserted
//        while HashSet is an unordered collection and doesn't maintain any order.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(5);
        numbers.add(-40);
        numbers.add(132);
//        numbers.add(11.1);

        System.out.println(numbers);

//        Iterator<Integer> iterator = numbers.iterator();
//        int sum = 0;
//        while(iterator.hasNext()){
//            sum=sum+iterator.next();
//        }
//        System.out.println(sum);//147

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);//147
    }
}

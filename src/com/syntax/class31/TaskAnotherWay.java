package com.syntax.class31;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskAnotherWay {
    /*
    Create an arrayList of even numbers from 1 to 50.
    Remove any number that is divisible by 5 from that arrayList.
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = IntStream.range(1, 51).filter(i -> i % 2 == 0).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numbers);
        numbers.removeIf(next -> next % 5 == 0);
        System.out.println(numbers);
    }
}



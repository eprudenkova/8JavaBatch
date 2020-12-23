package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
    private static Object ArrayList;
    /*
    Create an arrayList of even numbers from 1 to 50.
    Remove any number that is divisible by 5 from that arrayList.
     */

    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; i <= 50; i += 2) {
            evenNumbers.add(i);
        }
        System.out.println("Before");
        System.out.println(evenNumbers);

        Iterator<Integer> iterator = evenNumbers.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();//AutoUnBoxing
            if (next % 5 == 0) {
                iterator.remove();
            }
        }
        System.out.println("After");
        System.out.println(evenNumbers);

//        package class1129;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//        public class Task1 {
//            public static void main(String[] args) {
//                ArrayList<Integer> numbers = IntStream.range(1, 51).filter(i -> i % 2 == 0).boxed().collect(Collectors.toCollection(ArrayList::new));
//                System.out.println(numbers);
//                numbers.removeIf(next -> next % 5 == 0);
//                System.out.println(numbers);
//            }
//        }
    }
}

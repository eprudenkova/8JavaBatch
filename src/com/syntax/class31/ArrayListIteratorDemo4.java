package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Monrovia");
        cities.add("Brooklyn");
        cities.add("San Diego");
        System.out.println(cities);

//        Iterator<String> iterator = cities.iterator();
//        while(iterator.hasNext()){
//           if(iterator.next().endsWith("a")) {
//               iterator.remove();
//           }
//        }
//        System.out.println(cities);

        cities.removeIf(s -> s.endsWith("a"));
        System.out.println(cities);
    }
}

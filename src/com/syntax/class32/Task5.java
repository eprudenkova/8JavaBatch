package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//    Create a Set of cities in which you want to make sure that insertion order is maintained.
//    Then remove any city that starts with “A”.

public class Task5 {

    public static void main(String[] args) {

        Set<String> citiesLinkedHashSet = new LinkedHashSet<>();//LinkedHashSet<>() because we want to make sure that insertion order is maintained
        citiesLinkedHashSet.add("Austin");
        citiesLinkedHashSet.add("Albuquerque");
        citiesLinkedHashSet.add("Atlanta");
        citiesLinkedHashSet.add("Brooklyn");
        citiesLinkedHashSet.add("New York");

        Iterator<String> iterator = citiesLinkedHashSet.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(citiesLinkedHashSet);
    }
}

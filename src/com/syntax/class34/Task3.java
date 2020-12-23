package com.syntax.class34;

//    Create a Map from array of cities that will sort keys in alphabetical order.
//    As a key store the name of the city and as a value store the length of the city.
//    (Example: Paris=5, Moscow=6, Washington DC=13 etc..).
//    If any city name is more than 7 characters remove that city.

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        String[] citiesArray = {"Paris", "Moscow", "Washington DC", "Helsinki", "Olso", "Berlin", "Ottawa"};

        Map<String, Integer> citiesMap = new TreeMap<>();
        for (String s : citiesArray) {
            citiesMap.put(s, s.length());
        }
        System.out.println(citiesMap);

        Iterator<Map.Entry<String, Integer>> iterator = citiesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> element = iterator.next();
            if (element.getValue() > 7) {
                iterator.remove();
            }
        }
        System.out.println(citiesMap);
    }
}

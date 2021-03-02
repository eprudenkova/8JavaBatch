package com.syntax.class33;

//    5. Create a Map from Array of cities that will sort keys in alphabetical order
//    As a key store the name of the city and as a value store the length of the city (Paris = 5)
//    If any city name is more than 7 characters remove that city

import java.util.Iterator;
import java.util.TreeMap;

public class HW5 {
    public static void main(String[] args){

        String[] citiesArray = {"Paris","London","Milan","Moscow","NewYork","Berlin"};

        TreeMap<String,Integer> citiesMap = new TreeMap<>();
        for(String city : citiesArray){
            citiesMap.put(city,city.length());
        }

        Iterator<String> iterator = citiesMap.keySet().iterator();
        while(iterator.hasNext()){
            String nextKey = iterator.next();
            if(citiesMap.get(nextKey)>=7){
                iterator.remove();
            }
        }
        System.out.println(citiesMap);
    }
}

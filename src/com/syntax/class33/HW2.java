package com.syntax.class33;

//    2. Create a map of countries with its capital that will store countries in alphabetical order.
//    Print all keys and values from a country map using for each loop and iterator.
//    Print all values from a country map using for each loop and iterator.

import java.util.*;

public class HW2 {
    public static void main(String[] args) {

        TreeMap<String,String> countriesMap = new TreeMap<>();
        countriesMap.put("AZERBAIJAN","BAKU");
        countriesMap.put("ARGENTINA","BUENOS AIRES");
        countriesMap.put("AUSTRALIA","CANBERRA");
        countriesMap.put("ARMENIA","YEREVAN");
        countriesMap.put("AUSTRIA","VIENNA");

        System.out.println("---entrySet()---");

        Set<Map.Entry<String,String>> countriesSet = countriesMap.entrySet();
        for(Map.Entry<String,String> countriesEntry : countriesSet){
            System.out.println(countriesEntry);
        }

        System.out.println("---keySet()---");

        Set<String> countriesKey = countriesMap.keySet();
        for(String key : countriesKey){
            System.out.println(key+"="+countriesMap.get(key));
        }

        System.out.println("---keySet()---");

        for(String key : countriesKey){
            System.out.println(countriesMap.get(key));//values
        }

        System.out.println("---Iterator entrySet()---");

        Iterator<Map.Entry<String,String>> iterator = countriesSet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> nextEntry = iterator.next();
            System.out.println(nextEntry);
        }

        System.out.println("---Iterator keySet()---");

        Iterator<String> iterator2 = countriesKey.iterator();
        while(iterator2.hasNext()){
            String nextKey = iterator2.next();
            System.out.println(nextKey+"="+countriesMap.get(nextKey));
        }
        System.out.println("---Iterator keySet()---");

        Iterator<String> iterator3 = countriesKey.iterator();
        while(iterator3.hasNext()){
            String nextKey = iterator3.next();
            System.out.println(countriesMap.get(nextKey));//value
        }
    }
}

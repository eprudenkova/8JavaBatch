package com.syntax.class33;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo10 {
    public static void main(String[] args) {
        Map<String, Double> storeItems = new ConcurrentHashMap<>();
        storeItems.put("Milk", 3.20);
        storeItems.put("Bread", 0.99);
        storeItems.put("Cake", 40.00);
        storeItems.put("Diaper", 39.99);
        storeItems.put("Eggs", 4.99);

        System.out.println(storeItems);//{Cake=40.0, Eggs=4.99, Milk=3.2, Bread=0.99, Diaper=39.99}
//        Set<String> set = storeItems.keySet();
//        for (String setItems: set){
//            if (setItems.equals("Bread")){
//                storeItems.remove(setItems);
//            }
//        }

//        Iterator<String> iterator = storeItems.keySet().iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().equals("Bread")) {
//                iterator.remove();
//            }
//        }

        Iterator<Map.Entry<String, Double>> iterator = storeItems.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> next = iterator.next();
            if (next.getKey().equals("Bread")) {
                iterator.remove();
            }
        }

        System.out.println(storeItems);//{Cake=40.0, Eggs=4.99, Milk=3.2, Diaper=39.99}

//        Map<String, Integer> map1 = new LinkedHashMap<>();
//        Map<String, Integer> map2 = new TreeMap<>();
//        Map<String, Integer> map3 = new Hashtable<>();
//
//        Map<String, Integer> map4 = new WeakHashMap<>();
//        Map<String, Integer> map5 = new IdentityHashMap<>();
//        Map<String, Integer> map6 = new ConcurrentHashMap<>();

    }
}

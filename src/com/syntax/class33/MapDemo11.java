package com.syntax.class33;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo11 {
    public static void main(String[] args) {
        Map<String, Double> storeItems = new LinkedHashMap<>();
        storeItems.put("Milk", 3.20);
        storeItems.put("Bread", 0.99);
        storeItems.put("Cake", 40.00);
        storeItems.put("Diaper", 39.99);
        storeItems.put("Eggs", 4.99);

        Set<String> set1 = storeItems.keySet();
        for (String key: set1){
            System.out.print(storeItems.get(key)+" ");//3.2 0.99 40.0 39.99 4.99
        }

        System.out.println();

        Set<String> set2 = storeItems.keySet();
        for (String key: set2){
            if (key.equals("Bread")){
                storeItems.replace(key,10.0);
            }
        }
        System.out.println(storeItems);//{Milk=3.2, Bread=10.0, Cake=40.0, Diaper=39.99, Eggs=4.99}
    }
}

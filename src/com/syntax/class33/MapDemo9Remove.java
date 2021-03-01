package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo9Remove {
    public static void main(String[] args) {

        HashMap<String, Double> storeItemsDay1 = new HashMap<>();
        storeItemsDay1.put("Milk", 3.20);
        storeItemsDay1.put("Bread", 0.99);
        storeItemsDay1.put("Cake", 40.00);
        storeItemsDay1.put("Diaper", 39.99);
        storeItemsDay1.put("Eggs", 4.99);

//        Set<Map.Entry<String, Double>> entries = storeItemsDay1.entrySet();
//        for (Map.Entry<String, Double> item : entries) {
//            storeItemsDay1.remove(item.getKey());// Exception
//        }

        Iterator<Map.Entry<String, Double>> iterator = storeItemsDay1.entrySet().iterator();
        System.out.println(storeItemsDay1);//{Cake=40.0, Eggs=4.99, Milk=3.2, Bread=0.99, Diaper=39.99}
        while (iterator.hasNext()) {
            Map.Entry<String, Double> next = iterator.next();
            if (next.getValue() > 10) {
                iterator.remove();
            }
        }
        System.out.println(storeItemsDay1);//{Eggs=4.99, Milk=3.2, Bread=0.99}
    }
}

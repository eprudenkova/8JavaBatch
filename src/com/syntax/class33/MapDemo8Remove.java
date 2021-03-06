package com.syntax.class33;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class MapDemo8Remove {
    public static void main(String[] args) {

        HashMap<String, Double> storeItemsDay1 = new HashMap<>();
        storeItemsDay1.put("Milk", 3.20);
        storeItemsDay1.put("Bread", 0.99);
        storeItemsDay1.put("Cake", 40.00);
        storeItemsDay1.put("Diaper", 39.99);
        storeItemsDay1.put("Eggs", 4.99);

        Iterator<Map.Entry<String, Double>> iterator = storeItemsDay1.entrySet().iterator();
        Double sum = 0.0;
        System.out.println(storeItemsDay1.size());//5

        while (iterator.hasNext()) {
            Map.Entry<String, Double> next = iterator.next();
            if (next.getKey().equals("Bread")) {
                iterator.remove();
            } else {
                sum += next.getValue();
            }
        }
        System.out.println("Total sum "+sum);
        System.out.println(storeItemsDay1.size());//4
    }
}

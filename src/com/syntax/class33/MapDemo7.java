package com.syntax.class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> storeItemsDay1 = new HashMap<>();
        storeItemsDay1.put("Milk", 3.20);
        storeItemsDay1.put("Bread", 0.99);
        storeItemsDay1.put("Cake", 40.00);
        storeItemsDay1.put("Diaper", 39.99);
        storeItemsDay1.put("Eggs", 4.99);

        HashMap<String, Double> storeItemsDay2 = new HashMap<>();
        storeItemsDay2.put("Beer", 12.00);
        storeItemsDay2.put("Coffee", 3.75);
        storeItemsDay2.put("Snack", 5.00);

//        System.out.println(storeItemsDay2.get(null));//null
//        System.out.println(storeItemsDay2.get("lion"));//null

        storeItemsDay2.putAll(storeItemsDay1);
        Set<String> set = storeItemsDay2.keySet();//key -- String
        storeItemsDay2.remove("Bear");
        Iterator<String> iterator = set.iterator();

        Double sum = 0.0;

        System.out.println(storeItemsDay2.size());

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (storeItemsDay2.get(item) != null) {
                sum += storeItemsDay2.get(item);
            }
        }

        System.out.println(sum);
        System.out.println(storeItemsDay2.size());
//        we will loop into this in the next class
    }
}

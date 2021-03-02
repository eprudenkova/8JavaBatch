package com.syntax.class33;

//    3. Create a Map of BestBuy store.
//    Place item id and item name into it.
//    Example (1233819 Printer)
//    Retrieve all keys and values from a mapBestBuy using entrySet()

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HW3 {
    public static void main(String[] args){

        HashMap<String,String> storeMap = new HashMap<>();
        storeMap.put("5273894","Printer");
        storeMap.put("4563782","Watch");
        storeMap.put("8567382","TV");
        storeMap.put("0495539","Laptop");
        storeMap.put("4356474","Camera");

        Iterator<Map.Entry<String,String>> iterator = storeMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> nextEntry = iterator.next();
            System.out.println(nextEntry);
        }
    }
}

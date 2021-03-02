package com.syntax.class33;

//    1. Create a map of a building. Store floor number and it is associated company name.
//    (Example: 1= Google, 2=Syntax etc..).
//    Insert 7 entries with duplicate keys and values.
//    Check how many entries you have?
//    Update company on a 4th floor
//    Remove company on the 7th floor
//    Print your map

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HW1 {
    public static void main(String[] args) {
        Map<Integer, String> buildingMap = new HashMap<>();
        buildingMap.put(1, "Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Netflix");
        buildingMap.put(4, "Facebook");//duplicate value
        buildingMap.put(5, "Facebook");//duplicate value
        buildingMap.put(6, "Amazon");//will be overridden
        buildingMap.put(6, "Apple");//duplicate key
        buildingMap.put(7, "Microsoft");//duplicate key

        System.out.println(buildingMap);//{1=Google, 2=Syntax, 3=Netflix, 4=Facebook, 5=Facebook, 6=Apple, 7=Microsoft}
        System.out.println(buildingMap.size());//7
//        buildingMap.put(4,"Updated value");//updated value using put() method
//        System.out.println(buildingMap);

        //if we want to iterate the Map we have to convert it into Set
        Iterator<Map.Entry<Integer, String>> iterator = buildingMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();//next = Map.Entry
            if (next.getKey() == 4) {//next.getKey() = key
                buildingMap.put(4, "Updated value");
            }
            if (next.getKey() == 7) {
                iterator.remove();
            }
        }
        System.out.println(buildingMap);//{1=Google, 2=Syntax, 3=Netflix, 4=Updated value, 5=Facebook, 6=Apple}
        System.out.println(buildingMap.size());//6
    }
}

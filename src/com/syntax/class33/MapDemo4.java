package com.syntax.class33;

import java.util.*;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jessor", 666);

//        Set<String> set = new HashSet<>();
//        Iterator<String> sets = set.iterator();

        Set<Map.Entry<String,Integer>> set1 = hashMap.entrySet();
        Iterator <Map.Entry<String,Integer>> iterator = set1.iterator();
        while(iterator.hasNext()){
           Map.Entry<String, Integer> element =iterator.next();
            System.out.println(element.getKey()+" "+element.getValue());
        }

//        Set<Map.Entry<String,Integer>> entrySet = hashMap.entrySet();

//        each Entry = row which contains key and value
//        it is because Iterator class comes from set interface? but Map doesn't
//        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> next = iterator.next();
//            System.out.println(next.getKey() + " " + next.getValue());
//        }

    }
}


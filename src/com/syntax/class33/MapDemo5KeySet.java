package com.syntax.class33;

import java.util.*;

public class MapDemo5KeySet {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jessor", 666);

//        converting Map to Set
        Set<String> keySet = hashMap.keySet();

        System.out.println("-------for loop-------");

        for (String key : keySet) {
            System.out.println(key + " " + hashMap.get(key));
        }

        System.out.println("-------iterator-------");

        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+" "+hashMap.get(next));
        }

//        we can not use simple loop
//        for(int i = 0; i < keySet.size(); i++){
//            System.out.println(keySet.get(i));
//        }
    }
}

package com.syntax.class33;

import java.util.*;

public class MapDemo4EntrySet {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 111);
        hashMap.put("Vladimir", 222);
        hashMap.put("Maria", 333);
        hashMap.put("Denis", 444);
        hashMap.put("Daria", 555);
        hashMap.put("Jessor", 666);

//        hoe to declare the Set:
//        Set<String> set = new HashSet<>();
//        Iterator<String> sets = set.iterator();

        System.out.println("-------1st way-------");

        for(String key:hashMap.keySet()){
//            System.out.println(hashMap.keySet());
//            System.out.println("---");
            System.out.println(key+" "+hashMap.get(key));
        }

        System.out.println("-------2nd way-------");

        Set<Map.Entry<String, Integer>> sets = hashMap.entrySet();//entrySet() returns a Set
//        System.out.println("map "+hashMap);
//        System.out.println("set "+set1);
        for (Map.Entry<String, Integer> set: sets) {
            System.out.println(set.getKey()+" "+set.getValue());
        }

        System.out.println("-------3rd way-------");

//        because the Iterator is not available in the Map we need to convert Map to Set
//        because the Map is not a part of the Collection
//        we can not have yhe Iterator directly
//        Map interface
//        Entry interface = = row which contains key and value
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();//entrySet() returns a Set
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();//iterator() returns iterator

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();//Map.Entry<K,V> method returns a collection-view of the map.
            System.out.println(next.getKey() + " " + next.getValue());
        }
    }
}


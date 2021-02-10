package com.syntax.classReview17;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(123456, "Moneer");
        hashMap.put(7007007, "Artem");
        hashMap.put(25486, "Sabeen");
        hashMap.put(100, "Mahmut");

        System.out.println(hashMap);
        System.out.println(hashMap.get(25486));//Sabeen

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Ali", 26));
        arrayList.add(new Person("Mike", 25));
        arrayList.add(new Person("sabeen", 18));
        arrayList.add(new Person("Artem", 30));

        HashMap<String, Person> hashMap2 = new HashMap();
        hashMap2.put("Ali", new Person("Ali", 26));
        hashMap2.put("Mike", new Person("Mike", 25));
        hashMap2.put("Sabeen", new Person("Sabeen", 18));
        hashMap2.put("Artem", new Person("Artem", 30));

        System.out.println(hashMap2);
        System.out.println(hashMap2.get("Sabeen"));//Person{name='Sabeen', age=18}

    }
}

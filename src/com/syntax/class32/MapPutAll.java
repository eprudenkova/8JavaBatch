package com.syntax.class32;

import java.util.HashMap;
import java.util.Map;

public class MapPutAll {
    public static void main(String[] args) {

        Person objJasoor = new Person("Jasoor",111,20);
        Person objKim = new Person("Kim",222,25);
        Person objQasim = new Person("Qasim",333,30);

        Map<Integer,Person> peopleInUSA = new HashMap<>();
        peopleInUSA.put(111,objJasoor);
        peopleInUSA.put(222,objKim);
        peopleInUSA.put(333,objQasim);

        Map<Integer,Person> peopleInRussia = new HashMap<>();
        peopleInRussia.put(777,new Person("Anna",777,44));
        peopleInRussia.put(888,new Person("Ivan",88,55));

        Map<Integer,Person> peopleInWord = new HashMap<>();
        peopleInWord.putAll(peopleInUSA);
        peopleInWord.putAll(peopleInRussia);
    }
}


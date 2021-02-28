package com.syntax.class32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {

        Person objJasoor = new Person("Jasoor",111,20);
        Person objKim = new Person("Kim",222,25);
        Person objQasim = new Person("Qasim",333,30);

        Map<Integer,Person> peopleInUSA = new HashMap<>();

        peopleInUSA.put(111,objJasoor);
        peopleInUSA.put(222,objKim);
        peopleInUSA.put(333,objQasim);
//        peopleInUSA.put(333,objKim);//there can only be one key inside the Map
//        if we are trying to store value with the same key that value will be overridden

        System.out.println(peopleInUSA.get(333).name);//Qasim
        System.out.println(peopleInUSA);
//       {333=Person{name='Qasim', ssn=333, age=30}, 222=Person{name='Kim', ssn=222, age=25}, 111=Person{name='Jasoor', ssn=111, age=20}}

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(objJasoor);
        personArrayList.add(objKim);
        personArrayList.add(objQasim);

        System.out.println(personArrayList);
//        [Person{name='Jasoor', ssn=111, age=20}, Person{name='Kim', ssn=222, age=25}, Person{name='Qasim', ssn=333, age=30}]
    }
}

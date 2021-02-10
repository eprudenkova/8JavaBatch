package com.syntax.classReview17;

import com.syntax.class24.A;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.function.DoubleToIntFunction;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person ali = new Person ("Ali",18);
        personArrayList.add(ali);
        personArrayList.add(new Person("Kerim",20));
        personArrayList.add(new Person("Jack",25));
        personArrayList.add(new Person("Eduard",22));
        personArrayList.add(new Person("Ali",18));
        personArrayList.add(new Person("Ilya",50));

        System.out.println(personArrayList.contains(ali));//true
        System.out.println(personArrayList.contains(new Person("Ali",18)));//false before override equals()
//        new object in separate memory container in heap
//        boolean contains(Object o)
//        checks whether the given object is present in the array list if its there then it return strue
//        else it returns false

//        TreeSet<Person> personTreeSet = new
        System.out.println(personArrayList);//override toString()
    }
}

package com.syntax.class34;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//    Create a Person class with following private fields: name, lastName, age, salary.
//    Variables should be initialized through constructor.
//    Inside the class also create a method to print user details.
//    In Test Class create a Map that will store key in ascending order.
//    In that map store personId and a Person Object. Print each object details.

public class Task2 {
    public static void main(String[] args) {
        Person annaObj = new Person("Anna", "Brown", 25, 100000);
        Person johnObj = new Person("John", "Black", 30, 90000);
        Person billObj = new Person("Bill", "Green", 35, 110000);

        Map<Integer, Person> personMap = new TreeMap<>();
        personMap.put(1, annaObj);
        personMap.put(2, johnObj);
        personMap.put(3, billObj);

        Set<Map.Entry<Integer, Person>> entrySet = personMap.entrySet();

        Iterator<Map.Entry<Integer, Person>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Person> next = iterator.next();
            System.out.println(next);
        }
    }
}

class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(){}

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}


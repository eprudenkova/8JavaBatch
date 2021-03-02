package com.syntax.class33;

//    4. Create a Person Class with following private fields: name lastname age salary
//    Variables should be initialized through constructor
//    Inside the class also create a method to print user details
//    In test class create a Map that will store key in ascending order.
//    In that map store personal ID and Person object
//    Print each object details

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HW4 {

    public static void main(String[] args) {
        TreeMap<Integer,Person> employeesMap = new TreeMap<>();
        employeesMap.put(333,new Person("Anna","Black",30,100000));
        employeesMap.put(111,new Person("Jack","White",40,90000));
        employeesMap.put(222,new Person("Kate","Brown",35,110000));

        Iterator<Map.Entry<Integer,Person>> iterator = employeesMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Person> nextEntry = iterator.next();
            System.out.println(nextEntry);
//            System.out.println("ID "+nextEntry.getKey());
//            nextEntry.getValue().printPersonDetails();
//            nextEntry.getValue().printDetailsFromToString();
        }
    }
}

class Person{
    private String name;
    private String lastname;
    private int age;
    private double salary;

    Person(){}

    Person(String name, String lastname, int age, double salary){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
        this.salary=salary;
    }

    void printPersonDetails(){
        System.out.println("Employee: "+name+" "+lastname+" "+age+" $"+salary);
    }

    void printDetailsFromToString(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
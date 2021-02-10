package com.syntax.classReview17;

import java.util.Objects;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //    @Override
//    public int compareTo(Person person) {
//        return Integer.compare(this.getAge(), person.getAge());
//        return this.getName().compareTo(person.getName());

//        if (this.getAge() == person.getAge()) {
//            return 0;
//        } else if (this.getAge() > person.getAge()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
}

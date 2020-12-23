package com.syntax.class32;

public class Person {
    String name;
    long ssn;
    int age;

    public Person(String name, long ssn, int age) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ssn=" + ssn +
                ", age=" + age +
                '}';
    }
}
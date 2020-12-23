package com.syntax.class32;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task6 {
//    Create a Set collection that will hold Objects of Student Type.
//    In this set we do not care about the insertion order.
//    Each student object should have name and studentID.
//    Display name of each student.

    class Student{
        String name;
        String ID;

        Student(String name, String iD){
            System.out.println(name+" has student ID "+iD);
        }

    }
//    public static void main(String[] args) {
//        Set<Student> student = new LinkedHashSet<>();
//        student.add("Anna","12345");
//    }
}

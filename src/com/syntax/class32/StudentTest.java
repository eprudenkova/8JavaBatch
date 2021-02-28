package com.syntax.class32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {

        Set<Student> studentHashSet = new HashSet<>();//HashSet<>() because we do not care about the insertion order
        studentHashSet.add(new Anna("Anna","123","ID123"));
        studentHashSet.add(new John("John","456","ID456"));

        Iterator<Student> iterator = studentHashSet.iterator();
        while(iterator.hasNext()){
            Student next = iterator.next();
            next.myNameIs();
            next.myStudentIDIs(next.password);
        }
    }
}

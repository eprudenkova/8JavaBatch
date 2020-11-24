package com.syntax.classReview;

public class SchoolObject {
    public static void main(String[] args) {

        SchoolClass.schoolName = "Harvard University";

        SchoolClass s1 = new SchoolClass();
        s1.name = "John";
        s1.lastname = "Terry";
        s1.age = 12;

        SchoolClass s2 = new SchoolClass();
        s2.name = "Tom";
        s2.lastname = "Black";
        s2.age = 9;

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

        s1.study(4);
        s2.study(2);

        SchoolClass.goToSchool();


    }
}

package com.syntax.class20;

public class TeacherMath extends Teacher {
    boolean hasAMultiplicationЕablу;

    void printTeacherMath() {
        System.out.println("From TeacherMath");
    }

    public static void main(String[] args) {
        TeacherMath teacherMath = new TeacherMath();
        teacherMath.name = "Anna";
        teacherMath.experience = 10;
        teacherMath.salary = 100000.00;
        teacherMath.hasAMultiplicationЕablу = true;
        teacherMath.printTeacherMath();
        teacherMath.print();
    }
}

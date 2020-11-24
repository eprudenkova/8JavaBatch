package com.syntax.class20;

public class TeacherChemistry extends Teacher {
    boolean hasAPeriodicTablePoster;

    void printTeacherChemistry() {
        System.out.println("From TeacherChemistry");
    }

    public static void main(String[] args) {
        TeacherChemistry teacherChemistry = new TeacherChemistry();
        teacherChemistry.name = "John";
        teacherChemistry.experience = 5;
        teacherChemistry.salary = 100000.00;
        teacherChemistry.hasAPeriodicTablePoster = true;
        teacherChemistry.printTeacherChemistry();
        teacherChemistry.print();
    }
}

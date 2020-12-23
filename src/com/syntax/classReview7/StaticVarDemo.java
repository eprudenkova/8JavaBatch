package com.syntax.classReview7;

class Student {

    static int totalStudentCount;
    static String schoolName = "Syntax";
    String name;
    final static int MAX_STUDENTS_ALLOWED = 3;

    Student() {
        totalStudentCount++;
    }

    void printInfo() {
        System.out.println(totalStudentCount + " " + schoolName + " " + name);
    }
}

class School {

//    you can have thousands of students in a school, however, you cannot have more than X in a single class
    Student[] students = new Student[Student.MAX_STUDENTS_ALLOWED];
    int studentCounter = 0;

    public void addStudent(Student student) {
        if (studentCounter < Student.MAX_STUDENTS_ALLOWED) {
//            students[studentCounter++] = student;// instead of next 2 lines
            students[studentCounter] = student;
            studentCounter++;
            System.out.println(student.name+" admitted");
        } else {
            System.out.println("No more room");
        }
    }
}

public class StaticVarDemo {
    public static void main(String[] args) {

        School school = new School();

        Student student1 = new Student();
        student1.name = "Ali";
        student1.printInfo();
        school.addStudent(student1);


        Student student2 = new Student();
        student2.name = "Anna";
        student2.printInfo();
        school.addStudent(student2);

        Student student3 = new Student();
        student3.name = "Tom";
        student3.printInfo();
        school.addStudent(student3);

        Student student4 = new Student();
        student4.name = "Jerry";
        student4.printInfo();
        school.addStudent(student4);
    }
}

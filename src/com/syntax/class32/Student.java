package com.syntax.class32;

//    Create a Set collection that will hold Objects of Student Type.
//    In this Set we do not care about the insertion order.
//    Each student object should have name and studentID.
//    Display name of each student.

public abstract class Student {

    String name;
    String studentID;
    String password;

    Student(String name, String studentID, String password) {
        this.name = name;
        this.studentID = studentID;
        this.password = password;
    }

    public void myNameIs() {
    }

    public void myStudentIDIs(String password) {
    }
}

class Anna extends Student {

    Anna(String name, String studentID, String password) {
        super(name, studentID, password);
    }

    @Override
    public void myNameIs() {
        System.out.println("I am first student my name is " + name);
    }

    @Override
    public void myStudentIDIs(String password) {
        System.out.println("I am first student "+name+" my ID is " + studentID);
    }
}

class John extends Student {

    John(String name, String studentID, String password) {
        super(name, studentID, password);
    }

    @Override
    public void myNameIs() {
        System.out.println("I am second student my name is " + name);
    }

    @Override
    public void myStudentIDIs(String password) {
        System.out.println("I am second student "+name+" my ID is " + studentID);
    }
}

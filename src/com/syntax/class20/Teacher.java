package com.syntax.class20;
public class Teacher {
    /*
    3. Write a Java program called Teacher. Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour. Test all 4 classes
     */
    String name;
    double salary;
    int experience;

    Teacher(){

    }

    Teacher (String name){
        this.name = name;
    }
    Teacher (String name, double salary){
        this(name);
        this.salary=salary;
    }
    Teacher(String name, double salary, int experience){
        this(name,salary);
        this.experience = experience;
    }
    void print(){
       System.out.println("From Teacher Class:");
       System.out.println("Name "+name+" Experience "+experience+" Salary "+salary);
    }
}

package com.syntax.class19;

public class Student {
    /*
    2) Write a java program of Class Students that takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */

    String name;
    double subject1;
    double subject2;
    double subject3;

    //    Purple - means  instance var
    Student(String nameValue, double subject1Value, double subject2Value, double subject3Value) {
        name = nameValue;//
        subject1 = subject1Value;
        subject2 = subject2Value;
        subject3 = subject3Value;
    }

    void printGradeAverage() {
        double avg = (subject1 + subject2 + subject3) / 3;
        System.out.println("Average marks for " + name + " is " + avg);
    }

    void printMaxGrade(){
        if(subject1>=subject2&&subject1>=subject3){
            System.out.println("Max marks for "+name+" is "+subject1);
        }else if(subject2>=subject1&&subject2>=subject3) {
            System.out.println("Max marks for " + name + " is " + subject2);
        }else if(subject3>=subject1&&subject3>=subject2) {
            System.out.println("Max marks for " + name + " is " + subject3);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Marta", 95, 90, 91);
        Student student2 = new Student("Jack", 87, 80, 97);
        Student student3 = new Student("Danilo", 100, 100, 100);
        Student student4 = new Student("Anna", 100, 90, 80);
        Student student5 = new Student("Maria", 95, 95, 95);
        student1.printGradeAverage();
        student2.printGradeAverage();
        student3.printGradeAverage();
        student4.printGradeAverage();
        student5.printGradeAverage();
        student1.printMaxGrade();
        student2.printMaxGrade();
        student3.printMaxGrade();
        student4.printMaxGrade();
        student5.printMaxGrade();
    }
}

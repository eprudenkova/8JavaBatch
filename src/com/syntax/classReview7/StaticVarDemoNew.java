package com.syntax.classReview7;

class StudentNew {

    static int totalStudentCount;
    static String schoolName = "Syntax";
    String name;
    final static int MAX_STUDENTS_ALLOWED = 3;
    private static StudentNew student = null;

    private StudentNew() {
        totalStudentCount++;
    }

    static StudentNew getInstance(){
        if(student==null){
            student = new StudentNew();
        }
        return student;
    }

    void printInfo() {
        System.out.println(totalStudentCount + " " + schoolName + " " + name);
    }

}

public class StaticVarDemoNew {
    public static void main(String[] args) {

        StudentNew student1 = StudentNew.getInstance();
        student1.name = "Mary";
        student1.printInfo();
        System.out.println(student1.name);//Mary


        StudentNew student2 = StudentNew.getInstance();
        student2.name = "Davit";
        student2.printInfo();

        System.out.println(student1.name);//Davit
        System.out.println(student2.name);//Davit






    }
}

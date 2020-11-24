package com.syntax.classReview;

public class SchoolClass {

//    instance var --> are created inside classes but outside of any methods
//    States / attributes of our objects
//    values are different for each object of the class



    String name, lastname;
    int age;

//    static var --> defines the class and value is same for all objects
//    we do not need to create an object to access them
//    can be accessible by using ClassName
    static String schoolName;

//    local var --> inside where it is created
//    there are created inside a method or a block of code

//    access modifiers --> public, protected, default, private
//    can we use with local? no
//    can we use with instance? yes
//    can we use with static? yes

//    What kind of methods we have -->
//    1. built-in methods
//    2. User defined methods

    public void printDetails(){
        System.out.println("Name and Last Name "+name+lastname);
        System.out.println("Age "+age);
    }
    public void study(int hour){
        System.out.println(name+" "+lastname+" studies "+hour+" a day");
    }
    public static void goToSchool(){
        System.out.println("Students go to "+schoolName);
    }
}

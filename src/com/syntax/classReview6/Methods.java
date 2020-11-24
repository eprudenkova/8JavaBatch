package com.syntax.classReview6;

public class Methods {
    public static void main(String[] args) {
        String name = "Jack Plantin";
//        built-in methods are read nly we can not modify them
        System.out.println(name.length());
        Methods methods = new Methods();
        methods.getAndPrintLength("Jack");//non-static method call
//        if we do not write a method we have to repeat the code for all of the name

        String name1 = "Anna";
        String name2 = "Jerry";
        String name3 = "Asghar";

//        but if we write a method this is how it will replay
        methods.getAndPrintLength(name1);
        methods.getAndPrintLength(name2);
        methods.getAndPrintLength(name3);

    }
    public int getAndPrintLength(String name){
        int length = name.length();
        if(length>15){
            System.out.println("Your name is too long");
        }else{
            System.out.println("You are good to go");
        }
        return length;

    }
}

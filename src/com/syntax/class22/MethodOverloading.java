package com.syntax.class22;

public class MethodOverloading {

//    we can not overload fields!
//    int name;
//    String name:

    public void print() {
        System.out.println("Print with NO arguments");
    }

    public void print(String name, int number) {
        System.out.println("String name, int number");
    }

    public void print(int number, String name) {
        System.out.println("int number, String name");
    }

    public void print(int number, String name, String lastname) {
        System.out.println("int number, String name, String lastname");
    }
//    public static void print(int number,String name){
//    System.out.println("int number,String name");//CE can not overload by making a method as static
//    }


//    private void print(int number, String name) {
//    System.out.println("int number,String name");//CE vy changing the access modifier we can't overload methods
//    }

//    public String print(int number,String name){
//    System.out.println("int number,String name");//CE By changing the return type we can't overload method
//    return "name";
//    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.print();
        methodOverloading.print("name",123);
        methodOverloading.print(123,"name");
        methodOverloading.print(123,"name","lastname");


    }
}

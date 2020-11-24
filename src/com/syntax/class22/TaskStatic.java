package com.syntax.class22;

public class TaskStatic {
//    Create 1 class with a static method that has 3 overloaded forms.
//    Then call each overloaded method with specific arguments and observe result.

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(double a, double b) {
        System.out.println(a + b);
    }

    static void add(double a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        TaskStatic.add(3, 5);
        TaskStatic.add(2.99, 5.99);
        TaskStatic.add(2.99, 5);
        TaskStatic.add(5, 2.99);
    }
}
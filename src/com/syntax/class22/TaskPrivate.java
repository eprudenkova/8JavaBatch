package com.syntax.class22;

public class TaskPrivate {

    private void add(int a, int b) {
        System.out.println(a + b);
    }

    private void add(double a, double b) {
        System.out.println(a + b);
    }

    private void add(double a, int b) {
        System.out.println(a + b);
    }

    private void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        TaskPrivate sum = new TaskPrivate();
        sum.add(2, 4);
        sum.add(2.99, 5.99);
        sum.add(2.99, 5);
        sum.add(5, 2.99);
    }
}

package com.syntax.classReview5;

public class MethodInsideMethod {
    protected int number = 1;

    void m1(){
        System.out.println("m1");
        m2();
    }
    void m2(){
        System.out.println("m2");
    }



    public static void main(String[] args) {
        MethodInsideMethod h = new MethodInsideMethod();
        h.m1();
        h.m2();




    }
}

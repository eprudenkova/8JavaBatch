package com.syntax.classReview12;

import java.util.ArrayList;

public class MethodOverloading {

    public void addPrint(int num1, int num2) {
        System.out.println("result int " + (num1 + num2));
    }

    public void addPrint(String num1, String num2) {
        System.out.println("result String " + (Double.parseDouble(num1) + Double.parseDouble(num2)));
    }

    public void addPrint(double num1, String num2) {
        System.out.println("result double + String " + (num1 + Double.parseDouble(num2)));
    }

    public void addPrint(String num1, double num2) {
        System.out.println("result String + double " + (Double.parseDouble(num1) + num2));
    }

    public void addPrint(String num1, double num2, double num3) {
        System.out.println("result String + double + double " + (Double.parseDouble(num1) + num2 + num3));
    }

    public void addPrint(int... num1) {//same as Array
        int sum = 0;
        for (int num : num1) {
            sum = sum + num;
        }
        System.out.println("result varargs " + sum);
    }

    public void addPrint(double num1, double num2) {
        System.out.println("result double " + (num1 + num2));
    }

//    public void addPrint(int[] numArray) {
//        int sum = 0;
//        for (int num : numArray) {
//            sum = sum + num;
//        }
//        System.out.println("result Array "+sum);
//    }

    public void addPrint(ArrayList<Integer> numArr) {
        int sum = 0;
        for (int num : numArr) {
            sum = sum + num;
        }
        System.out.println("result ArrayList " + sum);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.addPrint(10, 20);//30
        mo.addPrint("10", "20");//30.0
        mo.addPrint(10.0, "20");//30.0
        mo.addPrint("10", 20.0);//30.0
        mo.addPrint("10", 20.0, 20.0);//50.0
        mo.addPrint(10, 20, 30, 40);//100
        mo.addPrint(10.0, 20.0);//30.0
//        mo.addPrint(new int[]{10, 20});
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        mo.addPrint(arrayList);//30
    }
}

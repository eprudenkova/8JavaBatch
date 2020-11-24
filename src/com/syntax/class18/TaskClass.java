package com.syntax.class18;

public class TaskClass {

//    Create a method that will accept an array as parameters and
//    will return a sum of all elements from that array.
//    Method should be visibly only within same package and
//    accessible by the creating an instance of the class.

    double sumArray(double[] array) {
        int sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum;
    }
}

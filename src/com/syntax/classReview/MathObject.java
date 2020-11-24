package com.syntax.classReview;

public class MathObject {
    public static void main(String[] args) {
        MathClass math = new MathClass();
        math.sum(5,10);

        int product = math.multiply(3,4);//does not return
        System.out.println(math.multiply(3,4));//arguments
    }
}

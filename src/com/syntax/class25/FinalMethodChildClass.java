package com.syntax.class25;

public class FinalMethodChildClass extends FinalMethodClass {

    double PI = 3.15;

    @Override
    double add(double num1, double num2) {
//        super.PI= 3.15;//CE cannot change a final field
//        Math.PI=20;

        double add = super.add(num1, num2);
        System.out.println("Result " + add);
        return add;
    }

//    public void method(){//CE
//    }
}

package com.syntax.class17;

public class LocalVariables {
    public static void main(String[] args) {
        LocalVariables var1 = new LocalVariables();
        var1.varsDemo1();
        var1.varsDemo2();
    }
    public void varsDemo1(){
        int num1=10;
        {
            int num = 10;
        }
//        System.out.println(num); outside {}
        System.out.println(num1);
    }
    public void varsDemo2(){
//        System.out.println(num1);//num1 - local variable that visible only within method it was declared
        int num2=-10;
        System.out.println(num2);
    }
}

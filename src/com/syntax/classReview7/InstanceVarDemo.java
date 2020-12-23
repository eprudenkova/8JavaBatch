package com.syntax.classReview7;

public class InstanceVarDemo {

String name = "Mahmut";
    public static void main(String[] args) {
        String name = "Ali";
        System.out.println(name);//Ali

        InstanceVarDemo instanceVarDemo = new InstanceVarDemo();
        System.out.println(instanceVarDemo.name);//Mahmut
        instanceVarDemo.name = "Burju";
        System.out.println(instanceVarDemo.name);//Burju


    }
}

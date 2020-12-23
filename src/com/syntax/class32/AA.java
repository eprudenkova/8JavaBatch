package com.syntax.class32;

public class AA {

    int a = 4;

    int printInfo(){
        a = 6;
        return a;
    }



}

class BB{

    public static void main(String[] args) {

        AA aa = new AA();
        aa.a = 8;
        System.out.println(aa.printInfo());
    }
}

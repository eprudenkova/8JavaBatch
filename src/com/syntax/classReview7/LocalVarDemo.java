package com.syntax.classReview7;

public class LocalVarDemo {
    public static void main(String[] args) {
        for (int i = 0; i< 5; i++){
            System.out.println(i);
//            System.out.println(a);//CE
            {
//                local variable limited to this..
                int a = 10;
            }
//            System.out.println(a);//CE cannot find symbol -- outside of block of code
        }
//        System.out.println(i);//CE cannot find symbol -- outside of block of code
    }

    public static void print(){

//        int a;
//        System.out.println(a);
        int a=0;
        System.out.println(a);//must be innitilized
    }
}

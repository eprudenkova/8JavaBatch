package com.syntax.classReview6;

public class Calculator {
    int num;
    Calculator(int num){
        this.num=num;
    }
    int add(int num){
       return  this.num = this.num + num;
    }
    int sub(int num){
        return  this.num = this.num - num;
    }
    void printNumber(){
        System.out.println(num);
    }


}

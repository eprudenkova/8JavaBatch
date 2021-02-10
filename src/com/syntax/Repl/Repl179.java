package com.syntax.Repl;

public class Repl179 {
}

interface Outputs{
    void display(double result);
}

interface Functions extends Outputs{
    double adding(double num1, double num2);
    double subtracting(double num1, double num2);
    double multiply(double num1, double num2);
    double dividing(double num1, double num2);
}

class Main implements Functions{

    @Override
    public void display(double result) {
        System.out.println("Result is ::: "+ result);
    }

    @Override
    public double adding(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double subtracting(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double dividing(double num1, double num2) {
        return num1/num2;
    }

    public static void main(String[] args) {
        double num1=100.00;
        double num2 = 20.00;
        double result;

        Main obj = new Main();
        result = obj.adding(num1,num2);
        obj.display(result);
        result = obj.subtracting(num1,num2);
        obj.display(result);
        result = obj.multiply(num1,num2);
        obj.display(result);
        result = obj.dividing(num1,num2);
        obj.display(result);
    }
}

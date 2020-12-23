package com.syntax.classReview12;

public class Employee {
     String name;
     String lastName;
     double bonus;
     Employee(){

     }

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        if (salary>150000){
            bonus = 0.5;
        }else{
            bonus = 0.3;
        }
        System.out.println("Constructor called from the Parent Class");
    }
    public void display(){
        System.out.println(name+" "+lastName);
    }

}
class Tester extends Employee{

    String team;
    double bonus;//same name
    double salary;

    public Tester(String name, String lastName, String team,double salary) {
        super(name, lastName, salary);
        this.salary=salary;
        this.team=team;
        System.out.println("Constructor called from the Child Class");

    }

    public void display(){
        super.display();
        System.out.println(team+" bonus + salary = "+(salary*super.bonus+salary)+" Parent bonus ="+super.bonus+" Child bonus = "+bonus);
    }
}

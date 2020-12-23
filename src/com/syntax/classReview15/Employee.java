package com.syntax.classReview15;

public abstract class Employee {

    double  salary;
    double bonus;
    double medicalAllowance;
    public abstract void getPaid();

    public Employee(double salary, double bonus, double medicalAllowance) {
        this.salary = salary;
        this.bonus = bonus;
        this.medicalAllowance = medicalAllowance;
    }
}

class FullTimeEmployee extends Employee{

    public FullTimeEmployee(double salary, double bonus, double medicalAllowance) {
        super(salary, bonus, medicalAllowance);
    }

    public void printInfo(){
        System.out.println("I am a FullTimeEmployee");
    }

    @Override
    public void getPaid() {
        System.out.println("FullTime salary "+(salary+bonus+medicalAllowance));
    }

}

class PartTimeEmployees extends Employee{

    public PartTimeEmployees(double salary, double bonus,  double medicalAllowance) {
        super(salary, bonus,medicalAllowance);
    }

    public void vacation(){
        System.out.println("I am a PartTimeEmployee I do not go on vacation");
    }

    @Override
    public void getPaid() {
        System.out.println("PartTime salary "+salary);
    }
}

class ContractTimeEmployee extends Employee{

    public ContractTimeEmployee(double salary, double bonus,  double medicalAllowance) {
        super(salary, bonus, medicalAllowance);
    }


    public void printContract(){
        System.out.println("I am a ContractTimeEmployee I have a contract");
    }

    @Override
    public void getPaid() {
        System.out.println("ContractTime salary "+(salary+bonus));
    }
}

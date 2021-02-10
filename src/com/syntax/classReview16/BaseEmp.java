package com.syntax.classReview16;

public abstract class BaseEmp {
    public abstract double getMonthlySalary();
}

class PermanentEmp extends BaseEmp{
    double annualSalary;
    PermanentEmp(double annualSalary){
        this.annualSalary=annualSalary;
    }

    public double getMonthlySalary(){
        return annualSalary/12;
    }
}

class ContractEmp extends BaseEmp{
    double numberOfHours;
    double hourlyRate;
    ContractEmp(double numberOfHours, double hourlyRate){
        this.numberOfHours=numberOfHours;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double getMonthlySalary() {
        return hourlyRate*numberOfHours;
    }
}

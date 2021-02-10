package com.syntax.classReview16;

public class BaseEmpTester {
    public static void main(String[] args) {
        BaseEmp permanentEmp = new PermanentEmp(100000);
        System.out.println(permanentEmp.getMonthlySalary());

        BaseEmp contractEmp = new ContractEmp(240, 50);
        System.out.println(contractEmp.getMonthlySalary());
    }
}

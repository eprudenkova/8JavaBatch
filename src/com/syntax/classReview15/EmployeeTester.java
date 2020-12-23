package com.syntax.classReview15;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(100000,20000,30000);
        Employee partTimeEmployee = new PartTimeEmployees(100000,20000,30000);
        Employee contractTimeEmployee = new ContractTimeEmployee(100000,20000,30000);

        fullTimeEmployee.getPaid();
        partTimeEmployee.getPaid();
        contractTimeEmployee.getPaid();

        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee(100000,5000,10000);
        fullTimeEmployee1.printInfo();
        fullTimeEmployee1.getPaid();





    }
}

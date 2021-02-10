package com.syntax.Repl;

public class Repl180 {
}

class EncapsulationDemo {
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

class MainClass {
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setEmpName("John");
        obj.setEmpAge(30);

        System.out.println("Employee name: "+obj.getEmpName());
        System.out.println("Employee age: "+obj.getEmpAge());

    }
}

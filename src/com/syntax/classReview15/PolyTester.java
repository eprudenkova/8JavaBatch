package com.syntax.classReview15;

public interface PolyTester {
    public static void main(String[] args) {
        EmployeeDemo var1 = new Secretary();
        LegalSecratary var2 = new LegalSecratary();
        EmployeeDemo var3 = new Lawyer();
        EmployeeDemo var4 = new LegalSecratary();
        EmployeeDemo var5 = new EmployeeDemo();
        Object var6 = new Secretary();

        // var3.method3();
        // var2.method2();
        // var3.method1();
        // var4.method1();
        // var5.method1();
        // var6.method1(); CE
        // var1.method1();
        //  var3.method2();
        //  var1.method3();
        // ((LegalSecratary)var6).method1(); // Exception because secretary and legal are different classes
        // ((Secretary)var3).method2();
        //  ((LegalSecratary)var4).method2();
        // ((EmployeeDemo)var6).method3();
        // ((Secretary)var4).method3();

        ((Lawyer) var3).method2();
    }
}
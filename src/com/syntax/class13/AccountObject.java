package com.syntax.class13;

public class AccountObject {
    public static void main(String[] args) {
        AccountClass account1 = new AccountClass();
        account1.accountId = "123";
        account1.userName = "John";
        account1.password = "pass123";
        account1.balance = 1000000;
        account1.typeOfAccount = "checking";
        account1.limit = 125;

        boolean isLoggedIn1 = account1.login("John","pass123");
        System.out.println(isLoggedIn1);//true

        boolean isLoggedIn2 = account1.login("Kate","pass123");
        System.out.println(isLoggedIn2);//false

        AccountClass account2 = new AccountClass();
        account2.accountId = "125";
        account2.userName = "Bob";
        account2.password = "pass333";
        account2.balance = 15000;
        account2.typeOfAccount = "saving";
        account2.limit = 100;

        boolean isLoggedIn3 = account2.login("Bob","pass333");
        System.out.println(isLoggedIn3);//true

        if (isLoggedIn3){
            System.out.println("Welcome to Syntax Bank "+account2.userName);
        }else{
            System.out.println("Invalid user name or password");
        }

        double amountToTransfer=account2.transfer(100);

        if(amountToTransfer==0){
            System.out.println("Insufficient balance");
        }else{
            System.out.println(amountToTransfer+" transferred");
            System.out.println((account2.balance-amountToTransfer)+" new balance");
        }
    }
}

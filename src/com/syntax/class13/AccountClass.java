package com.syntax.class13;

import com.syntax.class05.ScannerClass;

import java.util.Scanner;

public class AccountClass {
    String accountId;
    String userName;
    String password;
    String typeOfAccount;
    double balance;
    double limit;

//    define behavior //method inside programming
//    specify datatype - boolean //declare method - login()
    boolean login (String enterUserName,String enterPassword) {
        if (userName.equals(enterUserName) && password.equals(enterPassword)) {
            return true;
        } else {
            return false;
        }
    }
//        write a method that takes the amount that user wants to transfer it
//        deducts the amount from your balance and
//        returns the amount of transfer in case of success or a 0 in case of failure

        double amountToTransfer(double amountToTransfer){
            System.out.println("Your balance: "+balance);
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the amount to transfer:");
            amountToTransfer = input.nextInt();
            System.out.println("Amount to transfer: "+amountToTransfer);
            if(amountToTransfer<balance){
                return balance-amountToTransfer;
            }else {
                return 0;
            }
        }
}

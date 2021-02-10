package com.syntax.class13;

public class AccountClass {
    String accountId;
    String userName;
    String password;
    String typeOfAccount;
    double balance;
    double limit;

//    define behavior //method inside programming
//    specify datatype - boolean //declare method - login()
    boolean login (String enteredUserName,String enteredPassword) {
        if (userName.equals(enteredUserName) && password.equals(enteredPassword)) {
            return true;
        } else {
            return false;
        }
    }
//        write a method that takes the amount that user wants to transfer
//        it deducts the amount from your balance and
//        returns the amount of transfer in case of success or a 0 in case of failure

        double transfer(double amountToTransfer){
            System.out.println("Your balance: "+balance);
            System.out.println("Amount to transfer: "+amountToTransfer);
            if(amountToTransfer<balance){
                return amountToTransfer;
            }else {
                return 0;
            }
        }
}

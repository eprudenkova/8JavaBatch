package com.syntax.class30;

public class Encapsulation {

    private double accountBalance;
    private String password;
    private String securityQuestion;

    public void accessAccountBalance(String password) {
        if (this.password.equals(password)) {
            System.out.println("your account balance" + accountBalance);
        }
    }

    public void setAccountBalance(String password, String securityQuestion, double balance) {
        if (this.password.equals(password) && this.securityQuestion.equals(securityQuestion)) {
            this.accountBalance = accountBalance;
        }
    }
}

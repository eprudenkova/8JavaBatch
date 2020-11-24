package com.syntax.class22;

public class UserInfo extends UserClass {
    String userAddress;

    UserInfo(String name, String mobile, String address) {
        super(name, mobile);
        this.userAddress = address;
    }

    void UserDetails() {
        System.out.println("User name is " + super.getName() + " has a mobile number " +
                super.getMobileNumber() + " and lives in " + userAddress);
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Anna", "(111)111-11-11", "Brooklyn, NY");
        userInfo.UserDetails();
        UserInfo userInfo1 = new UserInfo("Mike", "(111)111-11-11", "Brooklyn, NY");
        userInfo1.UserDetails();
    }
}

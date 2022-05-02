package com.FWSA;

public class UserDetails {

    public static void main(String[] args) {

        UserData myObj = new UserData();

        myObj.setAccountNumber(543626);
        myObj.setPassword("Pavan");

        System.out.println(myObj.getAccountNumber() + " " +myObj.getPassword() );
    }
}

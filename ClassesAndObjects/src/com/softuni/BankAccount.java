package com.softuni;

public class BankAccount {

    private static int interest; //лихва

    public static int getInterest() {
        return interest;
    }

    public static void setInterest(int interest) {
        BankAccount.interest = interest;
    }
}

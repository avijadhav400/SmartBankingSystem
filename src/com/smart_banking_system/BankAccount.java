package com.smart_banking_system;

abstract class BankAccount implements Account{
    int accNo;
    String holderName;
    double balance;

    public BankAccount(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}

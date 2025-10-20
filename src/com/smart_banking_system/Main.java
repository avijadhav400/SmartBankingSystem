package com.smart_banking_system;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new SavingAccount(101, "avinash",60000);
        TransactionThread t1 = new TransactionThread(account,50000,true);
        TransactionThread t2 = new TransactionThread(account,10000,false);
        TransactionThread t3 = new TransactionThread(account,100000,true);
        t1.start();
        t2.start();
        t3.start();


    }
}

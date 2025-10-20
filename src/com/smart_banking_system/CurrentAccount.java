package com.smart_banking_system;

public class CurrentAccount extends BankAccount {
    double overdraft = 10000;
    public CurrentAccount(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println(Thread.currentThread().getName()+" deposited "+amount);
        System.out.println("Total Balance: "+balance);
    }

    @Override
    public synchronized void withdraw(double amount) {
        if(amount<= (balance+overdraft)){
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+" withdrawn "+amount);
            System.out.println("Available balance: "+balance);
        }else{
            System.out.println(Thread.currentThread().getName()+" failed to withdraw "+amount+" (Insufficient balance: "+balance+")");

        }

    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

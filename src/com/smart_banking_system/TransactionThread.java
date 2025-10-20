package com.smart_banking_system;

public class TransactionThread extends  Thread {
    private BankAccount account;
    private int amount;
    private boolean isWithdrawal;

    public TransactionThread(BankAccount account, int amount, boolean isWithdrawal){
        this.amount = amount;
        this.account = account;
        this.isWithdrawal = isWithdrawal;
    }


    public void run(){
        if(isWithdrawal){
            account.withdraw(amount);
        }else {
            account.deposit(amount);
        }
    }

}

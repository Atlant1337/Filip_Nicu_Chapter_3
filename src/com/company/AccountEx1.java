//ex1
package com.company;

public class AccountEx1 {
    private double balance;

    public AccountEx1(double initialBalance){

        if(initialBalance > 0.0)
            balance = initialBalance;
    }

    public void credit(double amount){
        balance += amount;
    }

    public boolean debit(double amount){

        if(amount > balance)
            return false;

        balance -= amount;
        return true;
    }

    public double getBalance(){
        return balance;
    }
}
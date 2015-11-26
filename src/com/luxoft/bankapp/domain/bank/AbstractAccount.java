package com.luxoft.bankapp.domain.bank;

/**
 * Created by 2 on 11/25/2015.
 */
public abstract class AbstractAccount implements Account {

    private double balance;

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    //@Override
    //public abstract double getOverdraft();

    @Override
    public void deposit(double x) {
        System.out.println(balance + "+" + x + " ");
        balance = balance + x;
        System.out.println("Баланс пополнен на " + x + " Текущий баланс: " + balance);
    }

    //@Override
    //public abstract void withdrow(double x);
}

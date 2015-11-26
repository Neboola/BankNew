package com.luxoft.bankapp.domain.bank;

/**
 * Created by 2 on 11/25/2015.
 */
public class SavingsAccount extends AbstractAccount {
    //private double balance;


    public SavingsAccount(double balance) {
        super.setBalance(balance);
    }

    @Override
    public double getOverdraft() {
        return 0;
    }
/*
    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double x) {
        System.out.println(balance + "+" + x + " ");
        balance = balance + x;
        System.out.println("Баланс пополнен на " + x + " Текущий баланс: " + balance);
    }
*/
    @Override
    public void withdrow(double x) {
        double balance = super.getBalance();
        System.out.println(balance + "-" + x + " ");
        if (balance >= x) {
            super.setBalance(balance - x);
            System.out.println("Баланс уменьшен на " + x + " Текущий баланс: " + super.getBalance());
        } else {
            System.out.println("Недостаточно средств для снтия. На счету: " + super.getBalance() + " Требуется: " + x);
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount";
    }

    @Override
    public double maximumAmountToWithdraw() {
        return super.getBalance();
    }
}

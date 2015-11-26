package com.luxoft.bankapp.domain.bank.accounts;

/**
 * Created by 2 on 11/25/2015.
 */
public class CheckingAccount extends AbstractAccount {

    //private double balance;

    private double overdraft;

    public CheckingAccount(double balance) {
        super.setBalance(balance);
    }



    @Override
    public double getOverdraft() {
        return overdraft;
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
            System.out.print("Выдано: " + x + " ");
            overdraft = overdraft + (-(balance - x));
            super.setBalance(balance - balance);
            System.out.println("Текущий баланс: " + super.getBalance() + ". Кредит: " + overdraft);
        }

        assert isPositive(overdraft);
    }

    private boolean isPositive(double overdraft) {
        System.out.println("===== overdraft checked");
        return overdraft >= 0;
    }

    @Override
    public String toString() {
        return "CheckingAccount";
    }

    @Override
    public double maximumAmountToWithdraw() {
        if (super.getBalance() > overdraft) return (super.getBalance() - overdraft);
        else return 0;
    }


}

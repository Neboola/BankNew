package com.luxoft.bankapp.domain.bank;

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
            overdraft = overdraft + (-(balance - x));
            super.setBalance(balance - balance);
            System.out.println("Недостаточно средств для снтия. Текущий баланс: " + super.getBalance() + ". Кредит: " + overdraft);
        }
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

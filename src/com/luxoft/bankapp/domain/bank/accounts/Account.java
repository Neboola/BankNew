package com.luxoft.bankapp.domain.bank.accounts;

import com.luxoft.bankapp.domain.bank.exceptions.NotEnoughFundsException;

/**
 * Created by 2 on 11/24/2015.
 */
public interface Account {

    double maximumAmountToWithdraw();

    double getBalance();

    double getOverdraft();
    double getOverdraftLimit();
    void setOverdraftLimit(double overdraftLimit);

    void deposit(double x);

    void withdrow(double x) throws NotEnoughFundsException;

    String getCreditMessage();

}

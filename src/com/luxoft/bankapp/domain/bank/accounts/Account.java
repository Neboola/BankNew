package com.luxoft.bankapp.domain.bank.accounts;

import com.luxoft.bankapp.domain.bank.exceptions.NotEnoughFundsException;

/**
 * Created by 2 on 11/24/2015.
 */
public interface Account {

    double maximumAmountToWithdraw();

    double getBalance();

    double getOverdraft();

    void deposit(double x);

    void withdrow(double x) throws NotEnoughFundsException;

}

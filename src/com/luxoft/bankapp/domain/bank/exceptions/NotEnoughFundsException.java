package com.luxoft.bankapp.domain.bank.exceptions;

/**
 * Created by 2 on 11/26/2015.
 */
public class NotEnoughFundsException extends BankException {


    public String getCreditMessage() {
        return message;
    }

    private String message;
    private double amount;
    public double getAmount() {
        return amount;
    }

    public NotEnoughFundsException(double amount, String message) {


        this.amount = amount;

    }


}

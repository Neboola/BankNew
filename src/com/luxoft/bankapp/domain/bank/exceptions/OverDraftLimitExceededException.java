package com.luxoft.bankapp.domain.bank.exceptions;

/**
 * Created by 2 on 11/26/2015.
 */
public class OverDraftLimitExceededException extends NotEnoughFundsException {

    //private String message;
    public OverDraftLimitExceededException(double amount, String message) {
        super(amount, message);
    }
}

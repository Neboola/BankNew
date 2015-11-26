package com.luxoft.bankapp.domain.bank.exceptions;

/**
 * Created by 2 on 11/26/2015.
 */
public class OverDraftLimitExceededException extends NotEnoughFundsException {


    public OverDraftLimitExceededException(double amount) {
        super(amount);
    }
}

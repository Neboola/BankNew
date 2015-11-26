package com.luxoft.bankapp.domain.bank;

/**
 * Created by 2 on 11/25/2015.
 */
public enum Gender {
    MALE(true),
    FEMALE(false);

    private boolean isMale;

    private Gender(boolean isMale){
        this.isMale = isMale;
    }

    @Override
    public String toString() {

        return isMale ? "Mr." : "Ms.";
    }
}

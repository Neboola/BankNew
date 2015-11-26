package com.luxoft.bankapp.domain.bank.users;

/**
 * Created by 2 on 11/25/2015.
 */
public enum Gender {
    MALE("Mr."),
    FEMALE("Ms.");

    private String s; //String

    private Gender(String s){
        this.s = s;
    }

    @Override
    public String toString() {

        return s;
    }
}

package com.luxoft.bankapp.domain.bank.users;

import com.luxoft.bankapp.domain.bank.accounts.Account;
import com.luxoft.bankapp.domain.bank.exceptions.NotEnoughFundsException;

/**
 * Created by 2 on 11/24/2015.
 */
public class Client {


    private String name;
    private Gender gender;

    private Account account;

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public Client(Account account){

        this.account = account;

    }

    public Client(Account account, String name, Gender gender){

        this.account = account;
        this.name = name;
        this.gender = gender;

    }



    public void deposit(double x) {
        account.deposit(x);
    }


    public void withdrow(double x) throws NotEnoughFundsException {
        account.withdrow(x);
    }


    public String getClientSalutation(){
        return gender == null? "" : gender.toString();
    }

    @Override
    public String toString() {
        return ("Имя: " + gender + " " + name + " Аккаунт: " + account + ": Баланс: " + account.getBalance() + " Кредит: " + account.getOverdraft());
    }
}

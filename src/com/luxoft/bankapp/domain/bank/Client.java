package com.luxoft.bankapp.domain.bank;

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


    Client(Account account){
        System.out.println("Клиент добавлен. Баланс: " + account.getBalance());
        this.account = account;

    }




    public void deposit(double x) {
        account.deposit(x);
    }


    public void withdrow(double x) {
        account.withdrow(x);
    }


    public String getClientSalutation(){
        return gender == null? "" : gender.toString();
    }


}

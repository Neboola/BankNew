package com.luxoft.bankapp.domain.bank.app;

import com.luxoft.bankapp.domain.bank.accounts.CheckingAccount;
import com.luxoft.bankapp.domain.bank.accounts.SavingsAccount;
import com.luxoft.bankapp.domain.bank.exceptions.NotEnoughFundsException;
import com.luxoft.bankapp.domain.bank.listeners.EmailNotificationListener;
import com.luxoft.bankapp.domain.bank.listeners.PrintClientListener;
import com.luxoft.bankapp.domain.bank.model.Bank;
import com.luxoft.bankapp.domain.bank.users.Client;
import com.luxoft.bankapp.domain.bank.users.Gender;
import com.luxoft.bankapp.domain.bank.utils.BankService;

import java.util.Iterator;

/**
 * Created by 2 on 11/24/2015.
 */
public class BankApplication {




    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addListener(new PrintClientListener());
        bank.addListener(new EmailNotificationListener());

        //test(bank);

        BankService service = new BankService();

        for (int i = 0; i < 5; i++) {
            Client clientChecking = new Client(new CheckingAccount(random()), "Female Client " + i, Gender.FEMALE);
            clientChecking.getAccount().setOverdraftLimit(1000);
            service.addClient(bank, clientChecking);
        }

        for (int i = 0; i < 5; i++) {
            Client clientSaving = new Client(new SavingsAccount(random()), "Male Client " + i, Gender.MALE);
            service.addClient(bank, clientSaving);
        }



        modifyBank(bank,10);

        service.printMaximumAmountsToWithdraw(bank);

        modifyBank(bank,10);

        service.printMaximumAmountsToWithdraw(bank);

        modifyBank(bank,10);

        service.printMaximumAmountsToWithdraw(bank);



    }

    private static double random () {

        return (int)(Math.random() * 10000);
    }



    private static void modifyBank(Bank bank, int n){



        for (int i = 0; i < n; i++) {
            System.out.println();
            int number = (int)(Math.random() * bank.getClients().size());
            System.out.println("Клиент номер " + number + " Аккаунт: " + bank.getClients().get(number).getAccount());

                int random = (int)(Math.random() * 2);
                //System.out.println("Math.random " + random);
                switch (random){
                    case 0: //deposit
                        bank.getClients().get(number).deposit(random());
                        break;
                    case 1: //withdrow
                        try {
                            bank.getClients().get(number).withdrow(random());
                        } catch (NotEnoughFundsException e) {
                            System.out.println(e.getCreditMessage());

                        }

                        break;
                }

            }

        }



    }


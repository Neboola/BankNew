package com.luxoft.bankapp.domain.bank.utils;

import com.luxoft.bankapp.domain.bank.model.Bank;
import com.luxoft.bankapp.domain.bank.users.Client;

import java.util.Iterator;

/**
 * Created by 2 on 11/24/2015.
 */
public class BankService {

    public void addClient(Bank bank, Client client){
        bank.addClient(client);
    }

    public void printMaximumAmountsToWithdraw(Bank bank){
        System.out.println();

        Iterator<Client> it = bank.getClients().iterator();
        for (int i = 0; i < bank.getClients().size(); i++) {
            Client c = it.next();
            System.out.println("Клиент № " + i);
            System.out.println("   " + c);
            System.out.println("   Максимальная сумма для выдачи:" + c.getAccount().maximumAmountToWithdraw());

            if ((c.getAccount().getOverdraft() > 0.0) && (c.getAccount().maximumAmountToWithdraw() > 0)) {
                System.out.println("      ВНИМАНИЕ! Возможно погашение кредита за счет баланса.");
            }
        }


        System.out.println();
    }
}

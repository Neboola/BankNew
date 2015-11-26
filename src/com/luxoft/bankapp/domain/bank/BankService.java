package com.luxoft.bankapp.domain.bank;

import java.util.Iterator;

/**
 * Created by 2 on 11/24/2015.
 */
public class BankService {

    public void addClient(Bank bank, Client client){
        bank.addClient(client);
    }

    public void printMaximumAmountToWithdraw(Bank bank){
        System.out.println();

        Iterator<Client> it = bank.getClients().iterator();
        for (int i = 0; i < bank.getClients().size(); i++) {
            Client c = it.next();
            System.out.println("Клиент № " + i + " Имя :" + c.getName() + " Обращение: " + c.getGender());
            System.out.println("   Аккаунт: " + c.getAccount() + ": Баланс: " + c.getAccount().getBalance() + " Кредит: " + c.getAccount().getOverdraft());
            System.out.println("   Максимальная сумма для выдачи:" + c.getAccount().maximumAmountToWithdraw());

            if ((c.getAccount().getOverdraft() > 0.0) && (c.getAccount().maximumAmountToWithdraw() > 0)) {
                System.out.println("      ВНИМАНИЕ! Возможно погашение кредита за счет баланса.");
            }
        }


        System.out.println();
    }
}

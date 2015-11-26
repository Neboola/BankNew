package com.luxoft.bankapp.domain.bank.listeners;

import com.luxoft.bankapp.domain.bank.users.Client;

/**
 * Created by 2 on 11/26/2015.
 */
public class PrintClientListener implements ClientRegistrationListener {
    @Override
    public void onClientAdded(Client c) {
        System.out.println("Клиент добавлен: " + c);

    }
}

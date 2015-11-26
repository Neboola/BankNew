package com.luxoft.bankapp.domain.bank.listeners;

import com.luxoft.bankapp.domain.bank.users.Client;

/**
 * Created by 2 on 11/26/2015.
 */
public interface ClientRegistrationListener {

    void onClientAdded(Client c);
}

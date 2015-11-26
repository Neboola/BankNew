package com.luxoft.bankapp.domain.bank.model;

import com.luxoft.bankapp.domain.bank.listeners.ClientRegistrationListener;
import com.luxoft.bankapp.domain.bank.users.Client;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 2 on 11/24/2015.
 */
public class Bank {

    private ArrayList<ClientRegistrationListener> listeners = new ArrayList<ClientRegistrationListener>();

    public Bank() {
        addListener(new ClientRegistrationListener() {
            @Override
            public void onClientAdded(Client c) {
                System.out.println(c.getName() + " " + new Date());
            }
        });
    }

    public void addListener(ClientRegistrationListener listener) {
        listeners.add(listener);
    }
    public void notifyListeners(Client c){
        for (ClientRegistrationListener l : listeners) {
            l.onClientAdded(c);
        }
    }


    private ArrayList<Client> clients = new ArrayList<Client>();


    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addClient(Client client){
        clients.add(client);
        notifyListeners(client);

    }

    public void addClient(Client[] clientsArr){
        for (Client client : clientsArr)
        addClient(client);

    }



}

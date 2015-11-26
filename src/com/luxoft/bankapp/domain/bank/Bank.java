package com.luxoft.bankapp.domain.bank;

import java.util.ArrayList;

/**
 * Created by 2 on 11/24/2015.
 */
public class Bank {


    private ArrayList<Client> clients = new ArrayList<Client>();

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void addClient(Client client){
        clients.add(client);

    }

    public void addClient(Client[] clientsArr){
        for (Client client : clientsArr)
        addClient(client);

    }

}

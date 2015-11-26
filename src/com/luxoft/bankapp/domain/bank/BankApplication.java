package com.luxoft.bankapp.domain.bank;

import java.util.Iterator;

/**
 * Created by 2 on 11/24/2015.
 */
public class BankApplication {




    public static void main(String[] args) {

        Bank bank = new Bank();

        //test(bank);

        BankService service = new BankService();

        service.addClient(bank, new Client(new CheckingAccount(random())));
        service.addClient(bank, new Client(new CheckingAccount(random())));
        service.addClient(bank, new Client(new CheckingAccount(random())));
        service.addClient(bank, new Client(new CheckingAccount(random())));
        service.addClient(bank, new Client(new CheckingAccount(random())));
        service.addClient(bank, new Client(new SavingsAccount(random())));
        service.addClient(bank, new Client(new SavingsAccount(random())));
        service.addClient(bank, new Client(new SavingsAccount(random())));
        service.addClient(bank, new Client(new SavingsAccount(random())));
        service.addClient(bank, new Client(new SavingsAccount(random())));

        bank.getClients().get(1).setName("Maria Ivanova");
        bank.getClients().get(1).setGender(Gender.FEMALE);
        bank.getClients().get(3).setName("Boris Sidorov");
        bank.getClients().get(3).setGender(Gender.MALE);
        bank.getClients().get(5).setName("Vasiliy Pupkin");
        bank.getClients().get(5).setGender(Gender.MALE);

        print(bank);

        modifyBank(bank,10);

        service.printMaximumAmountToWithdraw(bank);

        modifyBank(bank,10);

        service.printMaximumAmountToWithdraw(bank);



    }

    private static double random () {

        return (int)(Math.random() * 10000);
    }

    private static void print (Bank bank) {
        System.out.println();

        Iterator<Client> it = bank.getClients().iterator();
        for (int i = 0; i < bank.getClients().size(); i++) {
            Client c = it.next();
            System.out.println("Клиент № " + i + ": Баланс: " + c.getAccount().getBalance() + " Кредит: " + c.getAccount().getOverdraft() + " Аккаунт: " + c.getAccount());
            //System.out.println("Salutation: " + c.getClientSalutation());
        }


        System.out.println();
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
                        bank.getClients().get(number).withdrow(random());
                        break;
                }

            }

        }

    private static void test(Bank bank){
        Client[] clients = new Client[10];
        for (int i = 0; i < 10; i++) {
            clients[i] = new Client(new SavingsAccount(random()));


        }

        bank.addClient(clients);

        print(bank);

        modifyBank(bank, 5);
        System.out.println();
    }

    }


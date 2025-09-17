package service;

import entities.Client;

import java.util.List;

public class ClientService {
    private List<Client> clients;

    public ClientService(List<Client>clients){
        this.clients = clients;

    }

//    auth

    public Client authentication(String email, String password){
        for (Client client: clients){
            if (client.getEmail().equals(email) && client.getMotDePasse().equals(password)){
                return client;
            }
        }
        return null; //  wrong email or password or not found in data


    }
}

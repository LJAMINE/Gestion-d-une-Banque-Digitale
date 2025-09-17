package service;

import entities.Banquier;
import entities.Client;
import entities.Compte;

import java.util.List;

public class BanquierService {
    private List<Banquier>banquiers;

    public BanquierService(List<Banquier>banquiers){
        this.banquiers=banquiers;
    }

    public Banquier authentication (String email,String password){
        for (Banquier banquier: banquiers){
            if (banquier.getEmail().equals(email) && banquier.getMotDePasse().equals(password)){
                return banquier;
            }
        }
        return null;
    }

    public void createClient(List<Client> clients,Client newClient){
        clients.add(newClient);
    }


}

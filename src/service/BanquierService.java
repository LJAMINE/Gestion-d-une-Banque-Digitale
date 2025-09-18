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
        return null; //  wrong email or password or not found in data
    }

    public void createClient(List<Client> clients,Client newClient){

      for (Client c : clients){
          if (c.getEmail().equals(newClient.getEmail())){
              System.out.println("Un client avec  ce email existe   !");
              return;
          }
      }
                      clients.add(newClient);
                }

    public void createCompte(Client client,Compte compte){

        if (client.getComptes().get(compte.getNumeroCompte())!=null){
            System.out.println("ce numero de compte deja existe ");
            return;
        }
                client.getComptes().put(compte.getNumeroCompte(),compte);

        // HashMap: key = account number, value = Compte object

    }



        public void deleteCompte(Client client , String numeroCompte){

                 Compte removedAccount =client.getComptes().remove(numeroCompte);

                     if (removedAccount==null){
                         System.out.println("compte not found ");
                     }else {
                         System.out.println("compte deleted successfully");

                     }

        }

}

import entities.Banquier;
import entities.Client;
import entities.Compte;
import entities.TypeCompte;
import service.BanquierService;
import service.ClientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        List<Client> clients=new ArrayList<>();
        clients.add(new Client("LMGRMJ","AMINE","123","amine@gmail.com",1));
//
//        nom
//                lm
//        prenom
//                amine
//        password
//        123
//        email
//        amine@gmail.com
//        ID Client: 23

        List<Banquier> banquiers=new ArrayList<>();
        banquiers.add(new Banquier("baquier","said","1234","said@gmail.com",0));

        ClientService clientService=new ClientService(clients);

        BanquierService banquierService = new BanquierService(banquiers);



        System.out.println("welcome in our application  !");
        System.out.println("choose your role  :");
        System.out.println("1. Client");
        System.out.println("2. Banquier");

        int role = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Email : ");
        String email = scanner.nextLine();
        System.out.print("Mot de passe : ");
        String password = scanner.nextLine();

        if (role == 1){
            Client client=clientService.authentication(email,password);
                if (client==null){
                    System.out.println("Authentification problem in pass or email ");
                    return;
                }
            System.out.println("Hello  " + client.getNom() );

//          menu

            boolean clientRun =true;

            while (clientRun){
                System.out.println("\nMenu Client :");
                System.out.println("1. Consulter le solde");
                System.out.println("2. Déposer de l'argent");
                System.out.println("3. Retirer de l'argent");
                System.out.println("4. Virement entre comptes");
                System.out.println("5. Consulter le relevé bancaire");
                System.out.println("0. Quitter");

                int choix=scanner.nextInt();
                scanner.nextLine();

                switch (choix){
                    case 1 :
                        System.out.println("Consulter"); break;
                    case 2 :
                        System.out.println("depot"); break;
                    case 3:
                        System.out.println("retirer"); break;
                    case 4 :
                        System.out.println("Virement entre compte"); break;
                    case 5 :
                        System.out.println("Consulter compte"); break;
                    case 0 :
                        clientRun=false; break;
                    default:
                        System.out.println("choix not valid");
                }
            }

        } else if (role == 2) {
            Banquier banquier=banquierService.authentication(email,password);
            if (banquier==null){
                System.out.println("Authentification problem in pass or email");
                       return;
            }
            System.out.println("Hello  " + banquier.getNom() );

            boolean banquierRun = true;


          while (banquierRun){
              System.out.println("\nMenu Banquier :");
              System.out.println("1. Créer un client ");
              System.out.println("2. Créer  un compte");
              System.out.println("3. Modifier un client ou un compte");
              System.out.println("4. Clôturer un compte");
              System.out.println("5. Afficher les informations d'un client ou compte");
              System.out.println("6. Voir le relevé bancaire d'un client");
              System.out.println("0. Quitter");

              int choix=scanner.nextInt();
              scanner.nextLine();
              switch (choix){
                  case 1 :
                      System.out.println("Créer un client  ");

                      System.out.println("nom");
                      String nom = scanner.nextLine();

                      System.out.println("prenom");
                      String prenom = scanner.nextLine();

                      System.out.println("password");
                      String newpassword = scanner.nextLine();

                      System.out.println("email");
                      String newemail = scanner.nextLine();

                      System.out.print("ID Client: ");
                      int idClient = scanner.nextInt();
                      scanner.nextLine();

                      Client newClient=new Client(nom,prenom,password,newemail,idClient);

                      banquierService.createClient(clients,newClient);


                      System.out.println(nom+" "+prenom+" is added succefully " );

                      break;
                  case 2 :
                      System.out.println("Créer un compte");
                      //create an account for a client

                      System.out.println("email du client pour creer le compte ");
                      String clientEmail=scanner.nextLine();
                      Client targetClient=null;

                      for (Client c :clients){
                          if (c.getEmail().equals(clientEmail)){
                              targetClient=c;
                              break;
                          }
                      }

                      if (targetClient==null){
                          System.out.println("client not found ");
                      }else {
                          System.out.println("Numéro du compte");
                          String numeroCompte = scanner.nextLine();
                          System.out.print("Type de compte   : ");
                          System.out.print("1 . Courant    : ");
                          System.out.print("2 . Epargne    : ");

                          int typeChoixCompte=scanner.nextInt();

                          TypeCompte typeCompte;

                          if (typeChoixCompte==1){
                              typeCompte=TypeCompte.COURANT;
                          }else if (typeChoixCompte==2){
                              typeCompte=TypeCompte.EPARGNE;
                          }else {
                              System.out.println("error");
                              return ;
                          }


                          System.out.println("solde initial");
                          double soldeInitial=scanner.nextDouble();
                          scanner.nextLine();



                          Compte newCompte= new Compte(numeroCompte,soldeInitial,typeCompte);

                          banquierService.createCompte(targetClient,newCompte);

                          System.out.println("the account of this client and his  email est "+clientEmail+" numero est "+numeroCompte+" type is "+typeCompte+" solde est "+soldeInitial+" added successfuly ");
                      }


                      break;
                  case 3 :
                      System.out.println("Modifier un client"); break;
                  case 4:
                      System.out.println("Clôturer un compte");
                      System.out.println("email du client");
                      String deletedEmail=scanner.nextLine();

                      Client deletedClient=null;

                      for (Client c :clients){
                          if (c.getEmail().equals(deletedEmail)){
                              deletedClient=c;
                              break;
                          }
                      }

                      if (deletedClient==null){
                          System.out.println("client not found ");
                          break;
                      }
                      System.out.println("numero du compte pur delete : ");
                      String deletedNum=scanner.nextLine();
                      banquierService.deleteCompte(deletedClient,deletedNum);

                      break;
                  case 5 :
                      System.out.println("Afficher les informations"); break;
                  case 6 :
                      System.out.println("Voir le relevé"); break;
                  case 0 :
                      banquierRun=false; break;
                  default:
                      System.out.println("choix not valid");
              }
          }


        }else {
            System.out.println("role not known");

        }
        System.out.println("thanks for the visite ");

    }
}
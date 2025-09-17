import entities.Banquier;
import entities.Client;
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

        } else if (role == 2) {
            Banquier banquier=banquierService.authentication(email,password);
            if (banquier==null){
                System.out.println("Authentification problem in pass or email");
                       return;
            }
            System.out.println("Hello  " + banquier.getNom() );

        }else {
            System.out.println("role not known");

        }
        System.out.println("thanks for the visite ");

    }
}
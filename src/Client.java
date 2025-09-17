import java.util.HashMap;

public class Client extends User {

    private int idClient;
    private HashMap<String,Compte>comptes;

    public Client(String nom, String prenom, String motDePasse, String email,int idClient){
super(  nom,   prenom,   motDePasse,   email);
this.idClient=idClient;
    }


    public int getIdClient(){
        return idClient;
    }
    public void setIdClient(int idClient){
        this.idClient=idClient;
    }
}

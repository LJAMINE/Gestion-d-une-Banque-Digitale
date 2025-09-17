package entities;

import java.util.HashSet;

public class Compte {

    private String numeroCompte;
    private  double solde;
    private TypeCompte typeCompte;
    private HashSet<Transaction>historiqueTransactions;

    public Compte(String numeroCompte,double solde,TypeCompte typeCompte){
        this.numeroCompte=numeroCompte;
        this.typeCompte=typeCompte;
        this.solde=solde;
     }

     public String getNumeroCompte(){
        return numeroCompte;
     }

     public void setNumeroCompte(String numeroCompte){
        this.numeroCompte=numeroCompte;
     }

     public double getSolde(){
        return solde;
     }

     public void setSolde(double solde){
        this.solde=solde;
     }

     public TypeCompte getTypeCompte(){
        return typeCompte;
     }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }

    public HashSet<Transaction> getHistoriqueTransactions() {
        return historiqueTransactions;
    }

    public void setHistoriqueTransactions(HashSet<Transaction> historiqueTransactions) {
        this.historiqueTransactions = historiqueTransactions;
    }
}

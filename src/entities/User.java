package entities;

public abstract class User {
     protected String nom;
     protected String prenom;
     protected String email;
     protected String motDePasse;

     public User(String nom, String prenom, String motDePasse, String email) {
         this.nom = nom;
         this.prenom = prenom;
         this.motDePasse = motDePasse;
         this.email = email;
     }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}

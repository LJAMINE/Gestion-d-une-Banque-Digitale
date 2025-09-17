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
 }

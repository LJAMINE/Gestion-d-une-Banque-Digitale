public class Banquier extends User {

    private int idBanquier;


    public Banquier(String nom, String prenom, String motDePasse, String email,int idBanquier) {
        super(nom, prenom, motDePasse, email);
        this.idBanquier=idBanquier;
    }

    public int getIdBanquier(){
        return idBanquier;
    }
    public void setIdBanquier(int idBanquier){
        this.idBanquier=idBanquier;
    }
}

import java.util.Date;

public class Transaction {

    private int idTransaction;
    private TypeTransaction type;
    private Date date;
    private double montant;
    private String compteSource;
    private String compteDestination;

    public Transaction(int idTransaction, TypeTransaction type, Date date, double montant, String compteSource, String compteDestination) {
        this.idTransaction = idTransaction;
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.compteSource = compteSource;
        this.compteDestination = compteDestination;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public TypeTransaction getType() {
        return type;
    }

    public void setType(TypeTransaction type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getCompteSource() {
        return compteSource;
    }

    public void setCompteSource(String compteSource) {
        this.compteSource = compteSource;
    }

    public String getCompteDestination() {
        return compteDestination;
    }

    public void setCompteDestination(String compteDestination) {
        this.compteDestination = compteDestination;
    }
}

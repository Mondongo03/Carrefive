public class Producte {
    protected int codi;
    protected int preu;
    protected String nom;

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Producte() {
        this.codi = codi;
        this.preu = preu;
        this.nom = nom;
    }
}

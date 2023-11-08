import java.util.Objects;

public class Producte {
    protected int codi;
    protected float preu;
    protected String nom;

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public float getPreu() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producte producte = (Producte) o;
        return codi == producte.codi && Float.compare(preu, producte.preu) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codi);
    }

}

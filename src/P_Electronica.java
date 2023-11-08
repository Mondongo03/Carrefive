import java.time.LocalDate;

public class P_Electronica extends Producte{
    private LocalDate garantia;

    public P_Electronica(){
        super();
    }

    public LocalDate getGarantia() {
        return garantia;
    }

    public void setGarantia(LocalDate garantia) {
        this.garantia = garantia;
    }

    public P_Electronica(int codi, float preu, String nom, LocalDate garantia) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
        this.garantia = LocalDate.parse(String.valueOf(garantia));
    }

}

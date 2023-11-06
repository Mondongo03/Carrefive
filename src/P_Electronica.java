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

    public P_Electronica(int codi, int preu, String nom, LocalDate garantia) {
        super();
        this.garantia = garantia;
    }
}

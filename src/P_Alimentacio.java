import java.time.LocalDate;

public class P_Alimentacio extends Producte{
    private String dataCaducitat;


    public LocalDate getDataCaducitat() {
        return LocalDate.parse(dataCaducitat);
    }

    public void setDataCaducitat(String dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    public P_Alimentacio(int codi, float preu, String nom, LocalDate dataCaducitat) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
        this.dataCaducitat = String.valueOf(dataCaducitat);
    }
}

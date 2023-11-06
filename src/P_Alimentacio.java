import java.time.LocalDate;

public class P_Alimentacio extends Producte{
    private LocalDate dataCaducitat;

    public  P_Alimentacio(){
        super();
    }

    public LocalDate getDataCaducitat() {
        return dataCaducitat;
    }

    public void setDataCaducitat(LocalDate dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }

    public P_Alimentacio(int codi, int preu, String nom, LocalDate dataCaducitat) {
        super();
        this.dataCaducitat = dataCaducitat;
    }

}

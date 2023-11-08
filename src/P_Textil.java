import java.time.LocalDate;

public class P_Textil extends Producte{
    private String composicio;

    public  P_Textil(){
        super();
    }

    public String getComposicio() {
        return composicio;
    }

    public void setComposicio(String composicio) {
        this.composicio = composicio;
    }

    public P_Textil(int codi, float preu, String nom, String composicio) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
        this.composicio = composicio;
    }
}

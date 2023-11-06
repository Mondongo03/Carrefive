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

    public P_Textil(int codi, int preu, String nom, String composicio) {
        super();
        this.composicio = composicio;
    }
}

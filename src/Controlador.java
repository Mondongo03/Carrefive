import java.time.LocalDate;

public class Controlador {

    Carro carro = new Carro();
    public void addAlimentacio(P_Alimentacio p) {
       carro.carroList.add(p);
    }

    public void llistarCarro(){
        for (int j = 0; j < carro.carroList.size(); j++) {
            System.out.println("-------Producto-------");
            System.out.println("codi: "+carro.carroList.get(j).getCodi());
            System.out.println("nom: "+carro.carroList.get(j).getNom());
            System.out.println("preu: "+carro.carroList.get(j).getPreu());
            System.out.println("Data: "+carro.carroList.get(j).getDataCaducitat());
            System.out.println();
            System.out.println();
        }
    }
}

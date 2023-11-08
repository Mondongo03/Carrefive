import java.time.LocalDate;

public class Controlador {
    public int getProducte() {
        return producte;
    }

    CarroAlimentacio carroAlimentacio = new CarroAlimentacio();

    CarroElectronica carroElectronica = new CarroElectronica();

    CarroTextil carroTextil = new CarroTextil();

    int producte = 0;

    public void addElectronica(P_Electronica p){
        if (producte<100) {
            carroElectronica.carroList.add(p);
            producte++;
            System.out.println(producte);
        }else System.out.println("Error 111: Tens 100 productes en el carro, només esta permés 100 productes com a màxim");
    }
    public void addAlimentacio(P_Alimentacio p) {
        if (producte < 100) {
            carroAlimentacio.carroList.add(p);
            producte++;
            System.out.println(producte);
        }else System.out.println("Error 111: Tens 100 productes en el carro, només esta permés 100 productes com a màxim");
    }
    public void addTextil(P_Textil p) {
        if (producte<100) {
            carroTextil.carroList.add(p);
            producte++;
            System.out.println(producte);
        }else System.out.println("Error 111: Tens 100 productes en el carro, només esta permés 100 productes com a màxim");
    }

    public void passarCaixa(){

        int repe = 0;
        float preu = 0;
        System.out.println("                    -----Data: "+LocalDate.now()+" Carrefive------");
        System.out.println();
        for (int j = 0; j < carroAlimentacio.carroList.size(); j++) {

            for (int i = 0; i < carroAlimentacio.carroList.size(); i++) {
                int codigo = carroAlimentacio.carroList.get(j).getCodi();
                float preuUnitati = carroAlimentacio.carroList.get(j).getPreu();
                if (codigo == carroAlimentacio.carroList.get(i).getCodi() && preuUnitati == carroAlimentacio.carroList.get(i).getPreu()) repe++;
            }
            System.out.println("Producte: "+carroAlimentacio.carroList.get(j).getNom()+"----------- x"+repe+" ------ Preu unitati: "+carroAlimentacio.carroList.get(j).getPreu()+"€ ------------- Preu Total: "+(carroAlimentacio.carroList.get(j).getPreu()*repe)+"€");
            System.out.println();

            preu = preu+carroAlimentacio.carroList.get(j).getPreu();

            repe = 0;
        }

        for (int i =0; i < carroElectronica.carroList.size(); i++){

            for (int h = 0; h < carroElectronica.carroList.size(); h++) {
                int codigo = carroElectronica.carroList.get(i).getCodi();
                float preuUnitati = carroElectronica.carroList.get(h).getPreu();
                if (codigo == carroElectronica.carroList.get(h).getCodi() && preuUnitati == carroElectronica.carroList.get(h).getPreu()) repe++;
            }

            System.out.println("Producte: "+carroElectronica.carroList.get(i).getNom()+"-----------x "+repe+" ------ Preu unitati: "+carroElectronica.carroList.get(i).getPreu()+"€ ------------- Preu Total: "+(carroElectronica.carroList.get(i).getPreu()*repe)+"€");
            System.out.println();

            repe = 0;
            preu = preu+carroElectronica.carroList.get(i).getPreu();
        }

        for (int b =0; b < carroTextil.carroList.size(); b++){

            for (int z = 0; z < carroTextil.carroList.size(); z++) {
                int codigo = carroTextil.carroList.get(b).getCodi();
                float preuUnitati = carroTextil.carroList.get(z).getPreu();
                if (codigo == carroTextil.carroList.get(z).getCodi() && preuUnitati == carroTextil.carroList.get(z).getPreu()) repe++;
            }


            System.out.println("Producte: "+carroTextil.carroList.get(b).getNom()+"-----------x "+repe+" ------Preu unitati: "+carroTextil.carroList.get(b).getPreu()+"€ ------------- Preu Total: "+(carroTextil.carroList.get(b).getPreu()*repe)+"€");
            System.out.println();
            preu = preu+carroTextil.carroList.get(b).getPreu();
            repe = 0;
        }
        System.out.println("Preu Total---------------------------"+preu+"€");

        carroAlimentacio.carroList.removeAll(carroAlimentacio.carroList);
        carroElectronica.carroList.removeAll(carroElectronica.carroList);
        carroTextil.carroList.removeAll(carroTextil.carroList);
        producte = 0;
    }

    public void MostrarCarro(){

        int repe = 0;
        System.out.println("                 -------------El teu carro------------");
        System.out.println();
        for (int j = 0; j < carroAlimentacio.carroList.size(); j++) {

            for (int i = 0; i < carroAlimentacio.carroList.size(); i++) {
                int codigo = carroAlimentacio.carroList.get(j).getCodi();
                if (codigo == carroAlimentacio.carroList.get(i).getCodi()) repe++;
            }
            System.out.println("Producte: "+carroAlimentacio.carroList.get(j).getNom()+"----------- x"+repe);
            System.out.println();

            repe = 0;
        }

        for (int i =0; i < carroElectronica.carroList.size(); i++){

            for (int h = 0; h < carroElectronica.carroList.size(); h++) {
                int codigo = carroElectronica.carroList.get(i).getCodi();
                if (codigo == carroElectronica.carroList.get(h).getCodi()) repe++;
            }

            System.out.println("Producte: "+carroElectronica.carroList.get(i).getNom()+"-----------x "+repe);
            System.out.println();

            repe = 0;
        }

        for (int b =0; b < carroTextil.carroList.size(); b++){

            for (int z = 0; z < carroTextil.carroList.size(); z++) {
                int codigo = carroTextil.carroList.get(b).getCodi();
                if (codigo == carroTextil.carroList.get(z).getCodi()) repe++;
            }


            System.out.println("Producte: "+carroTextil.carroList.get(b).getNom()+"-----------x "+repe);
            System.out.println();

            repe = 0;
        }
    }
}

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.ChronoPeriod;
import java.util.Locale;
import java.util.Scanner;
import java.time.temporal.*;

import static java.time.temporal.TemporalAccessor.*;

public class Menu {
    Scanner input = new Scanner(System.in);
    public int mostrarMenu(){
        System.out.println("╔══════════════════════════╗");
        System.out.println("║      Que vols fer?       ║");
        System.out.println("╚══════════════════════════╝");
        System.out.println("╔══════════════════════════╗");
        System.out.println("║   1.Introduir producte   ║");
        System.out.println("║   2.Passar per caixa     ║");
        System.out.println("║   3.Mostrar carro        ║");
        System.out.println("║   0.Sortir               ║");
        System.out.println("╚══════════════════════════╝");

        int eleccion = input.nextInt();
        while (eleccion <0 || eleccion>3 ){
            System.out.println("╔═════════════════════════════╗");
            System.out.println("║ Introdueix una opció valida ║");
            System.out.println("╚═════════════════════════════╝");

            eleccion = input.nextInt();
        }
        return eleccion;
    }
    public int mostrarMenuProducte(){
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║ Que tipus de producte vols introduir? ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.println("╔══════════════════════════╗");
        System.out.println("║   1.Alimentació          ║");
        System.out.println("║   2.Tèxtil               ║");
        System.out.println("║   3.Electrònica          ║");
        System.out.println("║   0.Tornar               ║");
        System.out.println("╚══════════════════════════╝");
        int subEleccion = input.nextInt();
        while (subEleccion <0 || subEleccion>3 ){
            System.out.println("╔═════════════════════════════╗");
            System.out.println("║ Introdueix una opció valida ║");
            System.out.println("╚═════════════════════════════╝");

            subEleccion = input.nextInt();
        }
        return subEleccion;
    }
    public P_Alimentacio menuCreacioAlimentacio(Controlador controlador){
        boolean repetido = false;
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║     Quin es el codi del producte?     ║");
        System.out.println("╚═══════════════════════════════════════╝");
        System.out.println("(Si es el mateix codi que un altre producte enregistrat es completara automaticament amb les dades previament registrades)");
        int codi = input.nextInt();
        String nom;
        LocalDate dataCaducitat;
        int  indiceRepe = 0;
        float preu;
        int dia, mes, any;
        LocalDate caducidad;

        for (int i = 0; i < controlador.carro.carroList.size(); i++) {
            if (codi == controlador.carro.carroList.get(i).getCodi()){
                repetido = true;
                indiceRepe = i;
            }
        }
        if (repetido == true){
            nom = controlador.carro.carroList.get(indiceRepe).getNom();
            preu = controlador.carro.carroList.get(indiceRepe).getPreu();
            dataCaducitat = LocalDate.parse(controlador.carro.carroList.get(indiceRepe).getDataCaducitat().toString());
        }
        else {
            input.nextLine();
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║     Quin es el nom del producte?      ║");
            System.out.println("╚═══════════════════════════════════════╝");
            nom = input.nextLine();

            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║     Quin es el preu del producte?     ║");
            System.out.println("╚═══════════════════════════════════════╝");
            preu = input.nextInt();
            input.nextLine();

            System.out.println("╔═════════════════════════════════════════════════════════════╗");
            System.out.println("║ Quin es la data de caducitat del producte? (dia)            ║");
            System.out.println("╚═════════════════════════════════════════════════════════════╝");
            dia = input.nextInt();
            System.out.println("╔═════════════════════════════════════════════════════════════╗");
            System.out.println("║ Quin es la data de caducitat del producte? (mes)            ║");
            System.out.println("╚═════════════════════════════════════════════════════════════╝");
            mes = input.nextInt();
            System.out.println("╔═════════════════════════════════════════════════════════════╗");
            System.out.println("║ Quin es la data de caducitat del producte? (any)            ║");
            System.out.println("╚═════════════════════════════════════════════════════════════╝");
            any = input.nextInt();

            dataCaducitat = LocalDate.of(any, mes, dia);
            Period periodo = Period.between(dataCaducitat, LocalDate.now());
            float totalDias = periodo.getDays() + (periodo.getMonths() * 30) + (periodo.getYears() * 365);
            preu = (float) (preu-(preu*(1/(totalDias+1))+(preu*0.1)));
        }
        return new P_Alimentacio( codi, preu , nom, dataCaducitat);
    }
}

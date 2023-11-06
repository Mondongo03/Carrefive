import java.util.Scanner;

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
}

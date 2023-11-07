public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Controlador controlador = new Controlador();
        int eleccion =1;
        int subeleccion;

        do{
            eleccion = menu.mostrarMenu();
            switch (eleccion){
                case 1:
                    subeleccion = menu.mostrarMenuProducte();
                    switch (subeleccion){
                        case 1:
                            P_Alimentacio pA = menu.menuCreacioAlimentacio(controlador);
                            controlador.addAlimentacio(pA);
                            break;
                    }
                    break;
                case 2:
                    controlador.llistarCarro(); break;
                case 3:
                    System.out.println("3");
            }

        }while (eleccion !=0);
    }
}
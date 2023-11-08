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

                        case 2:
                            P_Textil pT = menu.menuCreacioTextil(controlador);
                            controlador.addTextil(pT);
                            break;
                        case 3:
                            P_Electronica pE = menu.menuCreacioElectronica(controlador);
                            controlador.addElectronica(pE);
                    }
                    break;
                case 2:
                    controlador.passarCaixa();
                    break;
                case 3:
                    controlador.MostrarCarro();
            }

        }while (eleccion !=0);
    }
}
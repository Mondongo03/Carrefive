public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        int eleccion =1;


        do{
            eleccion = menu.mostrarMenu();
            switch (eleccion){
                case 1:
                    menu.mostrarMenuProducte(); break;
                case 2:
                    System.out.println("2"); break;
                case 3:
                    System.out.println("3"); break;
                case 0:
                    System.out.println("0");
            }

        }while (eleccion !=0);
    }
}
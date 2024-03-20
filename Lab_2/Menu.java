import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrices funciones = new Matrices();
        int opcion;
        do {
            System.out.println("------MATRICES-------");
            System.out.println("1) Diagonal principal ");
            System.out.println("2) Triangulo Inferior Izquierdo");
            System.out.println("3) Triangulo Superior Derecho ");
            System.out.println("4) Salir del Programa.");
            System.out.print("Eliga una opción: ");
            while ( !scanner.hasNextInt()) { 
                System.out.println("ERROR. INGRESE OPCIÓN VALIDA (1-4)");
                scanner.next();
            }
            opcion = scanner.nextInt();
            if (opcion == 1) {
                funciones.diag();
            }else if (opcion ==2){ 
                funciones.tii();
            }else if (opcion ==3){
                funciones.tsd();
            }else if ( opcion ==4){
                System.out.println("---Fin del programa.---");
            }else {
                System.out.println("Error. Opción invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}        
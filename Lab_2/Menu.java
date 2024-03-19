import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrices funciones = new Matrices();
        int opcion;
        do {
            System.out.println("----MENÚ----");
            System.out.println("1) Matriz 1 ");
            System.out.println("2) Matriz 2 ");
            System.out.println("3) Matriz 3 ");
            System.out.println("4) Salir del Programa.");
            System.out.print("Eliga una opción: ");
            while ( !scanner.hasNextInt()) { 
                System.out.println("ERROR. INGRESE OPCIÓN VALIDA (1-4)");
                scanner.next();
            }
            opcion = scanner.nextInt();
            if (opcion == 1) {
                funciones.funcion1();
            }else if (opcion ==2){ 
                funciones.funcion2();
            }else if (opcion ==3){
                funciones.funcion3();
            }else if ( opcion ==4){
                System.out.println("---Fin del programa.---");
            }else {
                System.out.println("Error. Opción invalida.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}        
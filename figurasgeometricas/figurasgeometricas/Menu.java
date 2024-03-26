package figurasgeometricas;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        FigurasGeometricas operaciones = new FigurasGeometricas();
        int opcion;
        do {
            System.out.println("--Área y Perimetro--");
            System.out.println("1) Rectangulo ");
            System.out.println("2) Cuadrado ");
            System.out.println("3) Circulo ");
            System.out.println("4) Salir del Programa.");
            System.out.println("---------------------------");
            System.out.print("Eliga una opción: ");
            while ( !leer.hasNextInt()) { 
                System.out.println("ERROR. INGRESE OPCIÓN VALIDA (1-4)");
                leer.next();
            }
            opcion = leer.nextInt();
            if (opcion == 1) {
                operaciones.rectangulo();
            }else if (opcion ==2){ 
               operaciones.cuadrado();
            }else if (opcion ==3){
                operaciones.circulo();
            }else if ( opcion ==4){
                System.out.println("---Fin del programa.---");
            }else {
                System.out.println("Error. Opción invalida.");
            }
        } while (opcion != 4);
        leer.close();
    }

}
   


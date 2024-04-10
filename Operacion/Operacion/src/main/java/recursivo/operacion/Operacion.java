/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recursivo.operacion;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Operacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        Funcion fc = new Funcion();
        do{
            System.out.println("OPERACIONES");
            System.out.println("1. Contar digitos");
            System.out.println("2. Sumar Digitos");
            System.out.println("3. Maximo comun Divisor");
            System.out.println("4. Invertir cadena");
            System.out.println("0.- Salir del programa");
            System.out.print("Ingrese la opcion. Despues se le pediran los numeros: ");
            opcion = leer.nextInt();
                
            switch(opcion){
                case 1:
                    System.out.println("Ingrese numero: ");
                    int num1 = leer.nextInt();
                    int contarDig = fc.contarDig(num1);
                    System.out.println("El numero de digitos es: " + contarDig);
                    break;
                case 2:
                    System.out.println("Ingrese numero: ");
                    int num2 = leer.nextInt();
                    int sumarDig = fc.sumarDig(num2); 
                    System.out.println("La suma de los digitos es: " + sumarDig);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    int num3 = leer.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    int num4 = leer.nextInt();
                    int MCD = fc.MCD(num3, num4); 
                    System.out.println("El MCD es: " + MCD);
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida.");
            }
        } while(opcion != 0);
    }
}

 

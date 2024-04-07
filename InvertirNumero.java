/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recursividad.invertirnumero;
import java.util.Scanner;
/**
 *
 * @author GEZCH
 */
public class InvertirNumero {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        boolean otroNum = true;

        while (otroNum) {
            System.out.print("Ingrese un numero entero mayor a 0: ");

            if (!leer.hasNextInt()) {
                System.out.println("Error.Solo se deben ingresar enteros.");
                leer.next(); 
                continue; 
            }
            int num = leer.nextInt();
            if (num <= 0) {
                System.out.println("Error. El numero debe ser mayor a 0.");
                continue; 
            }
            int numInv = invertirNumero(num, 0);
            System.out.println("El numero invertido es: " + numInv);

            System.out.print("¿Desea invertir otro numero? (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
    }
    public static int invertirNumero(int num, int invNum) {
        if (num == 0) {
            return invNum;
        } else {
            int digito = num % 10;
            invNum = invNum * 10 + digito;
            return invertirNumero(num / 10, invNum);
        }
    }
}

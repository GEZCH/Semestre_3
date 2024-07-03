/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solemne3;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class submenuVuelos {
    Scanner leer;
    
    public submenuVuelos()
    {
        leer = new Scanner(System.in);
    }
    
    public void submenu(Vuelos vls){
        int opcion = -1;
        while (opcion !=0){
            System.out.println("==== MENU DE VUELOS ====");
            System.out.println("1.- Crear vuelo");
            System.out.println("2.- Edita vuelo");
            System.out.println("3.- Eliminar vuelo");
            System.out.println("4.- Mostrar lista de vuelos");
            System.out.println("0.- Volver al menu principal");
            opcion = ValidarOpcion();
            switch (opcion)
            {
                case 1:
                    vls.crearVuelo();
                    break;
                case 2:
                    vls.modificarVuelo();
                    break;
                case 3:
                    vls.eliminarVuelo();
                    break;
                case 4:
                    vls.imprimirLista();
                    break;
            }
        }
    }
    
    private int ValidarOpcion()
    {
        boolean continuar = true;
        int opcion = -1;
        System.out.println("Ingrese su opcion: ");
        while (continuar)
        {
            try
            {
                opcion = leer.nextInt();
                while (opcion < 0 || opcion > 4)
                {
                    System.out.println("Error, debe ingresar una opcion valida.");
                    opcion = leer.nextInt();
                }
                leer.nextLine();
                continuar = false;
            }
            catch (InputMismatchException ex)
            {
                leer.next();
                System.out.println("Error, debe ingresar un numero entero");
                continuar = true;
            }
        }
        
        return opcion;
    }
}

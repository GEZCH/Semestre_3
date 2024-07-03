/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solemne3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class menuPrin {
    Scanner leer;
    
    public menuPrin()
    {
        leer = new Scanner(System.in);
    }
    
    public void menu(){
        submenuVuelos ls = new submenuVuelos();
        submenuPasajeros ps = new submenuPasajeros();
        Vuelos vls = new Vuelos();
        Pasajeros psj = new Pasajeros();
        Abordaje ab = new Abordaje();
        int opcion = 9 ; 
        while (opcion != 0){
            System.out.println("--Menu Principal--");
            System.out.println("1.- Submenu Vuelos ");
            System.out.println("2.- Submenu Pasajeros");
            System.out.println("3.- Proceso de Abordaje (cola) ");
            System.out.println("0.- Salir del programa");
            opcion = ValidarOpcion();
            switch (opcion){
                case 1:
                    ls.submenu(vls);
                    break;
                case 2:
                    ps.submenu(psj, vls);
                    break;
                case 3:
                    ab.procesoAbordaje(vls);
                    break;
                case 0:
                    System.exit(0);
                    System.out.println("Fin del programa");
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
                while (opcion < 0 || opcion > 3)
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

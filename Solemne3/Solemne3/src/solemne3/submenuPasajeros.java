/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solemne3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pclab0.pc19
 */
public class submenuPasajeros {
    Scanner leer;
    
    public submenuPasajeros()
    {
        leer = new Scanner(System.in);
    }
    
    public void submenu(Pasajeros psj, Vuelos vls){
        int opcion = -1;
        while (opcion !=0){
            System.out.println("==== MENU DE PASAJEROS ====");
            System.out.println("1.- Crear pasajero");
            System.out.println("2.- Edita pasajero");
            System.out.println("3.- Eliminar pasajero");
            System.out.println("4.- Asociar pasajero a un vuelo");
            System.out.println("5.- Mostrar lista de pasajeros en vuelo especifico");
            System.out.println("6.- Mostrar lista de pasajeros sin vuelo");
            System.out.println("0.- Volver al menu principal");
            opcion = ValidarOpcion();
            switch(opcion){
                case 1:
                    psj.CrearPasajero();
                    break;
                case 2:
                    psj.EditarPasajero();
                    break;
                case 3:
                    nodoPasajeros pasajeroEliminar = psj.BuscarPasajero();
                    if (pasajeroEliminar != null)
                    {
                        nodoVuelos vueloActual = vls.buscarPasajeroEnVuelo(pasajeroEliminar);
                        if (vueloActual != null) 
                        {
                            System.out.println("El pasajero se encontraba en el vuelo " + vueloActual.getNombre() + " y se le elimino.");
                            vueloActual.getPasajeros().EliminarPasajero(pasajeroEliminar);
                        }
                        psj.EliminarPasajero(pasajeroEliminar);
                    }
                    break;
                case 4:
                    nodoPasajeros pasajero = psj.BuscarPasajero();
                    if (pasajero != null)
                    {
                        nodoVuelos vueloAntiguo = vls.buscarPasajeroEnVuelo(pasajero);
                        nodoVuelos vuelo = vls.buscarVuelo();
                        if (vuelo != null) psj.AsociarPasajero(pasajero, vuelo, vueloAntiguo);
                    }
                    break;
                case 5:
                    nodoVuelos vuelo2 = vls.buscarVuelo();
                    if (vuelo2 != null)
                    {
                        vuelo2.getPasajeros().ListaPasajeros();
                    }
                    else
                    {
                        System.out.println("No existe un vuelo con ese nombre.");
                    }
                    break;
                case 6:
                    psj.ListaPasajerosSinVuelo(vls);
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
                while (opcion < 0 || opcion > 6)
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

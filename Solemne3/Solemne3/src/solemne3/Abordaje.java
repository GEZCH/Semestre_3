/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solemne3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author 
 */
public class Abordaje {
    Queue<nodoPasajeros> colaAbordaje = new LinkedList<>();
        
    public Abordaje(){
        this.colaAbordaje = new LinkedList<>();
    }
    
    public void procesoAbordaje(Vuelos vls){
        nodoVuelos vueloAbordar = vls.buscarVuelo();
        if (vueloAbordar != null)
        {
            if (vueloAbordar.getPasajeros().TotalPasajeros() < vueloAbordar.getAsientos())
            {
                System.out.println("El vuelo " + vueloAbordar.getAsientos() + " no esta completo, por lo que no se puede abordar.");
                return;
            }
            else
            {
                System.out.println("==== ABORDAJE DEL VUELO " + vueloAbordar.getNombre() + " ====");
            }
        }
        
        AgregarACola(vueloAbordar.getPasajeros(), false);
        AgregarACola(vueloAbordar.getPasajeros(), true);
        Abordar();
    }
    
    private void AgregarACola(Pasajeros psj, boolean impar)
    {
        int total = psj.TotalPasajeros();
        for (int i = 0; i < total; i++)
        {
            nodoPasajeros pasajero = psj.obtenerPosicion(i);
            if (pasajero != null)
            {
                if (!impar && pasajero.getAsiento() % 2 == 0)
                {
                    colaAbordaje.add(pasajero);
                }
                else if (impar && pasajero.getAsiento() % 2 != 0)
                {
                    colaAbordaje.add(pasajero);
                }
            }
        }
    }
    
    private void Abordar()
    {
        while (!colaAbordaje.isEmpty())
        {
            nodoPasajeros pasajero = colaAbordaje.poll();
            System.out.println("Pasajero que esta abordando:\n----Nombre:" + pasajero.getNombre()
                    + "\n----Asiento: " + pasajero.getAsiento() + "\n");
        }
    }
}

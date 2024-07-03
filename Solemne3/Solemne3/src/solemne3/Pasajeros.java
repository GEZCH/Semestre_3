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
public class Pasajeros {
    nodoPasajeros primerPasajero;
    nodoPasajeros ultimoPasajero;
    int contadorID = 0;
    Scanner leer = new Scanner(System.in);

    public Pasajeros() {
        this.primerPasajero = null;
        this.ultimoPasajero = null;
    }
    
    public int TotalPasajeros() {
        nodoPasajeros actual = primerPasajero;
        int acc = 0;
        while (actual != null)
        {
            acc++;
            actual = actual.getSiguiente();
        }
        return acc;
    }
    
    public void CrearPasajero() {
        int id = contadorID;
        System.out.println("Ingrese el nombre del pasajero: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la nacionalidad");
        String nacionalidad = leer.nextLine();
        nodoPasajeros nuevoPasajero = new nodoPasajeros(id, nombre, nacionalidad, 0);
        nodoPasajeros ac = primerPasajero;
        while (ac != null) {
            if (ac.getId() == id) {
                System.out.println("El pasajero con el id " + id + ", ya existe.");
                return;
            }
            ac = ac.getSiguiente();
        }

        if (primerPasajero == null) {
            primerPasajero = ultimoPasajero = nuevoPasajero;
        } else {
            ultimoPasajero.setSiguiente(nuevoPasajero);
            nuevoPasajero.setAnterior(ultimoPasajero);
            ultimoPasajero = nuevoPasajero;
        }
        contadorID++;
    }
    
    public void AgregarPasajero(nodoPasajeros nuevoPasajero)
    {
        nodoPasajeros copia = new nodoPasajeros(nuevoPasajero.getId(), nuevoPasajero.getNombre(), nuevoPasajero.getNacionalidad(), nuevoPasajero.getAsiento());
        if (primerPasajero == null)
        {
            primerPasajero = copia;
            ultimoPasajero = copia;
        }
        else
        {
            ultimoPasajero.setSiguiente(copia);
            copia.setAnterior(ultimoPasajero);
            ultimoPasajero = copia;
        }
        AsignarAsientos();
    }
    
    public nodoPasajeros BuscarPasajero()
    {
        int id = ObtenerID();
        
        nodoPasajeros actual = primerPasajero;
        
        while (actual != null)
        {
            if (actual.getId() == id)
            {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        
        System.out.println("El pasajero con el id " + id + " no se ha encontrado.");
        
        return null;
    }
    
    public boolean ContienePasajero(nodoPasajeros pasajero)
    {
        nodoPasajeros actual = primerPasajero;
        
        while (actual != null)
        {
            if (actual.getId() == pasajero.getId())
            {
                return true;
            }
            actual = actual.getSiguiente();
        }
        
        return false;
    }
    
    public void EliminarPasajero(nodoPasajeros pasajero)
    {
        if (pasajero != null)
        {
            if (pasajero.getId() == primerPasajero.getId() && pasajero.getId() == ultimoPasajero.getId())
            {
                primerPasajero = null;
                ultimoPasajero = null;
            }
            else if (pasajero.getId() == primerPasajero.getId())
            {
                primerPasajero = primerPasajero.getSiguiente();
                primerPasajero.setAnterior(null);
            }
            else if (pasajero.getId() == ultimoPasajero.getId())
            {
                ultimoPasajero = ultimoPasajero.getAnterior();
                ultimoPasajero.setSiguiente(null);
            }
            else
            {
                nodoPasajeros ant = pasajero.getAnterior();
                nodoPasajeros sig = pasajero.getSiguiente();
                if (ant != null) ant.setSiguiente(sig);
                if (sig != null) sig.setAnterior(ant);
            }
            AsignarAsientos();
        }
    }
    
    private void AsignarAsientos()
    {
        nodoPasajeros actual = primerPasajero;
        int contador = 1;
        while (actual != null)
        {
            actual.setAsiento(contador);
            contador++;
            actual = actual.getSiguiente();
        }
    }
    
    public void EditarPasajero() {
        nodoPasajeros pasajero = BuscarPasajero();
        if (pasajero != null)
        {
            System.out.println("Ingrese el nombre nuevo del pasajero");
            String nombre = leer.nextLine();
            System.out.println("Ingrese la nueva nacionalidad del pasajero");
            String nacionalidad = leer.nextLine();
            pasajero.setNombre(nombre);
            pasajero.setNacionalidad(nacionalidad);
        }
    }
    
    public void AsociarPasajero(nodoPasajeros pasajero, nodoVuelos vuelo, nodoVuelos vueloAntiguo)
    {
        if (vuelo.getPasajeros().TotalPasajeros() + 1 > vuelo.getAsientos())
        {
            System.out.println("El vuelo esta completo, no se pueden agregar mas pasajeros");
        }
        else
        {
            if (vueloAntiguo != null) vueloAntiguo.getPasajeros().EliminarPasajero(pasajero);
            vuelo.getPasajeros().AgregarPasajero(pasajero);
            vuelo.getPasajeros().AsignarAsientos();
        }
    }
    
    public void ListaPasajeros()
    {
        nodoPasajeros actual = primerPasajero;
        
        if (TotalPasajeros() > 0)
        {
            System.out.println("\n==== LISTA DE PASAJEROS ====\n");
        }
        else
        {
            System.out.println("La lista de pasajeros esta vacia");
        }
        
        while (actual != null)
        {
            System.out.println("ID:" + actual.getId());
            System.out.println("Nombre:" + actual.getNombre());
            System.out.println("Nacionalidad:" + actual.getNacionalidad());
            System.out.println("Asiento:" + actual.getAsiento() + "\n");
            actual = actual.getSiguiente();
        }
    }
    
    public void ListaPasajerosSinVuelo(Vuelos vls)
    {
        nodoPasajeros actual = primerPasajero;
        
        if (TotalPasajeros() > 0)
        {
            System.out.println("\n==== LISTA DE PASAJEROS SIN VUELO ====\n");
        }
        else
        {
            System.out.println("La lista de pasajeros esta vacia");
        }
        
        while (actual != null)
        {
            if (vls.buscarPasajeroEnVuelo(actual) == null) {
                System.out.println("ID:" + actual.getId());
                System.out.println("Nombre:" + actual.getNombre());
                System.out.println("Nacionalidad:" + actual.getNacionalidad() + "\n");
            }
            actual = actual.getSiguiente();
        }
    }
    
    public nodoPasajeros obtenerPosicion(int pos)
    {
        int contador = 0;
        nodoPasajeros actual = primerPasajero;
        while (actual != null)
        {
            if (contador == pos) return actual;
            contador ++;
            actual = actual.getSiguiente();
        }
        return null;
    }
    
    private int ObtenerID()
    {
        boolean continuar = true;
        System.out.println("Ingrese el ID del pasajero");
        int id = 0;
        while (continuar)
        {
            try
            {
                id = leer.nextInt();
                while (id < 0)
                {
                    System.out.println("Error, el ID no puede ser menor que 0");
                    id = leer.nextInt();
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
        
        return id;
    }
}

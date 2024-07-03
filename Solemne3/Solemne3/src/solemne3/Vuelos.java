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

public class Vuelos {
    nodoVuelos inicio;
    Scanner leer = new Scanner(System.in);
    
    public Vuelos(){
        this.inicio = null;
        }
        
    public void crearVuelo(){
        System.out.println("Ingrese el destino del vuelo: ");
        String destino = leer.nextLine();
        System.out.println("Ingrese el horario (Hora:Min): ");
        String horario = leer.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese los asientos: ");
        int asientos = ValidarAsientos();
        nodoVuelos vueloAgregado = new nodoVuelos(destino, horario, nombre, asientos);
        InsertaFin(vueloAgregado);
        }
    
 
    public void eliminarVuelo(){
        System.out.println("Ingrese el nombre del vuelo: ");
        String nombre = leer.nextLine();
        nodoVuelos recorre = inicio;
        nodoVuelos anterior = null;
        boolean encontrado = false;
        while (recorre != null && !encontrado) {
            if(recorre.getDestino().equalsIgnoreCase(nombre))
            {
                encontrado = true;
            }
            else
            {
                anterior = recorre;
                recorre = recorre.getSiguiente();
            }
        }
        if (recorre == null)
        {
            System.out.println("No se encuentra un vuelo con ese nombre.");
            return;    
        }
        if (anterior != null)
        {
            anterior.setSiguiente(recorre.getSiguiente());
        }
        else
        {
            inicio = recorre.getSiguiente();
        }
        System.out.println("Vuelo eliminado: "+ nombre);
    }
    
    public void modificarVuelo() {
        nodoVuelos vuelo = buscarVuelo();
        if (vuelo != null)
        {
            System.out.println("Ingrese el nuevo destino del vuelo: ");
            String nuevoDestino = leer.nextLine();
            System.out.println("Ingrese el nuevo horario del vuelo (hora:min): ");
            String nuevoHorario = leer.nextLine();
            System.out.println("Ingrese el nuevo nombre del vuelo: ");
            String nuevoNombre = leer.nextLine();
            System.out.println("Ingrese el nuevo numero de asientos: ");
            int nuevosAsientos = ValidarAsientos();
            vuelo.setDestino(nuevoDestino);
            vuelo.setNombre(nuevoNombre);
            vuelo.setHorario(nuevoHorario);
            vuelo.setasientos(nuevosAsientos);
        }
    }
            
    public void imprimirLista() {
        nodoVuelos recorre = inicio;
        if (inicio == null)
        {
            System.out.println("No existen vuelos");
        }
        else
        {
            System.out.println("\n==== MOSTRANDO LISTA DE VUELOS ====\n");
        }
        while (recorre != null) {
            System.out.println("Nombre: "+ recorre.getNombre());
            System.out.println("Horario: "+recorre.getHorario());
            System.out.println("Destino: "+ recorre.getDestino() + "\n");
            recorre = recorre.getSiguiente();
        }
    }
    
    
    public void InsertaFin(nodoVuelos vuelo){
        if (inicio == null) {
            inicio = vuelo;
        }
        else {
            nodoVuelos recorre = inicio;
            while (recorre.getSiguiente() != null) {
                recorre = recorre.getSiguiente();
            }
            recorre.setSiguiente(vuelo);
        }
    }
    
    public nodoVuelos buscarVuelo()
    {
        System.out.println("Ingrese el nombre del vuelo: ");
        String nombre = leer.nextLine();
        
        nodoVuelos vuelo = inicio;
        
        while (vuelo != null)
        {
            if (vuelo.getNombre().equalsIgnoreCase(nombre))
            {
                return vuelo;
            }
            vuelo = vuelo.getSiguiente();
        }
        
        System.out.println("No se encuentra un vuelo con ese nombre.");
        
        return null;
    }
    
    public nodoVuelos buscarPasajeroEnVuelo(nodoPasajeros pasajero)
    {
        nodoVuelos recorrido = inicio;
        
        while (recorrido != null)
        {
            if (recorrido.getPasajeros().ContienePasajero(pasajero))
            {
                return recorrido;
            }
            recorrido = recorrido.getSiguiente();
        }
        
        return null;
    }
    
    private int ValidarAsientos()
    {
        boolean continuar = true;
        int asientos = 0;
        while (continuar)
        {
            try
            {
                asientos = leer.nextInt();
                while (asientos < 1) {
                    System.out.println("El numero de asientos no puede ser negativo o 0");
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
        
        return asientos;
    }
}



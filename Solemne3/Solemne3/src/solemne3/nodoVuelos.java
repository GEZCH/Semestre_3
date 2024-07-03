/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solemne3;
/**
 *
 * @author
 */
public class nodoVuelos {
    private String destino;
    private String horario;
    private String nombre;
    private int asientos;
    private Pasajeros pasajeros;
    private nodoVuelos siguiente;
    
    public nodoVuelos(String destino, String horario, String nombre, int asientos){
        this.destino = destino;
        this.horario = horario;
        this.nombre = nombre;
        this.asientos = asientos;
        this.pasajeros = new Pasajeros();
        this.siguiente = null;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getAsientos() {
        return asientos;
    }
    
    public void setasientos(int asientos) {
        this.asientos = asientos;
    }
    
    public Pasajeros getPasajeros() {
        return pasajeros;
    }
    
    public void setPasajeros(Pasajeros pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    public nodoVuelos getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(nodoVuelos siguiente) {
        this.siguiente = siguiente;
    }
}


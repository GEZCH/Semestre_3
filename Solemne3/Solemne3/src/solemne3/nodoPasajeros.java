/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solemne3;

/**
 *
 * @author 
 */
public class nodoPasajeros {
    private int id;
    private String nombre;
    private String  nacionalidad;
    private int asiento;
    private nodoPasajeros siguiente;
    private nodoPasajeros anterior;    

    public nodoPasajeros(int id, String nombre, String nacionalidad, int asiento){
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.asiento = asiento;
        this.anterior = null;
        this.siguiente = null;
    }

    public int getId(){
        return id;
    }

    public void setId(int id ){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public String getNacionalidad (){
         return nacionalidad;
     }

     public void setNacionalidad (String nacionalidad){
         this.nacionalidad = nacionalidad;
     }

    public int getAsiento(){
        return asiento;
    }

    public void setAsiento(int asiento ){
        this.asiento = asiento;
    }

    public nodoPasajeros getSiguiente (){
        return siguiente;
    }

    public void setSiguiente(nodoPasajeros siguiente){
        this.siguiente = siguiente;
    }

    public nodoPasajeros getAnterior (){
        return anterior;
    }

    public void setAnterior(nodoPasajeros anterior){
        this.anterior = anterior;
    }
}
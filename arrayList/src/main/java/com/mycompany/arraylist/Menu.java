/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pclab0.pc12
 */
public class Menu {
    Scanner leer = new Scanner(System.in);

    public void SubMenu(){
        ArrayList m = new ArrayList();
        m.add(1000);
        m.add(90);
        m.add(400);
        m.add(69);
        System.out.println(m);
        int opc;
        do{ 
            System.out.println("---SubMenu---");
            System.out.println("1.- Agregar un elemento: ");
            System.out.println("2.- Eliminar un elemento: ");
            System.out.println("3.- Buscar un elemento");
            System.out.println("4.- Mostrar elementos");
            System.out.println("5.- Salir");
            System.out.println("Ingrese opcion: ");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese un elemento: ");
                    m.add(leer.nextInt());
                    System.out.println(m);
                    break;
                case 2:
                    System.out.println("Ingrese el indice del elemento a eliminar: ");
                    int indice = leer.nextInt();
                    m.remove(indice);
                    System.out.println(m);
                    break;
                case 3:
                    System.out.println("Ingrese el elemento que desea encontrar: ");
                    int buscar = leer.nextInt();
                    int ind = m.indexOf(buscar);
                    System.out.println("El elemento " + buscar + " esta en la posicion " + ind);
                    break;
                case 4:
                    System.out.println(m);
                    break;
                case 5:
                    System.out.println("Saliendo del SubMenu..");
                    break;
            }
        }while(opc!=5);
    }
    
   public void MostrarMenu(){
    int opcion;
    List<String> b = new ArrayList<>();
    //String a, c, d, f, g, h, j = new String();
    //a = "Un ArrayList es una lista la cual puede almacenar multiples objetos de distintos tipos de datos, ademas de poder modificar su tamaño como se le ordene.";
    b.add("1.- Un arraylist puede contener distitntos tipos de datos");
    b.add("2.- Un arraylist puede modificar su tamaño, añadiendo o eliminando objetos.");
    b.add("3.- Un arraylist ocupa mas memoria del sistema que un array generico");
    b.add("4.- En java los arraylist se crean desde una clase homonima que existe en el Java Collection Framework");
    b.add("5.- El tamaño de un array generico se debe conocer de antemano mientras que el de un arraylist puede modificarse durante la marcha");
    b.add("6.- El arraylist solo puede contener objetos");
    b.add("m.1.- Metodo \".get()\" este metodo accede a un elemento del arraylist en el indice especificado dentro del parentesis " );
    b.add("m.2.- Metodo \".add()\" este metodo añade el dato que este dentro del parentesis al arraylist");
    b.add("m.3.- Metodo \".remove()\" este metodo elimina el elemento que este en el indice especificado dentro del parentesis");
    b.add("m.4.- Metodo \".set(x, y)\" este metodo agrega un elemento en el indice especifico que esta dentro del parentesis. Donde \"x\" es el indice e \"y\" el elemento");
    b.add("1.- Se concluye que el arraylist tiene una sintaxis mas compleja, pero tambien es mas optima para las tareas mas complejas");
    b.add("2.- Tambien se concluye que el arraylist es la opcion mas acertada cuando la longitud de la lista variar.");    
    do{
       System.out.println("ArrayList");
       System.out.println("1. Definicion ");
       System.out.println("2. Diferencias ");
       System.out.println("3. Metodos ");
       System.out.println("4. Conclusiones ");
       System.out.println("5. Submenu ");
       System.out.println("6. Salir");
       System.out.println("Ingrese su opcion: ");
       opcion = leer.nextInt(); 
       switch (opcion){
           case 1:
               System.out.println("a");
               break;
           case 2:
               System.out.println(b.get(0));
               System.out.println(b.get(1));
               System.out.println(b.get(2));
               System.out.println(b.get(3));
               System.out.println(b.get(4));
               System.out.println(b.get(5));
               break;
           case 3:
               System.out.println(b.get(6));
               System.out.println(b.get(7));
               System.out.println(b.get(8));
               System.out.println(b.get(9));
               break;
           case 4:
               System.out.println(b.get(10));
               System.out.println(b.get(11));
               break;
           case 5:
              SubMenu();
              break;
           case 6: 
               System.out.println("Fin del programa");
       }
       }while (opcion != 6);
    }
}


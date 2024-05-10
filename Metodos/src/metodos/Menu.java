/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;
import java.util.Scanner;
/**
 *
 * @author pclab0.pc12
 */
public class Menu {
    public void mostrarMenu(){
       Ordenamientos m = new Ordenamientos();
       Scanner leer = new Scanner(System.in);
       int a[] = {54, 26, 93, 17, 77, 31, 44, 55, 20};
       int opcion = 8;
       while (opcion !=7){
        System.out.println("--Metodos de ordenamiento-- ");
        System.out.println("1.-  Burbuja");
        System.out.println("2.- Seleccion");
        System.out.println("3.-  Incersion");
        System.out.println("4.- Shell sort");
        System.out.println("5.-  Merge sort");
        System.out.println("6.- Quick sort");
        System.out.println("7.- Salir del programa.");
        System.out.println("Ingrese la opcion: ");
        opcion = leer.nextInt();
 
        switch(opcion){
        case 1: 
            m.BubleSort();
            break;
        case 2 :
           m.SelectionSort();
            break;
        case 3:
            m.InsertionSort();
            break;
        case 4:
            m.ShellSort();
            break;
        case 5:
           m.mergeSort(a);
            break;
         case 6:
           int arr[] = {54,26,93,17,77,31,44,55,20};
           m.quickSort(arr);
            break;
         case 7: 
             System.out.println("Fin del programa");
             break;
         default:
             System.out.println("Error ingrese opcion valida");
             break;
        }
    
    }
}
}
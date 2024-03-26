import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Arreglos {
    private int[] uno;
    private int[] dos;
    private int[] resta;
    private int[] producto;
    private int[] parimpar;
    private boolean generar_1;
    private boolean generar_2;

    public Arreglos() {
        uno = new int[10];
        dos = new int[10];
        resta = new int[10];
        producto = new int[10];
        parimpar = new int[10];
        generar_1 = false; 
        generar_2 = false;
    }
    
    public void arreglo_uno() {
        Random rand = new Random();
        for (int i = 0; i < uno.length; i++){
            uno[i] = rand.nextInt(20) + 1 ;
            }
            generar_1 = true;
    }

    public void arreglo_dos() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < dos.length; i++){
            do{
                System.out.print("ingrese un numero" +(i + 1)+ " mayor a 5 y menor a 10: " );
                dos[i] = leer.nextInt();
            } while (dos[i] <= 5 || dos[i] >= 10);
        }
        generar_2 = true;
        leer.close();
    }

    public void arreglo_resta(){
        if (!generar_1 || !generar_2){
            System.out.println("Error, no se han generado los arreglos anteriores.");
            return;
        }
        for (int i = 0; i<resta.length; i++){
            resta [i] = uno[i] - dos[i];
        }
    }

    public void arreglo_multi(){
        if (!generar_1 || !generar_2){
            System.out.print("Error, no se han generado los arreglos anteriores.");
            return;
        }
        for (int i = 0; i< producto.length; i++){
            producto[i] = uno[i]*dos[i];
        }
    }

    public void arreglo_parimpar(){
        if( !generar_1 || !generar_2){
            System.out.println("Error, no se han generado los arreglos anteriores.");
            return;
        }
        for (int i = 0; i< parimpar.length; i++){
            int suma = uno[i] + dos[i]; 
            parimpar[i] = suma%2 == 0 ? 1 : 0; 
        }
    }

    public void mostrar_arreglos() {
        System.out.println("Uno: " + Arrays.toString(uno));
        System.out.println("Dos: " + Arrays.toString(dos));
        System.out.println("Producto: " + Arrays.toString(producto));
        System.out.println("Resta: " + Arrays.toString(resta));
        System.out.println("Parimpar: " + Arrays.toString(parimpar));
    }

    public static void main(String[] args){
        Arreglos operaciones = new Arreglos();
        operaciones.arreglo_uno();
        operaciones.arreglo_dos();
        operaciones.arreglo_resta();
        operaciones.arreglo_multi();
        operaciones.arreglo_parimpar();
       //operaciones.arreglo_matriz();
        operaciones.mostrar_arreglos();
    }



}
package com.mycompany.funciones;
import java.util.Scanner;

public class Menu {   
    public void mostrarMenu(){
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("OPERACIONES");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Calcular resto");
            System.out.println("Ingrese la opcion, se le pedira los numeros posteriormente!");
            opcion = leer.nextInt();
            System.out.println("Ingrese numero 1: ");
            int num1 = leer.nextInt();
            System.out.println("Ingrese numero 2: ");
            int num2 = leer.nextInt();
            Funciones fc = new Funciones(num1, num2);
            switch(opcion){
                case 1:
                    int suma = fc.Suma();
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    int resta = fc.Resta();
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int producto = fc.Producto();
                    System.out.println("El producto es: " + producto);
                    break;
                case 4:
                    try{
                    double division = fc.Division();
                    System.out.println("La division es: " + division);
                    }
                    catch(ArithmeticException ex){
                        System.out.println("Recuerde que la division no puede ser por 0!!!");
                    }
                    break;
                case 5:
                    int resto = fc.Resto();
                    System.out.println("El resto es: " + resto);
                    break;
                default:
                    System.out.print("Ingrese una opcion valida!!!");
            }
        }while(opcion != 0);   
    }
    }

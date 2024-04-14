/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recursivo.ciclos;
import java.util.Scanner;
/**
 *
 * @author GEZCH
 */
public class Ciclos {
    public static void main(String[] args) {
        ciclo1();
        ciclo2();
        ciclo3();
        ciclo4();
        ciclo5();
        ciclo6();
        ciclo7();
        ciclo8();
        ciclo9();
        ciclo10();
        ciclo11();
        ciclo12();
        ciclo13();
        ciclo14();
        ciclo15();
        ciclo16();
        ciclo17();
        ciclo18();
        ciclo19();
        ciclo20();
    }
    public static void ciclo1(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Escriba un numero:");
        int num = leer.nextInt();
        int km = num/100000;
        int restoKm = num % 100000;
        int m = restoKm /100;
        int cm = restoKm % 100;
        System.out.println("Km: " + km);
        System.out.println("Metros :" + m);
        System.out.println("Cm: "+ cm);
    }
    
    public static void ciclo2(){
       int num = 1;
       while (num <=10){
           System.out.println(num++);
       }    
    }
    
    public static void ciclo3(){
       int inicio = 1;
       int fin = 10;
       int contador = 0;
       while ( inicio<=fin ){
           contador += inicio;
           inicio++;
        }
        System.out.println("La suma del 1 al 10 es: "+ contador); 
    }
    
    public static boolean ciclo4(){
        Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            if (num %2 ==0 ){
                System.out.println("El  numero "+num+" es par " );
            }else{
                System.out.println("El numero "+num+" no es par ");
            }System.out.print("¿Desea consultar otro numero? (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
        return false;
    }
    
    public static void ciclo5(){
        Scanner leer = new Scanner( System.in);
        int total = 30;
        double suma = 0;
        System.out.println("Ingrese 30 numeros: ");
        for (int i=1; i<total ; i++){
            System.out.println("Numero " + (i + 1) + ":");
            suma += leer.nextInt(); 
        }double promedio = suma/total;
        System.out.println("Promedio: "+promedio);
    }
    
    public static void ciclo6(){
       int num = 2;
       while (num <= 20){
           System.out.println(num);
           num+=2;
        }
    }
    
    public static void ciclo7(){
       int num = 1;
       int fin = 400;
       int suma = 0;
       while (num <= fin){
           suma += num;
           num++;
        }
        System.out.println("La suma del 1 al 400 es: "+ suma); 
    }
    
    public static void ciclo8(){
        Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese el diametro: ");
            int num1 = leer.nextInt();
            while (num1<0){
                System.out.println("Error,ingrese un numero positivo");
                num1 = leer.nextInt();
            }int r = num1/2; 
            double pi = 3.14;
            double area = pi*r*r;
            System.out.println("El perimetro del circulo es: "+area);
            System.out.print("Desea calcular otra area (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
    }
    
    public static void ciclo9(){
       Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese el diametro: ");
            int num1 = leer.nextInt();
            while (num1<0){
                System.out.println("Error,ingrese un numero positivo");
                num1 = leer.nextInt();
            }int r = num1/2; 
            double pi = 3.14;
            double perimetro = pi*r*2;
            System.out.println("El perimetro del circulo es: "+perimetro);
            System.out.print("Desea calcular otro perimetro (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
    }
    public static void ciclo10(){
        Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese la base: ");
            int num1 = leer.nextInt();
            while (num1<0){
                System.out.println("Error,ingrese un numero positivo");
                num1 = leer.nextInt();
            }System.out.println("Ingrese la altura: ");
            int num2 = leer.nextInt();
            while (num2<0){
                System.out.println("Error,ingrese un numero positivo");
                num2 = leer.nextInt();
            }int area = num1*num2;
            
            System.out.println("El area del rectangulo es: "+area);
            System.out.print("Desea calcular otra area (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
    }
    public static void ciclo11(){
        Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese el radio: ");
            int r = leer.nextInt();
            while (r<0){
                System.out.println("Error,ingrese un numero positivo");
                r = leer.nextInt();
            }
            double pi = 3.14;
            double volumen = (4/3)*pi*r*r*r;
            System.out.println("El volumen de la esfera es: "+volumen);
            System.out.print("Desea calcular otro volumen (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
    }
    public static void ciclo12(){
        Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese el lado: ");
            int lado = leer.nextInt();
            while (lado<0){
                System.out.println("Error,ingrese un numero positivo");
                lado = leer.nextInt();
            }
            double area = 6*lado*lado;
            double volumen = lado*lado*lado;
            System.out.println("El area del cubo es: "+area);
            System.out.println("El volumen del cubo es: "+volumen);
            System.out.print("Desea volver a calcular (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
    }
    public static void ciclo13(){
        for(int i=1 ; i<=100; i++){
            if(i%3!=0){ 
        System.out.println(i);
            }
       }
    }
    public static void ciclo14(){
        int num = 1;
        while(num <=100){
            if (num%5!=0){
                System.out.println(num);
            } num++;
        }
    }
    public static void ciclo15(){
        int num = 1;
        while(num <=100){
            if (num%5!=0 && num%3!=0){
                System.out.println(num);
            } num++;
        }
    }
    public static void ciclo16(){
        for(int i=1 ; i<=100; i++){
            if(i%3!=0){ 
            System.out.println(i);
            }else{
                System.out.println("cuek");
            }
        }
    }
    public static void ciclo17(){
        Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            int factorial = 1;
            for (int i=1; i<=num; i++){
                factorial *= i; 
            }System.out.println("factorial: "+ factorial);
            System.out.print("Desea consultar otro numero (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
    }
    public static int ciclo18(){
        Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            int contar = 0;
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            while (num>0){
                num/=10;
                contar++;
            }System.out.println("Numero de digitos: " + contar++);
            System.out.print("Desea consultar otro numero (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
        return 0;
    }
    public static void ciclo19(){
       Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese el lado: ");
            int lado = leer.nextInt();
            while (lado<0){
                System.out.println("Error,ingrese un numero positivo");
                lado = leer.nextInt();
            }
            double area = lado*lado;
            double perimetro = 4*lado;
            System.out.println("El area del cuadrado es: "+area);
            System.out.println("El perimetro del cuadrado es: "+perimetro);
            System.out.print("Desea volver a calcular (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
        }
    }
    public static void ciclo20(){
        Scanner leer = new Scanner(System.in);
        boolean otroNum = true;
        while (otroNum){
            System.out.println("Ingrese la base: ");
            int num1 = leer.nextInt();
            while (num1<0){
                System.out.println("Error,ingrese un numero positivo");
                num1 = leer.nextInt();
            }
            System.out.println("Ingrese el exponente: ");
            int num2 = leer.nextInt();
            while(num2<0){
                System.out.println("Error, ingrese un numero positivo");
                num2 = leer.nextInt();
            }
            int potencia = 1;
            for (int i =0; i<num2; i++ ){
                potencia *= num1;
            }System.out.println("Resultado: "+ potencia);
            System.out.print("Desea calcular otra potencia (si/no): ");
            String respuesta = leer.next();
            otroNum = respuesta.equals("si");
            }
    }
}


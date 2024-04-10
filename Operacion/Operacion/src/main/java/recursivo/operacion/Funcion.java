/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivo.operacion;

/**
 *
 * @author 
 */
public class Funcion {
    public int contarDig(int num1){
        if (num1<0){
            System.out.println("Error el numero debe ser mayor a 0");
            return -1;
        }
        if (num1<10){
            return 1;
        }else {
            return 1 + contarDig(num1/10);
        }  
    }
    public int sumarDig(int num2){
        if (num2<0){
            System.out.println("Error el numero debe ser mayor a 0");
            return -1;
        }
        if (num2<10){
            return num2;
        }else{
            return (num2%10)+ sumarDig(num2/10);
        }
    }
    
    public int MCD (int num3, int num4){
        if (num3 < 0 || num4 < 0) {
            System.out.println("Los números ingresados no son válidos. Deben ser enteros positivos.");
            return -1;
        }
        if (num4 == 0) {
            return num3;
        } else {
            return MCD(num4, num3 % num4);
        }
    }
    
}

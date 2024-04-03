/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertirnum;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class InvertirNum {
    ///no valida numeros
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        int num; 
        int invNum = 0;
        
        System.out.println("Ingrese un numero que NO termine en 0: ");
        num = leer.nextInt();
        
        while  (num != 0){
           int dig = num % 10;
           invNum = dig + (invNum * 10) ;
           num = num / 10;
           
           
           
       }
        
       System.out.println("Numero Invertido: " +  invNum);
       //leer.close();
       
        
       
       
    }
}

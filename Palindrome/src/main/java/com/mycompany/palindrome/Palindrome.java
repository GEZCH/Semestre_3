/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.palindrome;
public class Palindrome {
    public static boolean esPal(String cadena) {
            char[] charArray = cadena.toCharArray();
            int length = charArray.length;
        
            for (int i = 0; i < length; i++) {
                if (charArray[i] != charArray[length - 1 - i]) {
                    return false;
                }
            }
        
            return true;
        }

    public static void main(String[] args) {
        String palabra = "reconocer";
        if (esPal(palabra)) {
            System.out.println( palabra  + " es un palindromo " );
        } else {
            System.out.println( palabra + " no es un palindromo ");
        }
    }
}
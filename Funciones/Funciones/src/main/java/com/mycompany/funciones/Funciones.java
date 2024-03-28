package com.mycompany.funciones;

public class Funciones{
    private int num1;
    private int num2;
    
    public static void main(String[] args){}
    
    public Funciones (int nume, int nume2){
        num1 = nume;
        num2 = nume2;
    }
     
    public int getNum1(){
        return num1;    
    }

    public void setNum1(int nume){
        this.num1 = nume;    
    }    
     
    public int getNum2(){
        return num2;
    }   
         
    public void setNum2(int nume2){
        this.num2= nume2;
    }
    
    public int Suma(){
        return num1 + num2;
    }
    
    public int Resta(){
        return num1 - num2;
    }
    
    public int Producto(){
        return num1 * num2;
    }
    
    public double Division(){
        return num1 / num2;
    }
    
    public int Resto(){
        return num1 % num2;
    }
}

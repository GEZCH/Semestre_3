/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.Arrays;

/**
 *
 * @author pclab0.pc10
 */
public class Ordenamientos {
    private void MuestraArray(int [] a){
        for (int i=0;i<a.length;i++){
            System.out.print("["+a[i]+"]");
            }System.out.println("");
        System.out.println("");        
        }

    public void BubleSort(){
        int a[] = {54,26,93,17,77,31,44,55,20};  
        int n = a.length;
        int nivel = n*n;
        int temp; 
        int inter = 0, c = 0;
        for(int i=0; i < n; i++){
            this.MuestraArray(a);
            for(int j=1; j < (n-i); j++){
                if(a[j-1] > a[j]){  
                    temp = a[j-1]; 
                    a[j-1] = a[j];  
                    a[j] = temp;
                    inter++;
                }c++;       
            } }this.MuestraArray(a);   
        System.out.println("n° de comparaciones: "+c+" n° de intercambios: "+inter);
        System.out.println("Complejidad del arreglo "+Arrays.toString(a)+"-->"+nivel);
        }

    public void SelectionSort() {
        int a[] = {54,26,93,17,77,31,44,55,20}; 
        int n = a.length, nivel = n*n, c=0, inter=0;
        for (int i = 0; i < n - 1; i++) {
            this.MuestraArray(a);
            System.out.println("n° de comparaciones: "+c+" n° de intercambios: "+inter);
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                    }c++;
                }int temp = a[i];
            a[i] = a[indiceMinimo];
            a[indiceMinimo] = temp;
            inter++;
            }System.out.println("Complejidad del arreglo "+Arrays.toString(a)+"-->"+nivel);
        } 
        
    public void InsertionSort() {
        int a[] = {54,26,93,17,77,31,44,55,20};  
        int n = a.length, nivel = n*n, c=0, inter=0;
        for (int i = 1; i < n; i++) {
            this.MuestraArray(a);
            System.out.println("n° de comparaciones: "+c+" n° de intercambios: "+inter);
            int valorActual = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > valorActual) {
                a[j + 1] = a[j];
                j--;
                inter++;
                }a[j + 1] = valorActual;
            c++;
            }System.out.println("Complejidad del arreglo "+Arrays.toString(a)+"-->"+nivel);
        }

    public void ShellSort() {
        int a[] = {54,26,93,17,77,31,44,55,20};  
        int n = a.length, incremento = n, c=0, inter=0;
        double ar = a.length, nivel = (ar*Math.log10(ar))*(ar*Math.log10(ar));
        do {
            this.MuestraArray(a);   
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < n; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && a[j] < a[j - incremento]) {
                        int tmp = a[j];
                        a[j] = a[j - incremento];
                        a[j - incremento] = tmp;
                        j -= incremento;
                        inter++;
                        }c++;
                    }}} 
        while (incremento > 1);
        this.MuestraArray(a);  
        System.out.println("n° de comparaciones: "+c+" n° de intercambios: "+inter);
        System.out.println("Complejidad del arreglo "+Arrays.toString(a)+"-->"+nivel);
        }
    
    public void mergeSort(int [] arr) {
        if (arr.length < 2) {return;}
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        //double ar = arr.length, nivel = ar*Math.log10(ar);
        
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
        //this.MuestraArray(arr);  
        //System.out.println("Complejidad del arreglo "+Arrays.toString(arr)+"-->"+nivel);
        }

    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0, c = 0, inter =0;
        double ar = arr.length, nivel = ar*Math.log10(ar);
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                inter++;
                
            } else{
                arr[k] = right[j];
                inter++;
                j++;     
            }k++;
            c++;
        }while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
            c++;
            inter++;
        }while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
            c++;
            inter++;
        }c++;
        this.MuestraArray(arr);  
        System.out.println("n° de comparaciones: "+c+" n° de intercambios: "+inter);
        //this.MuestraArray(arr);  
        System.out.println("Complejidad del arreglo "+Arrays.toString(arr)+"-->"+nivel);
    }
    
    public void quickSort(int[] arr){
        this.MuestraArray(arr);  
        quick(arr, 0, arr.length-1);
        double ar = arr.length, nivel = ar*Math.log10(ar);
        System.out.println("Complejidad del arreglo "+Arrays.toString(arr)+"-->"+nivel);  
    }
    
    public void quick(int[] arr, int inicio, int fin){
        if(inicio<fin){
            int inicPar = particion( arr, inicio, fin);
            quick( arr, inicio, inicPar -1);
            quick(arr, inicPar +1, fin);  
        }}
    
    public int particion(int[] arr, int inicio, int fin){
        int piv = arr[fin], i = inicio -1, inter = 0, c = 0;
        for(int j =inicio; j<fin; j++){
            if(arr[j]<=piv){
                i++;
                c++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr [j] = temp;
                inter++;
                this.MuestraArray(arr);
                System.out.println("n° de comparaciones: "+c+" n° de intercambios: "+inter);
            }c++;}
        int temp = arr[i+1];
        arr[i+1] = arr[fin];
        arr[fin] = temp;
        inter++;
        this.MuestraArray(arr);
        System.out.println("n° de comparaciones: "+c+" n° de intercambios: "+inter);
        return i+1;
    }}

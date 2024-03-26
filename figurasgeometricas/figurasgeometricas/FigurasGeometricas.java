package figurasgeometricas;
import java.util.Scanner;
public class FigurasGeometricas {
        double ladoA,ladoB,ladoC,radio;
        Scanner leer = new Scanner(System.in);

    public void rectangulo(){
        System.out.print("Ingrese el lado A: ");
        ladoA=leer.nextDouble();
        System.out.print("Ingrese el lado B : ");
        ladoB=leer.nextDouble();

        rectangulo objetoRectangulo = new rectangulo(ladoA, ladoB);
        double peri = objetoRectangulo.getPerimetro(); 
        double are = objetoRectangulo.getArea();
            
        System.out.println("Perimetro: "+ peri);
        System.out.println("Área: "+ are );
    } 
    
    public void cuadrado(){
        System.out.print("Ingrese el lado: ");
        ladoC=leer.nextDouble();

        cuadrado objetoCuadrado = new cuadrado(ladoC);
        double per= objetoCuadrado.getPerimetro(); 
        double area= objetoCuadrado.getArea();

        System.out.println("Perimetro "+ per);
        System.out.println("Área "+ area );
    }

    public void circulo(){
        System.out.print("Ingrese el radio: ");
        radio=leer.nextDouble();

        circulo objetoCirculo = new circulo(radio);
        double p  = objetoCirculo.getPerimetro(); 
        double a = objetoCirculo.getArea();

        System.out.println("Área: "+ p);
        System.out.println("Perimetro "+ a );
    }
}
    


        
    



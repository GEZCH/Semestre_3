package figurasgeometricas;
public class cuadrado {
    private double ladoC;
    
    public cuadrado(double ladoCC){
        ladoC = ladoCC;
    }

    public void setLado(double ladoCC){
        this.ladoC = ladoCC;
    }    

    public double getPerimetro() {
        return 4* ladoC;
    }

    public double getArea() {
        return ladoC*ladoC;
    }
}

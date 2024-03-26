package figurasgeometricas;

public class circulo {
    private double radio;

    public circulo(double radioR){
        radio = radioR;
    }
    
    public void setRadio(double radioR){
        this.radio = radioR;
    }    
    public double getPerimetro() {
        return 2 *Math.PI* radio;
    }
    public double getArea() {
        return Math.PI *radio*radio;
    }
}

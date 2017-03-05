package ejercicios03;
public class Triangle extends GeometricFigure{
    public Double Area(){
        return(this.getAncho()*this.getAltura())/2;
        
    }
    public Triangle(Double altura, Double ancho, Enum figura) {
        super(altura, ancho, figura);
    }
    
}

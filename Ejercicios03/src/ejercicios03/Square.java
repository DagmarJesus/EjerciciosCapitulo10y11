package ejercicios03;
public class Square extends GeometricFigure {

    public Square(Double altura, Double ancho, Enum figura) {
        super(altura, ancho, figura);
    }
    
    public Double Area(){
    return (this.getAltura()*this.getAncho());
    }
}

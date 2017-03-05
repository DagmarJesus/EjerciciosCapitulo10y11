package ejercicios03;
public abstract class GeometricFigure {
    private Double altura;
    private Double ancho;
    private Enum figura;

    public GeometricFigure(Double altura, Double ancho, Enum figura) {
        this.altura = altura;
        this.ancho = ancho;
        this.figura = figura;
    }
  public abstract Double Area();
    public Double getAltura() {
        return altura;
    }
    public Double getAncho() {
        return ancho;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

}




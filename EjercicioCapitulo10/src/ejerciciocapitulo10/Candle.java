package ejerciciocapitulo10;
public class Candle {
    
    private String Colour;
    private double Height;
    private double Price;

    public String getColour() {
        return Colour;
    }

    public void setColour(String Color) {
        this.Colour = Color;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
        this.Price = Height*2;
    }

    public double getPrice() {
        return Price;
    }
    
    
    
}
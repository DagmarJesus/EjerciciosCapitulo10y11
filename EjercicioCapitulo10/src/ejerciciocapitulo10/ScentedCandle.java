package ejerciciocapitulo10;
public class ScentedCandle extends Candle {
    private String Olor;

    public String getOlor() {
        return Olor;
    }
    public void setOlor(String Aroma) {
        this.Olor = Aroma;
    }
    public void setHeight (double Peso){
        super.Height = Peso;
	super.Price = 3.00 * Peso;   
    }    
}     
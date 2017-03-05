
package ejercicios03;
public class InternationalDivision extends Division{
     private String country;
     private String language; 

    public InternationalDivision(String nombre, String numeroCuenta,String pais,String lengua) {
        super(nombre, numeroCuenta);
        this.country=pais;
        this.language=lengua;
    }

    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }
    

    
    
}

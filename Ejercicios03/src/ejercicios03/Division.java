package ejercicios03;
public abstract class Division {
    public String name;
    public String cuenta;

    public Division(String nombre, String numerodecuenta) {
        this.name = nombre;
        this.cuenta = numerodecuenta;
    }

    public String getName() {
        return name;
    }

    public String getCuenta() {
        return cuenta;
    }
    
  
    
    
}
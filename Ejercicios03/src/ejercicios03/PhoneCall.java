
package ejercicios03;

public abstract class PhoneCall {
    private String numero;
    Double precio;

    public PhoneCall(String numero) {
        this.numero = numero;
        this.precio=0.00;
    }

    public String getNumero() {
        return numero;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public abstract void mensaje();
      
   
    
    
}

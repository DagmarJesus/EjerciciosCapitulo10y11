
package ejercicios03;
public class DomesticDivision extends Division {
    private String estado;
    public DomesticDivision(String nombre, String nCuenta ,String estado) {
        super(nombre, nCuenta);
        this.estado=estado;  
    }

    public String getEstado() {
        return estado;
    }

    public String getname() {
        return name;
    }

    public String getncuenta() {
        return cuenta;
    }
    
}

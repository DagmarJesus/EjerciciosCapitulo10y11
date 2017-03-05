package ejercicios03;
public class OutgoingPhoneCall extends PhoneCall {
    private Integer time;
    public OutgoingPhoneCall(String numero, Integer tiempo) {
        super(numero);
        time=tiempo*60;
        setTime(tiempo);
        super.setPrecio(0.04);
    }
    public Integer getTiempo() {
        return time;
    }
    public void setTime(Integer tiempo) {
        this.time = tiempo;
    }

    public void mensaje() {
        System.out.println("Numero de Telefono "+super.getNumero());
        System.out.println("Precio por minuto "+super.getPrecio());
        System.out.println("Minutos de la llamada "+getTiempo());
        System.out.println("El precio por la llamada "+super.getPrecio()*getTiempo());
        
    }

}

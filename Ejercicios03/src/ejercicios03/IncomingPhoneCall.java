package ejercicios03;
public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String numero) {
        super(numero);
        super.setPrecio(0.02);
    }
    public void mensaje() {
          System.out.println("Numero de telefono "+super.getNumero());
        System.out.println("Prrecio por minuto "+super.getPrecio());
        
    }
    
    
}

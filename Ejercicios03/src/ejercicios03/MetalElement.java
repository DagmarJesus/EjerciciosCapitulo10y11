package ejercicios03;
public  class MetalElement extends Element {
    public MetalElement(String simbolo, Integer numeroa, Double pesoa) {
        super(simbolo, numeroa, pesoa);
    }   
    public void explicaciondeElement() {
       System.out.println("Explicacion"); 
    }
}

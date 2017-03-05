
package ejercicios03;
public abstract class Element {
    private String simbolo;
    private Integer numeroa;
    private Double pesoa;

    public Element(String simbolo, Integer nAtomico, Double pAtomico) {
        this.simbolo = simbolo;
        this.numeroa = nAtomico;
        this.pesoa = pAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public Integer getNumeroa() {
        return numeroa;
    }

    public Double getPesoa() {
        return pesoa;
    }
    public abstract void explicaciondeElement();
}
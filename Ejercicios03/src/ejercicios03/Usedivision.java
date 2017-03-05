package ejercicios03;

public class Usedivision {

    public static void main(String[] args) {
        InternationalDivision corporacion = new InternationalDivision("Lg", "8869", "Japon", "Japones");
        System.out.println(corporacion.getName());
        System.out.println(corporacion.getCuenta());
        System.out.println(corporacion.getLanguage());
        System.out.println(corporacion.getCountry());
        System.out.println();
        DomesticDivision empresa = new DomesticDivision("Puma", "76895", "Guadalajara");
        System.out.println(empresa.getName());
        System.out.println(empresa.getCuenta());
        System.out.println(empresa.getEstado());

    }
}

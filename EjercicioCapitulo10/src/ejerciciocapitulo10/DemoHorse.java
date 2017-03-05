package ejerciciocapitulo10;
public class DemoHorse{
    public static void main(String[] args) {
      
        Horse Spirit = new Horse();
        Spirit.setNombre("Spirit");
        Spirit.setColour("White");
        Spirit.setBirthyear(1998);

        RaceHorse Juxxi= new RaceHorse();
        Juxxi.setNombre("Juxxi");
        Juxxi.setColour("Brown");
        Juxxi.setBirthyear(1998);
        Juxxi.setNumDeCarreras(15);
        Juxxi.setFinishingPosition(1);
        System.out.println(Spirit.getNombre() + " es de color " + Spirit.getColour() + " el caballo, nacio en el año" + Spirit.getBirthyear() + ".");
        System.out.println(Juxxi.getNombre() + " es de color " + Juxxi.getColour() + " el caballo de carreras, nacio en el año " + Juxxi.getBirthyear() + ", y participo en " + Juxxi.getNumDeCarreras() + " su Rankig es del numero: #" + Juxxi.getFinishingPosition() + ".");
        
    }
}
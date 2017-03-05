package ejerciciocapitulo10;
public class DemoCabinRental {
  public static void main(String[] args) {
		CabinRental c1 = new CabinRental(6);
		HollidayCabinRental c2 = new HollidayCabinRental(2, 3202);
		System.out.println("Cabina Uno");
		System.out.println(" Numero de Cabina: " + c1.getNum());
		System.out.println(" Ranking de la semana: $" + c1.getRte());
		System.out.println();
		
		System.out.println("Cabina Dos");
		System.out.println(" Numero de Cabina: " + c2.getNum());		
		System.out.println(" Ranking de la semana: $" + c2.getRte());
		System.out.println();

	}  
}
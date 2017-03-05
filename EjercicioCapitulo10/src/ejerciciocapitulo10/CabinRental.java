
package ejerciciocapitulo10;
public class CabinRental {
    	private Integer Num;
	protected double Rte;
	CabinRental(int numero) {
		this.Num = numero;
		
		if (numero == 1) {
			this.Rte = 950;
		} else {
			this.Rte = 1100;
		}
	}
	public int getNum() {
		return this.Num;
	}
	
	public double getRte() {
		return this.Rte;
	}
}
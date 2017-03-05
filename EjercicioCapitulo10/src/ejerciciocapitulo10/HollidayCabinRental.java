package ejerciciocapitulo10;
public class HollidayCabinRental extends CabinRental{
    private int roomNum;
	HollidayCabinRental(int cabinNum, int room) {
		super(cabinNum);
		super.Rte = super.getRte() + 150;
		this.roomNum = room;
	}
	public int getRoomNum() {
		return this.roomNum;
	}
}
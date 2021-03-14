package innerclasses;

public class GearBox {

	public int maxGear;
	public int currentGear;
	
	public GearBox(int maxGear, int currentGear) {
		this.maxGear = maxGear;
		this.currentGear = currentGear;
	}
	
	public class Gear {
		public int gearNumber;
		
		public Gear(int gearNumber) {
			this.gearNumber = gearNumber;
		}
	}
	
	public static class Engine {
		int volume;
	}
}

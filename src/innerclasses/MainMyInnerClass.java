package innerclasses;

public class MainMyInnerClass {

	public static void main(String[] args) {

		new Animal() {

			@Override
			public void walk() {

				System.out.println("Animal walking");
			}
		}.walk();
		
		GearBox theGearBox = new GearBox(5, 0);
		GearBox.Gear first = theGearBox.new Gear(1);
		System.out.println(theGearBox.maxGear);
		System.out.println(first.gearNumber);
		
		GearBox.Engine theEngine = new GearBox.Engine();
	}

}

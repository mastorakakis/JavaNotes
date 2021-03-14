package pattern.builder;

public class Main {

	public static void main(String[] args) {

		Player thePlayer = new Player("Red");
		thePlayer.setResources(new Resources.Builder().Food(2)
													  .Wood(1)
													  .Stone(0)
													  .Cloth(0)
													  .Gold(0).build());
		System.out.println(thePlayer);
	}
}

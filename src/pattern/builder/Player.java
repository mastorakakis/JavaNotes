package pattern.builder;

public class Player {
	
	private String color;
	private Resources resources;
	
	public Player(String color) {
		this.color = color;
	}
	
	public void setResources(Resources resources) {
		this.resources = resources;
	}
	@Override
	public String toString() {
		return "Player [color=" + color + ", resources=" + resources + "]";
	}
	
}

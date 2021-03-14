package pattern.builder;

public class Resources {

	private int food;
	private int wood;

	private int stone;
	private int cloth;	
	private int gold;
	
	public Resources(Builder builder) {
		food = builder.food;
		wood = builder.wood;
		stone = builder.stone;
		cloth = builder.cloth;
		gold = builder.gold;
	}
	
	public static class Builder {
		private int food;
		private int wood;
		private int stone;
		private int cloth;	
		private int gold;
		
		public Builder Food(int food) {
			this.food = food;
			return this;
		}

		public Builder Wood(int wood) {
			this.wood = wood;
			return this;
		}

		public Builder Stone(int stone) {
			this.stone = stone;
			return this;
		}

		public Builder Cloth(int cloth) {
			this.cloth = cloth;
			return this;
		}

		public Builder Gold(int gold) {
			this.gold = gold;
			return this;
		}
		
		public Resources build() {
			return new Resources(this);
		}
	}
	
	@Override
	public String toString() {
		return "Resources [food=" + food + ", wood=" + wood + ", stone=" + stone + ", cloth="
				+ cloth + ", gold=" + gold + "]";
	}
}

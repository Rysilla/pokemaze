class Player extends Entity {

	protected String name = "@";
	protected int hp;

	public Player() {
		this.xPos = 4;
		this.yPos = 4;
	}

	public String getName() {
		return this.name;
	}

	public int[] getPos() {
		int[] x = { this.xPos, this.yPos };
		return x;
	}

	public int getHp() {
		return this.hp;
	}

}
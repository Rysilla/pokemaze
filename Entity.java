class Entity {

	protected String name;
	protected String type;
	protected int xPos;
	protected int yPos;

	public Entity() {
		this.name = ".";
	}

	public int getX() {
		return this.xPos;
	}

	public int getY() {
		return this.yPos;
	}

	public String getName() {
		return this.name;
	}


	public void move(String m) {
		if (m.equals("a")) {
			xPos -= 1;
		} else if (m.equals("d")) {
			xPos += 1;
		} else if (m.equals("w")) {
			yPos -= 1;
		} else if (m.equals("s")) {
			yPos += 1;
		}
	}

	public int[] next(Player player, String m) {

		int curY = player.getY();
		int curX = player.getX();
	
		if (m.equals("a")) {
			curX -= 1;
		} else if (m.equals("d")) {
			curX += 1;
		} else if (m.equals("w")) {
			curY -= 1;
		} else if (m.equals("s")) {
			curY += 1;
		}

		int[] ar = { curY, curX } ;
		return ar;

	}




	public int xZero(int x) {

		if ( (xPos -= 1) < 0) {
			return 0; 
		} else {
			return x;
		}

	}

	public int yZero(int x) {
		if ( (yPos -= 1) < 0 ) {
			return 0;
		} else {
			return x;
		}
	}



}
class Maze {

	Entity e = new Entity();
	Wall w = new Wall();
	Floor f = new Floor();

	protected Entity[][] theMaze = {
		{f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f},
		{w, e, e, e, e, e, e, e, e, e, e, e, e, e, e, e, e, e, e,  e, e, e, e, e, e, e, e, e, e, w},
		{w, e, e, e, e, e, w, e, w, f, f, e, w, e, e, e, e, e, e, w},
		{w, e, e, e, e, e, w, e, w, e, w, e, w, e, e, e, e, e, e, w},
		{w, e, e, e, e, e, w, e, w, e, w, e, w, e, e, e, e, e, e, w},
		{w, e, e, e, e, e, e, e, e, e, w, e, w, e, e, e, e, e, e, w},
		{w, e, e, e, e, e, e, e, e, e, w, e, w, e, e, e, e, e, e, w},
		{w, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, f, w},
	};

	//prints maze
	public void getMaze(Player player) {

		for (int i = 0; i < theMaze.length; i++) {

			for (int j = 0; j < theMaze[i].length; j++) {
				System.out.print(theMaze[i][j].getName());
			}

			System.out.println("");
		}

	}

	//sets player position
	public void setPlayerPosition(Player player) {
		theMaze[player.getY()][player.getX()] = player;

	}

	//moves entity
	public void moveEntity(Player player, String m) {

		int lastX = player.getX();
		int lastY = player.getY();
		theMaze[lastY][lastX] = e;

		//checks space
		if (checkSpace(player, m).equals("barrier")) { 
			System.out.println("BLOCKED");
		} else {
			
			player.move(m);			
		}

	}

	public String checkSpace(Player player, String move) {

		//gets next player location
		int nextY = player.next(player, move)[0];
		int nextX = player.next(player, move)[1];
		Entity nextEnt = theMaze[nextY][nextX];

		if (nextEnt.getName().equals("|") || nextEnt.getName().equals("-") ) {
			return "barrier";	
		}		
		
		return "free";
	}


	
}











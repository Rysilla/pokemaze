import java.io.*;

class Main {

	public static void main(String[] args) throws Exception {

		//clears the terminal
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Player player = new Player();
		Maze maze = new Maze();
		maze.setPlayerPosition(player);

		boolean check = true;
		int moveCount = 0;
		String lastMove = "";

		while (check == true) {
			System.out.print("\033[H\033[2J");  
			maze.setPlayerPosition(player);
			maze.getMaze(player);
			System.out.println("\n\ne to end, wasd to move");
			System.out.println("Position: X: " + player.getX() +  " Y: " + player.getY());
			System.out.println("Move Count: " + moveCount);
			String ans = input.readLine();

			if (ans.equals("e")) {
				check = false;
			}
			moveCount++;
			maze.moveEntity(player, ans);

		}

		System.out.println("Developer Status:");
		System.out.println("Position: X: " + player.getX() +  " Y: " + player.getY());

	}

}
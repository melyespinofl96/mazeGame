public class textClass {

	static void intro(String playerName) {
		String intro = "After moving into a new house, " + playerName + " has been constantly hearing noises throughout the day.\n" +
				"One night " + playerName + " could not sleep and decided to explore around the house to find out what was making the noises.\n" + 
				playerName + " followed the noises and ended up walking into a cave. While in the cave, " + playerName + " fell into a pit.\n" + playerName + " could not climb out." + 
				"In the pit " + playerName + " discovers the creatures making the noises and also\nfinds out that they are all stuck in an underground maze.";
		System.out.println(intro);
	}
	static void pickMazeSize() {
		System.out.println("Pick a maze size:");
		System.out.println(" 1 - 5x5");
		System.out.println(" 2 - 10x10");
		System.out.println(" 3 - 15x15");
		System.out.println(" 4 - 20x20");
	}
}

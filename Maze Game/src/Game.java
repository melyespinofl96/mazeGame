import java.util.Random;
import java.util.Scanner;

public class Game {
	public static String playerName;
	public static int mazeChoice;
	
	public static void start(){
	    char menuOp;  
		Scanner s = new Scanner(System.in);
		getName();
		seperator();
		textClass.intro(playerName);
		seperator();
		textClass.pickMazeSize();
		mazeChoice();
		seperator();
	      // Menu
	      do {
	         System.out.println("\nMENU");
	         System.out.println("m - move");
	         System.out.println("b - backpack");
	         System.out.println("s - search ");
	         System.out.println("q - Quit");
	      
	         System.out.println("\nChoose an option:");
	  		 Movement.playerPosition(mazeChoice);
	         menuOp = s.next().charAt(0);

	         //move command
	         if (menuOp == 'm') {
	        	 System.out.println();
	        	 System.out.println("Use WASD to move around");
	        	 System.out.println("w - up");
	        	 System.out.println("s - down");
	        	 System.out.println("a - left");
	        	 System.out.println("d - right");
	        	 
	        	 Movement.playerMove();
	        	 
	         }
	         
	         //backpack command
			/*
			 * if (menuOp == 'b') { System.out.println("backpack"); playerRating =
			 * scnr.nextInt();
			 * 
			 * System.out.println("ABOVE " + playerRating); for(i = 0; i < NUM_PLAYERS; i++)
			 * { if(playerRating < ratingNums[i]) { System.out.println("Player " + (i+1) +
			 * " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratingNums[i]); } } }
			 */
	         
	      //search command
			/*
			 * if(menuOp == 's') { System.out.println("Enter a jersey number:"); playerJersy
			 * = scnr.nextInt();
			 * 
			 * for(i = 0; i < NUM_PLAYERS; i++) { if(playerJersy == jerseyNums[i]) {
			 * System.out.println("Enter a new jersey number:"); jerseyNums[i] =
			 * scnr.nextInt(); System.out.println("Enter a rating for the new player:");
			 * ratingNums[i] = scnr.nextInt(); } } }
			 */
	         
			/*
			 * // Output roster if (menuOp == 'o') { System.out.println("ROSTER"); for (i =
			 * 0; i < NUM_PLAYERS; ++i) { System.out.println("Player " + (i + 1) +
			 * " -- Jersey number: " + jerseyNums[i] + ", Rating: " + ratingNums[i]); } //
			 * end for loop } // end if
			 */
	      //  Quit -- Exits loop

	      } while(menuOp != 'q');     
	}
	
	
	
	
	
	
	
	
	
	//==========================================================
	public static void mazeChoice() {
		Scanner s = new Scanner(System.in);
		mazeChoice = s.nextInt();
	}
	
	
	public static String getName() {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your name: ");
		String playerName = s.next();
		return playerName;
	}
	
	public static void seperator() {
		System.out.println();
		System.out.println("===============================");
		System.out.println();
	}
	
	
	
	//get a random enemy
	public static String randomEnemy() {
		String[] enemies = {"Goblin", "Ogre"};
		String randomEnemy = (enemies[new Random().nextInt(enemies.length)]);
		
		return randomEnemy;	
	}
	
	//determines whether there is a random encounter or not with 20% chance true
	public static boolean randomEncounter(){
		Random random = new Random();
		boolean encounter = (random.nextInt(5) == 0) ? true : false;
		return encounter;
	}
	
}

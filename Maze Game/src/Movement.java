import java.util.Scanner;

public class Movement {

	//displays players position with an "X"
	public static void playerPosition(int mazeChoice) {
		//search for player start position
		if(mazeChoice == 1) {	
			for(int i = 0; i < Maps.maze5x5.length; i++) {
					if(Maps.maze5x5 [i][i] == 'P') {
						Maps.displayMaze5x5[i][i] = " X ";
					}
				}
				Maps.displayMaze5x5();
		}
	}
	
	//method to determine whether it is possible to move or not
	public static void playerMove() {
		
		Scanner s = new Scanner(System.in); 
		char directionInput;
		
			directionInput = s.next().charAt(0);
			//check if player can move or not
			if(directionInput == 'w') {
					for(int i = 0; i < Maps.maze5x5.length; i++) {
						for(int j = 0; j < Maps.maze5x5[i].length; j++) {
						//this looks for Player position
							if(Maps.maze5x5 [i][i] == 'P') {
								//check to see if there is a wall first
								if(Maps.maze5x5[i][i-1] == 'W') {
									//cant move there if there is a wall
									System.out.println("You cant Move there");
									//if not then move to the new space
									}else if(Maps.maze5x5[i][i-1] == ' ') {
										//remove player from current position
										Maps.maze5x5[i][i] = ' ';
										//add player to new location
										Maps.maze5x5[i][i-2] = 'P';
										//remove player from the display maze
										Maps.displayMaze5x5[i][i] = "   ";
										//move player to new location on the display maze
										Maps.displayMaze5x5[i][i-2] = " X ";
										//display maze
										Maps.displayMaze5x5();
									}
							}
						}
					}
			}
				
				//south
			if(directionInput == 's') {
					for(int i = 0; i < Maps.maze5x5.length; i++) {
						for(int j = 0; j < Maps.maze5x5[i].length; j++) {
							if(Maps.maze5x5 [i][i]== 'P') {
								if(Maps.maze5x5[i+1][i] == 'W') {
									System.out.println("You cant Move there");
								}else if(Maps.maze5x5[i+1][i] == ' '){
									Maps.maze5x5[i][i] = ' ';
									Maps.maze5x5[i+2][i] = 'P';
									Maps.displayMaze5x5[i][i] = "   ";
									Maps.displayMaze5x5[i+2][i] = " X ";
									Maps.displayMaze5x5();
								}
							}
						}
					}
			}
				
				//right
			if(directionInput == 'd') {
					for(int i = 0; i < Maps.maze5x5.length; i++) {
						if(Maps.maze5x5 [i][i] == 'P') {
							if(Maps.maze5x5[i][i+1] == 'W') {
								System.out.println("You cant Move there");
							}else if(Maps.maze5x5[i][i+1] == ' '){
								Maps.maze5x5[i][i] = ' ';
								Maps.maze5x5[i][i+2] = 'P';
								Maps.displayMaze5x5[i][i] = "   ";
								Maps.displayMaze5x5[i][i+2] = " X ";
								Maps.displayMaze5x5();
							}
						}
					}
			}
				//left
			if(directionInput == 'a') {
					for(int i = 0; i < Maps.maze5x5.length; i++) {
						if(Maps.maze5x5 [i][i]== 'P') {
							if(Maps.maze5x5[i][i-1] == 'W') {
								System.out.println("You cant Move there");
							}else if(Maps.maze5x5[i][i-1] == ' '){
								Maps.maze5x5[i][i] = ' ';
								Maps.maze5x5[i-2][i] = 'P';
								Maps.displayMaze5x5[i][i] = "   ";
								Maps.displayMaze5x5[i-2][i] = " X ";
								Maps.displayMaze5x5();
							}
						}
					}
				}
		}
}

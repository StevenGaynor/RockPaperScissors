/**
RockPaperScissors.java - Rock Paper Scissors Game - Instantiable Class
@author Steven Gaynor
studentID x14108038
@date created 21/11/2014
*/
import java.util.Random;

public class RockPaperScissors {
	//Fields
	private int computerNumber;
	private	int userNumber;
		
	private	int max;
	private	int min;
		
	private	int userScore;
	private	int computerScore;
	
	private int userLives;
	
		//Constructor
		public RockPaperScissors () {
			this.computerNumber = 0;
			this.userNumber = 0;
			this.max = 3;
			this.min = 1;
			this.userScore = 0;
			this.computerScore = 0;
			this.userLives = 3;
		}
		
			//Setters
			public void setUserNumber(int userNumber) {
				this.userNumber = userNumber;
				}
				
			
			//Getters
			public int getUserScore() {
				return this.userScore;
			}
			public int getComputerScore() {
				return this.computerScore;
			}
			public int getUserLives() {
				return this.userLives;
			}
	
	
					//Methods
					public void playGame(){
						//Generating Computer Number (i.e. the computer's "Hand")
						Random rand = new Random();
						computerNumber = rand.nextInt ((max - min) + 1) + min;
					
						//Converting process numbers into readable Strings for output
						if (userNumber == 1) {
							System.out.println("-------------------------");
							System.out.println(" User Hand: Rock");
							}else if (userNumber == 2) {
								System.out.println("-------------------------");
								System.out.println(" User Hand: Paper");
							}else if (userNumber == 3) {
								System.out.println("-------------------------");
								System.out.println(" User Hand: Scissors");
							}
							
						if (computerNumber == 1) {
								System.out.println(" Computer Hand: Rock");
							}else if (computerNumber == 2) {
								System.out.println(" Computer Hand: Paper");
							}else if (computerNumber == 3) {
								System.out.println(" Computer Hand: Scissors");
							}
					
							
						//The Game Process
							//1. Rock beats Scissors
									if (userNumber == 1 && computerNumber == 3){
								System.out.println(" Rock smashed the Scissors" + " : You win 1 point.");
								System.out.println("-------------------------");
								userScore++;
								} else if (userNumber == 3 && computerNumber == 1) {
									System.out.println(" Rock smashed the Scissors" + " : Computer wins 1 point.");
									System.out.println("-------------------------");
									computerScore++;
							//2. Scissors beats Paper
								} else if (userNumber == 3 && computerNumber == 2) {
									System.out.println(" Scissors cuts the Paper" + " : You win 1 point.");
									System.out.println("-------------------------");
									userScore++;
								} else if (userNumber == 2 && computerNumber == 3) {
									System.out.println(" Scissors cuts the Paper" + " : Computer wins 1 point.");
									System.out.println("-------------------------");
									computerScore++;
							//3. Paper beats Rock
								} else if (userNumber == 2 && computerNumber == 1) {
									System.out.println(" Paper wraps the Rock" + " : You win 1 point.");
									System.out.println("-------------------------");
									userScore++;
								} else if (userNumber == 1 && computerNumber == 2) {
									System.out.println(" Paper wraps the Rock" + " : Computer wins 1 point.");
									System.out.println("-------------------------");
									computerScore++;
							//4. Draws
								} else {System.out.println(" It's a DRAW");
										System.out.println("-------------------------");}
					}
					
					public void resetScores(){
						userScore = 0;
						computerScore = 0;
					}
					
									
	
}
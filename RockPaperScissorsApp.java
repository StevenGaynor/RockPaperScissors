/**
RockPaperScissorsApp.java - Input and Output Class for Rock Paper Scissors Game
@author Steven Gaynor
studentID x14108038
@date created 21/11/2014
*/

import java.util.Scanner;
import java.util.Arrays;
public class RockPaperScissorsApp {

	public static void main(String[] args) {
	
		//main method local variables
		int userNumber, gameChoice, userScore, computerScore, userLives;
		int scoreBoard[][] = new int[50][50];
		
		//Welcome Message
		System.out.println("==========================================================================");
		System.out.println("                 Welcome to the Rock Paper Scissors Game!");
		System.out.println("                                O    [=]   ><            ");
		System.out.println(" ");
		System.out.println(" Authored by Steven Gaynor (x14108038) for SDEV HDCLOUD - Nov./Dec. 2014  ");
		System.out.println("==========================================================================");
		
		//Creating & Initialising object from RockPaperScissors Class
		RockPaperScissors rps;
		rps = new RockPaperScissors();
		userLives = rps.getUserLives();
		
		//Creating & Initialising object from GameStats class, creating 2-D Array (fill with -1's as default)
		GameStats stat;
		stat = new GameStats();
		stat.getScoreBoard();
		for (int[] row: scoreBoard)
				Arrays.fill(row, -1);
		stat.setScoreBoard(scoreBoard);
		/*System.out.println("Test if array filled with defaults  : " + scoreBoard[1][14] + scoreBoard[0][33]);*/
		
		//Rules and User choice of number of games per round
		System.out.println(" You begin with " + userLives + " Lives. ");
		System.out.println(" Losing a game loses a life and vice-versa.");
		System.out.println(" You win the whole match if you get the lucky 7 lives!");
		System.out.println(" How many rounds do you want in each game?");
		System.out.print("-> ");
		Scanner sc = new Scanner(System.in);
		gameChoice = sc.nextInt();
		
		//User Input of Shape, validating Input, Invoking the Game Process
		while (userLives > 0 && userLives < 7) {
				for(int i = 0; i < gameChoice; i = i + 1) {
							System.out.println("=======================================================");
							System.out.println(" Please select a number according to your shape choice: ");
							System.out.println(" 1. Rock");
							System.out.println(" 2. Paper");
							System.out.println(" 3. Scissors");
							System.out.print("-> ");
							userNumber = sc.nextInt();
								//Error message for invalid entry
								while((userNumber>=4) || (userNumber<=0)) {
									System.out.println(" Invalid Entry: Please enter 1(Rock), 2(Paper) or 3(Scissors)");
									userNumber = sc.nextInt();
									};
							rps.setUserNumber(userNumber);
							rps.playGame();
					}
					
			//End of game: get scores from the instantiable class RockPaperScissors
			userScore = rps.getUserScore();
			computerScore = rps.getComputerScore();
			
			//computing lives after the game
			if (userScore > computerScore) {
								userLives++;
							} else if (userScore < computerScore) {
								userLives--;
							}
							
			//Print end-of-game Score-board
			System.out.println("|=|=|=|=|=|=|=|=|=|=|=|");
			System.out.println("    GAME Results    ");
			System.out.println(" User Score: " + userScore);
			System.out.println(" Computer Score: " + computerScore);
			System.out.println(" Lives Left: " + userLives);
			System.out.println("|=|=|=|=|=|=|=|=|=|=|=|");
			
			//sequentially store scores in array per game
			stat.setUserScore(userScore);
			stat.setComputerScore(computerScore);
			stat.recordScores();
							
			//Reset Scores for the next game
			rps.resetScores();
			userScore = rps.getUserScore();
			computerScore = rps.getComputerScore();
		}
		if (userLives == 0) {System.out.println("--------------------------------");
		System.out.println(" :-( MATCH OVER! You lost. All lives gone.");
		System.out.println("--------------------------------------------");
		stat.displayScores();
			} else if (userLives == 7) {
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("  YOU WIN the match !! Congratulations!!");
			System.out.println("========================================");
			stat.displayScores();
			}
		
	}
}
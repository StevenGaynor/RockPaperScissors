/**
GameStats.java - A class for storing and displaying game scores - Instantiable Class
@author Steven Gaynor
studentID x14108038
@date created 28/11/2014
*/
public class GameStats {
	private int[][] scoreBoard = new int[50][50];
	private int userScore;
	private int computerScore;
		
		//Constructor - default constructor
		
			//Setters
			public void setUserScore(int userScore) {
				this.userScore = userScore;
			}
			public void setComputerScore(int computerScore) {
				this.computerScore = computerScore;
			}
			public void setScoreBoard(int[][]scoreBoard){
				this.scoreBoard = scoreBoard;
			}
			//Getters
			public int[][] getScoreBoard() {
				return this.scoreBoard;
			}
			public int getUserScore(){
				return this.userScore;
				}
			public int getComputerScore(){
				return this.computerScore;
			}
					
					//Methods
						//Method to sequentially populate array with Game scores(Score Board has 50 "slots")
							public void recordScores(){
								if( scoreBoard[0][0] == -1 && scoreBoard[1][0] == -1) {
									scoreBoard[0][0] = userScore;
									scoreBoard[1][0] = computerScore;
									}else if (scoreBoard[0][1] == -1 && scoreBoard[1][1] == -1) {
										scoreBoard[0][1] = userScore;
										scoreBoard[1][1] = computerScore;
										} else if (scoreBoard[0][2] == -1 && scoreBoard[1][2] == -1){
											scoreBoard[0][2] = userScore;
											scoreBoard[1][2] = computerScore;
											} else if (scoreBoard[0][3] == -1 && scoreBoard[1][3] == -1){
											scoreBoard[0][3] = userScore;
											scoreBoard[1][3] = computerScore;
											}else if (scoreBoard[0][4] == -1 && scoreBoard[1][4] == -1){
											scoreBoard[0][4] = userScore;
											scoreBoard[1][4] = computerScore;
											}else if (scoreBoard[0][5] == -1 && scoreBoard[1][5] == -1){
											scoreBoard[0][5] = userScore;
											scoreBoard[1][5] = computerScore;
											}else if (scoreBoard[0][6] == -1 && scoreBoard[1][6] == -1){
											scoreBoard[0][6] = userScore;
											scoreBoard[1][6] = computerScore;
											}else if (scoreBoard[0][7] == -1 && scoreBoard[1][7] == -1){
											scoreBoard[0][7] = userScore;
											scoreBoard[1][7] = computerScore;
											}else if (scoreBoard[0][8] == -1 && scoreBoard[1][8] == -1){
											scoreBoard[0][8] = userScore;
											scoreBoard[1][8] = computerScore;
											}else if (scoreBoard[0][9] == -1 && scoreBoard[1][9] == -1){
											scoreBoard[0][9] = userScore;
											scoreBoard[1][9] = computerScore;
											}else if (scoreBoard[0][10] == -1 && scoreBoard[1][10] == -1){
											scoreBoard[0][10] = userScore;
											scoreBoard[1][10] = computerScore;
											}else if (scoreBoard[0][11] == -1 && scoreBoard[1][11] == -1){
											scoreBoard[0][11] = userScore;
											scoreBoard[1][11] = computerScore;
											}else if (scoreBoard[0][12] == -1 && scoreBoard[1][12] == -1){
											scoreBoard[0][12] = userScore;
											scoreBoard[1][12] = computerScore;
											}else if (scoreBoard[0][13] == -1 && scoreBoard[1][13] == -1){
											scoreBoard[0][13] = userScore;
											scoreBoard[1][13] = computerScore;
											}else if (scoreBoard[0][14] == -1 && scoreBoard[1][14] == -1){
											scoreBoard[0][14] = userScore;
											scoreBoard[1][14] = computerScore;
											}else if (scoreBoard[0][15] == -1 && scoreBoard[1][15] == -1){
											scoreBoard[0][15] = userScore;
											scoreBoard[1][15] = computerScore;
											}else if (scoreBoard[0][16] == -1 && scoreBoard[1][16] == -1){
											scoreBoard[0][16] = userScore;
											scoreBoard[1][16] = computerScore;
											}else if (scoreBoard[0][17] == -1 && scoreBoard[1][17] == -1){
											scoreBoard[0][17] = userScore;
											scoreBoard[1][17] = computerScore;
											}else if (scoreBoard[0][18] == -1 && scoreBoard[1][18] == -1){
											scoreBoard[0][18] = userScore;
											scoreBoard[1][18] = computerScore;
											}else if (scoreBoard[0][19] == -1 && scoreBoard[1][19] == -1){
											scoreBoard[0][19] = userScore;
											scoreBoard[1][19] = computerScore;
											}else if (scoreBoard[0][20] == -1 && scoreBoard[1][20] == -1){
											scoreBoard[0][20] = userScore;
											scoreBoard[1][20] = computerScore;
											}else if (scoreBoard[0][21] == -1 && scoreBoard[1][21] == -1){
											scoreBoard[0][21] = userScore;
											scoreBoard[1][21] = computerScore;
											}else if (scoreBoard[0][22] == -1 && scoreBoard[1][22] == -1){
											scoreBoard[0][22] = userScore;
											scoreBoard[1][22] = computerScore;
											}else if (scoreBoard[0][23] == -1 && scoreBoard[1][23] == -1){
											scoreBoard[0][23] = userScore;
											scoreBoard[1][23] = computerScore;
											}else if (scoreBoard[0][24] == -1 && scoreBoard[1][24] == -1){
											scoreBoard[0][24] = userScore;
											scoreBoard[1][24] = computerScore;
											}else if (scoreBoard[0][25] == -1 && scoreBoard[1][25] == -1){
											scoreBoard[0][25] = userScore;
											scoreBoard[1][25] = computerScore;
											}else if (scoreBoard[0][26] == -1 && scoreBoard[1][26] == -1){
											scoreBoard[0][26] = userScore;
											scoreBoard[1][26] = computerScore;
											}else if (scoreBoard[0][27] == -1 && scoreBoard[1][27] == -1){
											scoreBoard[0][27] = userScore;
											scoreBoard[1][27] = computerScore;
											}else if (scoreBoard[0][28] == -1 && scoreBoard[1][28] == -1){
											scoreBoard[0][28] = userScore;
											scoreBoard[1][28] = computerScore;
											}else if (scoreBoard[0][29] == -1 && scoreBoard[1][29] == -1){
											scoreBoard[0][29] = userScore;
											scoreBoard[1][29] = computerScore;
											}else if (scoreBoard[0][30] == -1 && scoreBoard[1][30] == -1){
											scoreBoard[0][30] = userScore;
											scoreBoard[1][30] = computerScore;
											}else if (scoreBoard[0][31] == -1 && scoreBoard[1][31] == -1){
											scoreBoard[0][31] = userScore;
											scoreBoard[1][31] = computerScore;
											}else if (scoreBoard[0][32] == -1 && scoreBoard[1][32] == -1){
											scoreBoard[0][32] = userScore;
											scoreBoard[1][32] = computerScore;
											}else if (scoreBoard[0][33] == -1 && scoreBoard[1][33] == -1){
											scoreBoard[0][33] = userScore;
											scoreBoard[1][33] = computerScore;
											}else if (scoreBoard[0][34] == -1 && scoreBoard[1][34] == -1){
											scoreBoard[0][34] = userScore;
											scoreBoard[1][34] = computerScore;
											}else if (scoreBoard[0][35] == -1 && scoreBoard[1][35] == -1){
											scoreBoard[0][35] = userScore;
											scoreBoard[1][35] = computerScore;
											}else if (scoreBoard[0][36] == -1 && scoreBoard[1][36] == -1){
											scoreBoard[0][36] = userScore;
											scoreBoard[1][36] = computerScore;
											}else if (scoreBoard[0][37] == -1 && scoreBoard[1][37] == -1){
											scoreBoard[0][37] = userScore;
											scoreBoard[1][37] = computerScore;
											}else if (scoreBoard[0][38] == -1 && scoreBoard[1][38] == -1){
											scoreBoard[0][38] = userScore;
											scoreBoard[1][38] = computerScore;
											}else if (scoreBoard[0][39] == -1 && scoreBoard[1][39] == -1){
											scoreBoard[0][39] = userScore;
											scoreBoard[1][39] = computerScore;
											}else if (scoreBoard[0][40] == -1 && scoreBoard[1][40] == -1){
											scoreBoard[0][40] = userScore;
											scoreBoard[1][40] = computerScore;
											}else if (scoreBoard[0][41] == -1 && scoreBoard[1][41] == -1){
											scoreBoard[0][41] = userScore;
											scoreBoard[1][41] = computerScore;
											}else if (scoreBoard[0][42] == -1 && scoreBoard[1][42] == -1){
											scoreBoard[0][42] = userScore;
											scoreBoard[1][42] = computerScore;
											}else if (scoreBoard[0][43] == -1 && scoreBoard[1][43] == -1){
											scoreBoard[0][43] = userScore;
											scoreBoard[1][43] = computerScore;
											}else if (scoreBoard[0][44] == -1 && scoreBoard[1][44] == -1){
											scoreBoard[0][44] = userScore;
											scoreBoard[1][44] = computerScore;
											}else if (scoreBoard[0][45] == -1 && scoreBoard[1][45] == -1){
											scoreBoard[0][45] = userScore;
											scoreBoard[1][45] = computerScore;
											}else if (scoreBoard[0][46] == -1 && scoreBoard[1][46] == -1){
											scoreBoard[0][46] = userScore;
											scoreBoard[1][46] = computerScore;
											}else if (scoreBoard[0][47] == -1 && scoreBoard[1][47] == -1){
											scoreBoard[0][47] = userScore;
											scoreBoard[1][47] = computerScore;
											}else if (scoreBoard[0][48] == -1 && scoreBoard[1][48] == -1){
											scoreBoard[0][48] = userScore;
											scoreBoard[1][48] = computerScore;
											}else if (scoreBoard[0][49] == -1 && scoreBoard[1][49] == -1){
											scoreBoard[0][49] = userScore;
											scoreBoard[1][49] = computerScore;
											}
							}
							
							//Method to recall all scores at Match End
							public void displayScores(){
								System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
								System.out.println("	Match Results Summary         ");
								System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
								
								if (scoreBoard[0][0] >=0 && scoreBoard[1][0] >= 0){
									System.out.println("         | You    | Computer |");
									System.out.println("Game 1:  | " + scoreBoard[0][0] + "      |  " + scoreBoard[1][0] + "       |");
									}
								if (scoreBoard[0][1] >=0 && scoreBoard[1][1] >= 0){
									System.out.println("Game 2:  | " + scoreBoard[0][1] + "      |  " + scoreBoard[1][1] + "       |");
									}
								if (scoreBoard[0][2] >=0 && scoreBoard[1][2] >= 0){
									System.out.println("Game 3:  | " + scoreBoard[0][2] + "      |  " + scoreBoard[1][2] + "       |");
									}
								if (scoreBoard[0][3] >=0 && scoreBoard[1][3] >= 0){
									System.out.println("Game 4:  | " + scoreBoard[0][3] + "      |  " + scoreBoard[1][3] + "       |");
									}
								if (scoreBoard[0][4] >=0 && scoreBoard[1][4] >= 0){
									System.out.println("Game 5:  | " + scoreBoard[0][4] + "      |  " + scoreBoard[1][4] + "       |");
									}
								if (scoreBoard[0][5] >=0 && scoreBoard[1][5] >= 0){
									System.out.println("Game 6:  | " + scoreBoard[0][5] + "      |  " + scoreBoard[1][5] + "       |");
									}
								if (scoreBoard[0][6] >=0 && scoreBoard[1][6] >= 0){
									System.out.println("Game 7:  | " + scoreBoard[0][6] + "      |  " + scoreBoard[1][6] + "       |");
									}
								if (scoreBoard[0][7] >=0 && scoreBoard[1][7] >= 0){
									System.out.println("Game 8:  | " + scoreBoard[0][7] + "      |  " + scoreBoard[1][7] + "       |");
									}
								if (scoreBoard[0][8] >=0 && scoreBoard[1][8] >= 0){
									System.out.println("Game 9:  | " + scoreBoard[0][8] + "      |  " + scoreBoard[1][8] + "       |");
									}
								if (scoreBoard[0][9] >=0 && scoreBoard[1][9] >= 0){
									System.out.println("Game 10: | " + scoreBoard[0][9] + "      |  " + scoreBoard[1][9] + "       |");
									}
								if (scoreBoard[0][10] >=0 && scoreBoard[1][10] >= 0){
									System.out.println("Game 11: | " + scoreBoard[0][10] + "      |  " + scoreBoard[1][10] + "       |");
									}
								if (scoreBoard[0][11] >=0 && scoreBoard[1][11] >= 0){
									System.out.println("Game 12: | " + scoreBoard[0][11] + "      |  " + scoreBoard[1][11] + "       |");
									}
								if (scoreBoard[0][12] >=0 && scoreBoard[1][12] >= 0){
									System.out.println("Game 13: | " + scoreBoard[0][12] + "      |  " + scoreBoard[1][12] + "       |");
									}
								if (scoreBoard[0][13] >=0 && scoreBoard[1][13] >= 0){
									System.out.println("Game 14: | " + scoreBoard[0][13] + "      |  " + scoreBoard[1][13] + "       |");
									}
								if (scoreBoard[0][14] >=0 && scoreBoard[1][14] >= 0){
									System.out.println("Game 15: | " + scoreBoard[0][14] + "      |  " + scoreBoard[1][14] + "       |");
									}
								if (scoreBoard[0][15] >=0 && scoreBoard[1][15] >= 0){
									System.out.println("Game 16: | " + scoreBoard[0][15] + "      |  " + scoreBoard[1][15] + "       |");
									}
								if (scoreBoard[0][16] >=0 && scoreBoard[1][16] >= 0){
									System.out.println("Game 17: | " + scoreBoard[0][16] + "      |  " + scoreBoard[1][16] + "       |");
									}
								if (scoreBoard[0][17] >=0 && scoreBoard[1][17] >= 0){
									System.out.println("Game 18: | " + scoreBoard[0][17] + "      |  " + scoreBoard[1][17] + "       |");
									}
								if (scoreBoard[0][18] >=0 && scoreBoard[1][18] >= 0){
									System.out.println("Game 19: | " + scoreBoard[0][18] + "      |  " + scoreBoard[1][18] + "       |");
									}
								if (scoreBoard[0][19] >=0 && scoreBoard[1][19] >= 0){
									System.out.println("Game 20: | " + scoreBoard[0][19] + "      |  " + scoreBoard[1][19] + "       |");
									}
								if (scoreBoard[0][20] >=0 && scoreBoard[1][20] >= 0){
									System.out.println("Game 21: | " + scoreBoard[0][20] + "      |  " + scoreBoard[1][20] + "       |");
									}
								if (scoreBoard[0][21] >=0 && scoreBoard[1][21] >= 0){
									System.out.println("Game 22: | " + scoreBoard[0][21] + "      |  " + scoreBoard[1][21] + "       |");
									}
								if (scoreBoard[0][22] >=0 && scoreBoard[1][22] >= 0){
									System.out.println("Game 23: | " + scoreBoard[0][22] + "      |  " + scoreBoard[1][22] + "       |");
									}
								if (scoreBoard[0][23] >=0 && scoreBoard[1][23] >= 0){
									System.out.println("Game 24: | " + scoreBoard[0][23] + "      |  " + scoreBoard[1][23] + "       |");
									}
								if (scoreBoard[0][24] >=0 && scoreBoard[1][24] >= 0){
									System.out.println("Game 25: | " + scoreBoard[0][24] + "      |  " + scoreBoard[1][24] + "       |");
									}
								if (scoreBoard[0][25] >=0 && scoreBoard[1][25] >= 0){
									System.out.println("Game 26: | " + scoreBoard[0][25] + "      |  " + scoreBoard[1][25] + "       |");
									}
								if (scoreBoard[0][26] >=0 && scoreBoard[1][26] >= 0){
									System.out.println("Game 27: | " + scoreBoard[0][26] + "      |  " + scoreBoard[1][26] + "       |");
									}
								if (scoreBoard[0][27] >=0 && scoreBoard[1][27] >= 0){
									System.out.println("Game 28: | " + scoreBoard[0][27] + "      |  " + scoreBoard[1][27] + "       |");
									}
								if (scoreBoard[0][28] >=0 && scoreBoard[1][28] >= 0){
									System.out.println("Game 29: | " + scoreBoard[0][28] + "      |  " + scoreBoard[1][28] + "       |");
									}
								if (scoreBoard[0][29] >=0 && scoreBoard[1][29] >= 0){
									System.out.println("Game 30: | " + scoreBoard[0][29] + "      |  " + scoreBoard[1][29] + "       |");
									}
								if (scoreBoard[0][30] >=0 && scoreBoard[1][30] >= 0){
									System.out.println("Game 31: | " + scoreBoard[0][30] + "      |  " + scoreBoard[1][30] + "       |");
									}
								if (scoreBoard[0][31] >=0 && scoreBoard[1][31] >= 0){
									System.out.println("Game 32: | " + scoreBoard[0][31] + "      |  " + scoreBoard[1][31] + "       |");
									}
								if (scoreBoard[0][32] >=0 && scoreBoard[1][32] >= 0){
									System.out.println("Game 33: | " + scoreBoard[0][32] + "      |  " + scoreBoard[1][32] + "       |");
									}
								if (scoreBoard[0][33] >=0 && scoreBoard[1][33] >= 0){
									System.out.println("Game 34: | " + scoreBoard[0][33] + "      |  " + scoreBoard[1][33] + "       |");
									}
								if (scoreBoard[0][34] >=0 && scoreBoard[1][34] >= 0){
									System.out.println("Game 35: | " + scoreBoard[0][34] + "      |  " + scoreBoard[1][34] + "       |");
									}
								if (scoreBoard[0][35] >=0 && scoreBoard[1][35] >= 0){
									System.out.println("Game 36: | " + scoreBoard[0][35] + "      |  " + scoreBoard[1][35] + "       |");
									}
								if (scoreBoard[0][36] >=0 && scoreBoard[1][36] >= 0){
									System.out.println("Game 37: | " + scoreBoard[0][36] + "      |  " + scoreBoard[1][36] + "       |");
									}
								if (scoreBoard[0][37] >=0 && scoreBoard[1][37] >= 0){
									System.out.println("Game 38: | " + scoreBoard[0][37] + "      |  " + scoreBoard[1][37] + "       |");
									}
								if (scoreBoard[0][38] >=0 && scoreBoard[1][38] >= 0){
									System.out.println("Game 39: | " + scoreBoard[0][38] + "      |  " + scoreBoard[1][38] + "       |");
									}
								if (scoreBoard[0][39] >=0 && scoreBoard[1][39] >= 0){
									System.out.println("Game 40: | " + scoreBoard[0][39] + "      |  " + scoreBoard[1][39] + "       |");
									}
								if (scoreBoard[0][40] >=0 && scoreBoard[1][40] >= 0){
									System.out.println("Game 41: | " + scoreBoard[0][40] + "      |  " + scoreBoard[1][40] + "       |");
									}
								if (scoreBoard[0][41] >=0 && scoreBoard[1][41] >= 0){
									System.out.println("Game 42: | " + scoreBoard[0][41] + "      |  " + scoreBoard[1][41] + "       |");
									}
								if (scoreBoard[0][42] >=0 && scoreBoard[1][42] >= 0){
									System.out.println("Game 43: | " + scoreBoard[0][42] + "      |  " + scoreBoard[1][42] + "       |");
									}
								if (scoreBoard[0][43] >=0 && scoreBoard[1][43] >= 0){
									System.out.println("Game 44: | " + scoreBoard[0][43] + "      |  " + scoreBoard[1][43] + "       |");
									}
								if (scoreBoard[0][44] >=0 && scoreBoard[1][44] >= 0){
									System.out.println("Game 45: | " + scoreBoard[0][44] + "      |  " + scoreBoard[1][44] + "       |");
									}
								if (scoreBoard[0][45] >=0 && scoreBoard[1][45] >= 0){
									System.out.println("Game 46: | " + scoreBoard[0][45] + "      |  " + scoreBoard[1][45] + "       |");
									}
								if (scoreBoard[0][46] >=0 && scoreBoard[1][46] >= 0){
									System.out.println("Game 47: | " + scoreBoard[0][46] + "      |  " + scoreBoard[1][46] + "       |");
									}
								if (scoreBoard[0][47] >=0 && scoreBoard[1][47] >= 0){
									System.out.println("Game 48: | " + scoreBoard[0][47] + "      |  " + scoreBoard[1][47] + "       |");
									}
								if (scoreBoard[0][48] >=0 && scoreBoard[1][48] >= 0){
									System.out.println("Game 49: | " + scoreBoard[0][48] + "      |  " + scoreBoard[1][48] + "       |");
									}
								if (scoreBoard[0][49] >=0 && scoreBoard[1][49] >= 0){
									System.out.println("Game 50: | " + scoreBoard[0][49] + "      |  " + scoreBoard[1][49] + "       |");
									}
								
		
		
							}
}
package algorithms;

import org.gamelink.game.*;

import java.util.Scanner;

public class TempTeam {
	private static String teamName = "TempTeam";
	
	public static String getTeamName() {
		return teamName;
	}
	
	public static void main(String[] args) {
		Cram game = new Cram(false);
		game.startGame(TempTeam.class);
	}
	
	public static String algorithm(Cram game) {
		String move;
		int[][] gameBoard = game.getBoard();
		System.out.println(gameBoard[0][0]);
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your Move: ");
			move = in.next();
			int input = 0;
			try {
				input = Integer.parseInt(move);
				System.out.println("Invalid input!");
				break;
			} catch (NumberFormatException ne)
			{
				System.out.println("Input is not a number");
			}
			
		}
		return move;		
	}
}

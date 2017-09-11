package spaace;

import java.util.Scanner;
import java.util.Random;

public class rockPaperScisors {

	  public static void main(String[] args) {
		// TODO Auto-generated method stub

		  while(true) {
		  
		Scanner input = new Scanner(System. in);
		Random rand = new Random();
		System.out.println("lets play rock paper scisors, choose rock paper or scisors");
		String choice = input.next();

		int Aichoice = rand.nextInt(3);
		    
		if (Aichoice == 0){

			if (choice.equals("rock")){
				System.out.println("rock, i guess it is a draw, good game, lets play again");
			}
			if (choice .equals ("paper")){
				System.out.println("rock, you won, good game, lets play again");
			}
			if (choice .equals ("scisors")){
				System.out.println("rock, I won, good game, lets play again");

			}
		
		}
		    
		if (Aichoice == 1){

			if (choice.equals("rock")){
				System.out.println("paper, i won, good game, lets play again");
			}
			if (choice .equals ("paper")){
				System.out.println("paper, its a tie, good game, lets play again");
			}
			if (choice .equals ("scisors")){
				System.out.println("paper, you won, good game, lets play again");
			}
		}
		
		    
		if (Aichoice == 2){

			if (choice.equals("rock")){
				System.out.println("scisors, you won, good game, lets play again");
			}
			if (choice.equals ("paper")){
				System.out.println("scisors, i won, good game, lets play again");
			}
			if (choice .equals ("scisors")){
				System.out.println("scisors, it is a tie, good game, lets play again");
			}
		}
		
	}
	  }
}
	  


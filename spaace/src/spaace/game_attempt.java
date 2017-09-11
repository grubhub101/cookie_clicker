package spaace;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class game_attempt {
	public static void wait(int seconds){
		try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(seconds * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
	}
	

	
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		String direction = null;
		String shop = null;
		String shoice = null;
		float water = 5;
		float food = 5;
		int gold = 10;
		int i = 0;
		int hp = 100;
	while(i == 1)
	 {
		i = 0;	
		
		System.out.println("entering caves");
		wait(1);
		System.out.println("tip: you use 0.1 food and 0.2 water"
				+ " each time time you move in the caves");
		wait(1);
		System.out.println("you have " + food + " food, and " + water + " water, "
				+ hp + " hp");
	
		
		
		System.out.println("say press enter to explore the caves say exit "
				+ "to exit the caves");
		
direction = scanner.nextLine();
if( direction  =="exit") {
	
	System.out.println("exiting caves");
	wait(1);
	
	System.out.println("you see a shop do you want to go in?");
	shop = scanner.nextLine();
	
	if( shop  =="yes") {
		System.out.println("they are selling 1 food for 5 gold and 1 water 3 gold");
		wait(1);
		System.out.println("do you want to buy anything, you have " + gold + "gold"
				+ ", "+ food +" food , and" + water +"water.");
		wait(1);
		while (shoice != "caves"){
		System.out.println("say food to buy food water to buy water and caves to return to caves");
	
		if( shoice  =="food") {
		food ++;
		gold =- 5;
		}
		
		if( shoice  =="water") {
			water ++;
			gold =- 3;
			}
		

	}
	
}
}


		
		Random choice = new Random();
		int randomNum = choice.nextInt(50) +1;
		
		if( randomNum == 1) {
			System.out.println("you see a small wood chest");
			wait(1);
			System.out.println("say open to open the chest");
			
			
		}
		
		
		
	
	
			
			
		
			
		
			
				
			
		
		i = 1;
	}
	}
}


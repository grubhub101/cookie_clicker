package spaace;


import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;



public class arrayShuffle2 extends StoryStats {
	

	private static StoryStats stats = new StoryStats(); 
	
	public static void wait(int seconds){
		try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(seconds * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
	}
	
	public static void isDead() {
		
		if (stats.food <= 0 || stats.water <= 0 || stats.hp <= 0 )
		{
			System.out.println("You died");
			//terminate program//
		}
			
	}

public static void shop (Scanner scanner){
		System.out.println("exiting caves");
		wait(1);

		System.out.println("you see a shop do you want to go in?");
		stats.shop = scanner.nextLine();

		if( stats.shop.equals("yes")) {
			System.out.println("they are selling 1 food for 5 gold and 1 water 3 gold");
			wait(1);
			System.out.println("do you want to buy anything, you have " + stats.gold + "gold"
			+ ", "+ stats.food +" food , and" + stats.water +"water.");
			wait(1);
			while(true) {
				if (stats.gold < 10)
				{
					System.out.println("You are out of money");
					break;
				}
					System.out.println("say food to buy food water to buy water and caves to return to caves");
					stats.shoice = scanner.nextLine();
					if( stats.shoice.equals("food")) {
						stats.food += 2;
						stats.gold =- 10;
					}
	
					if( stats.shoice.equals("")) {
						stats.water += 4;
						stats.gold =- 10;
						}
					
					if( stats.shoice.equals("")) {
						stats.potion += 1;
						stats.gold =- 10;
						}
	
				if (stats.shoice.equals("exit"))
				{
					break;
				}
			}
		}
		else
		{
			return;
		}
}

public static void Start(Scanner scanner)
{
	System.out.println("entering caves");
	wait(1);
	System.out.println("tip: you use 0.1 food and 0.2 water"
			+ " each time time you move in the caves");
	wait(1);
	System.out.println("you have " + stats.food + " food, and " + stats.water + " water");

	stats.direction = "";
	 while (true)
	 {
		 
		System.out.println("say left right or forward say exit "
				+ "to go left, right, forward, or exit the caves");
		stats.direction = "";
		 while (true)
		 {
		stats.direction = scanner.nextLine();
		
		if( stats.direction.equals("exit")) {
	
			shop(scanner);
			continue;
		}
		else if (stats.direction.equals("left") || (stats.direction.equals("right") || (stats.direction.equals("forward")))) ;
		{
			stats.water -= 0.2;
			stats.food -= 0.1;
			wait(1);
			isDead();
			
			Random choice = new Random();
			int randomNum = choice.nextInt(12) +1;
			
				if( randomNum == 1) {
					System.out.println("you see a small wood chest");
					wait(1);
					System.out.println("you open the chest and get 5 gold");
				}
				if( randomNum == 2) {
					System.out.println("you see a regular wood chest");
					wait(1);
					System.out.println("you open the chest and get 10 gold");
				}
				if( randomNum == 3) {
					System.out.println("you see a large wood chest");
					wait(1);
					System.out.println("you open the chest and get 15 gold");
				}
				if( randomNum == 4) {
					System.out.println("you see a small copper chest");
					wait(1);
					System.out.println("you open the chest and get 15 gold");
				}
				if( randomNum == 5) {
					System.out.println("you see a regular copper chest");
					wait(1);
					System.out.println("you open the chest and get 20 gold");
				}
					if( randomNum == 6) {
					System.out.println("you see a large copper chest");
					wait(1);
					System.out.println("you open the chest and get 24 gold");
				
				if( randomNum == 7) {
					System.out.println("you see a small iron chest");
					wait(1);
					System.out.println("you open the chest and get 15 gold");
				}
				if( randomNum == 8) {
					System.out.println("you see a regular iron chest");
					wait(1);
					System.out.println("you open the chest and get 20 gold");
				}
				if( randomNum == 9) {
					System.out.println("you see a large iron chest");
					wait(1);
					System.out.println("you open the chest and get 24 gold");
				}
				if( randomNum == 10) {
					System.out.println("you see a small gold chest");
					wait(1);
					System.out.println("you open the chest and get 25 gold");
				}
				if( randomNum == 11) {
					System.out.println("you see a regular gold chest");
					wait(1);
					System.out.println("you open the chest and get 30 gold");
				}
				if( randomNum == 12) {
					System.out.println("you see a large gold chest");
					wait(1);
				System.out.println("you open the chest and get 36 gold");
			}
			break;
		}
	 }
	 }
	 }
	
	

}
	
	public static void main(String[] args)
	{
		//stats = new StoryStats();
		
		Scanner scanner = new Scanner(System.in);
		/*
		* String direction = null;
		* String shop = null;
		* String shoice = null;
		* float water = 5;
		* float food = 5;
		* int gold = 5;
		* int i = 0;
		* int j = 0;
		*/
		
		Start(scanner);
	}
}
	



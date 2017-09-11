package spaace;



import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;



public class arrayShuffle3 extends StoryStats {
	
	public static arrayShuffle3 game = new arrayShuffle3();

	
	private static StoryStats stats = new StoryStats(); 
	
	public static void wait(int seconds){
		try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(seconds * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
	}
	
	static int cookies = 0;
	static int value1 = 3;
	static int value2 = 100;
	static int value3 = 1000;
	static String purchase = "a";
	
	
		
		public static void Start1(Scanner scanner)
		{
			int cpc = 1;
			wait(1);
			while (stats.aah == 1){ 
				System.out.println("you have " + cookies + " cookies and a cps of" + cpc);
				System.out.println("say any number or p1ress enter to gain cookies or say 2 to go to the shop");
				stats.aah = scanner.nextInt();
				if (stats.aah == 1){
					cookies += cpc;	
					//System.out.println("You chose: " + stats.aah);
				}
				if (stats.aah == 2) {
					shop(scanner);
				}
			}
		}
	
	
		
	public static void shop (Scanner scanner){
		System.out.println("exiting kitchen");
		wait(1);

		System.out.println("you enter a shop");
		
		
		while(true) {
			System.out.println("do you want to buy anything, you have " + cookies + "cookies and a cpc of " + cpc);
			wait(1);
			
			
			System.out.println("say the name of what you want to buy it");
			wait(1);
			System.out.println("there is a "
					+ "auto clicker for " + value1 + " cookies adding 0.1 cps" );
			System.out.println("there is a "
					+ "grandma for " + value2 + " cookies adding 0.3 cps" );
			System.out.println("there is a "
					+ "c-robot for " + value3 + " cookies adding 1 cps" );
					
			wait(2);
			stats.shoice = scanner.nextLine();
			
			if( stats.shoice.equals("auto clicker")) {
				stats.food += 2;
				stats.gold -= value1;
				stats.value1 += value1/4;
				stats.cpc +=0.1;
				System.out.println("you bought a auto clicker" + "you have a cpc of " + cpc);
				
			}
	
			if( stats.shoice.equals("grandma")) {
				stats.water += 4;
				stats.gold -= 10;
				stats.cpc +=0.1;
				System.out.println("you bought a grandma you have a cpc of " + cpc);
				
			}
					
			if( stats.shoice.equals("c-robot")) {
				stats.potion += 1;
				stats.gold -= 10;
				stats.cpc +=0.1;
				System.out.println("you bought a c-robot you have a cpc of " + cpc);
			
			}
	                    
			if (stats.shoice.equals("exit"))
				System.out.println("entering kitchen");
			wait(1);
			
			game.Start1(scanner);
			
		}
		
		}	
	

	
				
						
						
						
						
						
						
					
					
				
		
			
	 
	
	public static void main(String[] args)
	{

		
		Scanner scanner = new Scanner(System.in);
		
		
		game.Start1(scanner);
	}

	private void Start(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
}
	



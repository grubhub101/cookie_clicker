package spaace;


import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;



public class arrayShuffle extends StoryStats {
	
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
			
			wait(999999999);
			
		}
	}
	
	public static void stats() {
		wait(1);
		System.out.println("you have " + stats.food + " food, " + stats.water + " water, and " + stats.potion + " health potion, you have " + stats.gold + " gold ");
		wait(1);
		System.out.println("tip you have a sheild and sword");
		wait(1);
	}
	
	public static void shop (Scanner scanner){
		System.out.println("exiting caves");
		wait(1);

		System.out.println("you enter a shop");
		
		
		while(true) {
			System.out.println("do you want to buy anything, you have " + stats.gold + "gold"
					+ ", "+ stats.food +" food , and" + stats.water +"water.");
			wait(1);
			if (stats.gold < 10)
			{
				System.out.println("You are out of money");
				break;
			}
			System.out.println("say food to buy food water to buy water and caves to return to caves");
			stats.shoice = scanner.nextLine();
			
			if( stats.shoice.equals("food")) {
				stats.food += 2;
				stats.gold -= 10;
				System.out.println("you bought food");
				stats();
			}
	
			if( stats.shoice.equals("water")) {
				stats.water += 4;
				stats.gold -= 10;
				System.out.println("you bought water");
				stats();
			}
					
			if( stats.shoice.equals("potion")) {
				stats.potion += 1;
				stats.gold -= 10;
				System.out.println("you bought a potion");
				stats();
			}
	                    
			if (stats.shoice.equals("exit"))
				System.out.println("entering caves");
			wait(1);
			System.out.println("tip: you use 0.1 food and 0.2 water"
					+ " each time time you move in the caves");
			wait(1);
			System.out.println("say cont to go continue and exit to exit");
				break;
			
			
		}	
	}

	public void Start(Scanner scanner)
	{
		
		System.out.println("tip: you use 0.5 food and 1 water"
				+ " each time time you move in the caves");
		wait(1);
		stats();
	
		stats.direction = "";
		while (true) {
			 
			System.out.println("say cont to go continue and exit to exit");
			stats.direction = "";
			while (true) {
				stats.direction = scanner.nextLine();
				
				if( stats.direction.equals("exit")) {
					shop(scanner);
					continue;
				}
				else if ((stats.direction.equals("cont")))
				{
					stats.water -= 1;
					stats.food -= 0.5;
					wait(1);
					isDead();
					
					Random choice = new Random();
					int randomNum = choice.nextInt(20) +1;
				
					if( randomNum == 1) {
						System.out.println("you see a small wood chest");
						wait(1);
						System.out.println("you open the chest and get 5 gold");
						stats.gold += 5;
						stats();
					}
					if( randomNum == 2) {
						System.out.println("you see a regular wood chest");
						wait(1);
						System.out.println("you open the chest and get 10 gold");
						stats.gold += 10;
						stats();
					}
					if( randomNum == 3) {
						System.out.println("you see a large wood chest");
						wait(1);
						System.out.println("you open the chest and get 15 gold");
						stats.gold += 15;
						stats();
					}
					if( randomNum == 4) {
						System.out.println("you see a small copper chest");
						wait(1);
						System.out.println("you open the chest and get 15 gold");
						stats.gold += 15;
						stats();
					}
					if( randomNum == 5) {
						System.out.println("you see a regular copper chest");
						wait(1);
						System.out.println("you open the chest and get 20 gold");
						stats.gold += 20;
						stats();
					}
					if( randomNum == 6) {
						System.out.println("you see a large copper chest");
						wait(1);
						System.out.println("you open the chest and get 24 gold");
						stats.gold += 24;
						stats();
					}
					if( randomNum == 7) {
						System.out.println("you see a small iron chest");
						wait(1);
						System.out.println("you open the chest and get 15 gold");
						stats.gold += 15;
						stats();
					}
					if( randomNum == 8) {
						System.out.println("you see a regular iron chest");
						wait(1);
						System.out.println("you open the chest and get 20 gold");
						stats.gold += 20;
						stats();
					}
					if( randomNum == 9) {
						System.out.println("you see a large iron chest");
						wait(1);
						System.out.println("you open the chest and get 24 gold");
						stats.gold += 24;
						stats();
					}
					if( randomNum == 10) {
						System.out.println("you see a small gold chest");
						wait(1);
						System.out.println("you open the chest and get 25 gold");
						stats.gold += 25;
						stats();
					}
					if( randomNum == 11) {
						System.out.println("you see a regular gold chest");
						wait(1);
						System.out.println("you open the chest and get 30 gold");
						stats.gold += 30;
						stats();
					}
					if( randomNum == 12) {
						System.out.println("you see a large gold chest");
						wait(1);
						System.out.println("you open the chest and get 36 gold");
						stats.gold += 36;
						stats();
					}
						if( randomNum == 13) {
						System.out.println("you reach a dead end");
						wait(1);
						System.out.println("you turn around");
						stats();
				    }
					if( randomNum == 14) {
						System.out.println("you reach a ravine");
						wait(1);
						System.out.println("you turn around");
						stats();
				    }
					if( randomNum == 15) {
						System.out.println("you reach a ravine and slip in");
						wait(1);
						System.out.println("you died");
						wait(999999999);
						
				    }
					if( randomNum == 17) {
						System.out.println("you reach a ravine");
						wait(1);
						System.out.println("you slip and almost fall in, you drop 5 food and 4 water");
						stats.food -= 5;
						stats.water -= 4;
						stats();
					}
					if( randomNum == 18) {
						System.out.println("encounter a goblin with 20 hp and no weapons");
						wait(1);
						stats();
						wait(1);
						while(goblinHp >= 0);{
						System.out.println("attack or defend");
						stats.gFight = scanner.nextLine();
						
						int gFightRan = choice.nextInt(12) +1;
						
						if( gFightRan == 0) {
							if( gFight.equals("attack")) {
								stats.goblinHp -= 20;
						System.out.println("you did 20 damage and kill the goblin");
						}
							if( gFightRan == 0) {
								if( gFight.equals("defend")) {
									stats.goblinHp -= 2;
							System.out.println("you sucesfully blocked, punching your sheild dealt 2 damage to the goblin");
							
						}
						}
						}
						if( gFightRan == 1) {
							
							if( gFight.equals("attack")) {
								stats.goblinHp -= 15;
						stats.hp -= 5;
						System.out.println("you did 15 damage and weaken the goblin to 5 hp, the goblin attacks you loose 5 hp");
						
						}
							if( gFightRan == 2) {
								if( gFight.equals("defend")) {
									stats.goblinHp -= 2;
							System.out.println("you sucesfully blocked, punching your sheild dealt 5 damage to the goblin");
						}
							}
						}
						if( gFightRan == 3) {
							if( gFight.equals("attack")) {
								stats.goblinHp -= 20;
						System.out.println("you did 20 damage and kill the goblin");
						}
							if( gFightRan == 0) {
								if( gFight.equals("defend")) {
									stats.goblinHp -= 2;
							System.out.println("you sucesfully blocked, punching your sheild dealt 2 damage to the goblin");
								}
							}
						}
						if( gFightRan == 4) {
							if( gFight.equals("attack")) {
								stats.goblinHp -= 20;
						System.out.println("you did 20 damage and kill the goblin");
						}
							if( gFightRan == 0) {
								if( gFight.equals("defend")) {
									stats.goblinHp -= 2;
							System.out.println("you sucesfully blocked, punching your sheild dealt 2 damage to the goblin");
								}
							}
						
							stats();
							if( randomNum == 19) {
								System.out.println("you see a small wood chest");
								wait(1);
								System.out.println("you open the chest and get 5 gold");
								stats.gold += 5;
								stats();
								
								if( randomNum == 20) {
									System.out.println("you see a small wood chest");
									wait(1);
									System.out.println("you open the chest and get 5 gold");
									stats.gold += 5;
									stats();}
								
						
						if( gFightRan <= 100) {
							stats();
						
						stats.gFP = scanner.nextLine();
						
						if( gFP.equals("yes")) {
						hp += 5;
						
						}
					
						stats.hp += 10;
						
						if( hp >= 100) {
							stats.hp = 100;
						}
						}
						
					break;
					
				}
			}
		}
			}
		}
			}
		}
			
	 }
	
	public static void main(String[] args)
	{
		arrayShuffle game = new arrayShuffle();
		game.stats = new StoryStats();
		
		Scanner scanner = new Scanner(System.in);
		
		
		game.Start(scanner);
	}
}
	



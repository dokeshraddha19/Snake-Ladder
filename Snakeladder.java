package play;

import java.util.Random;

public class Snakeladder {
	static final int startPosition=0;	
	static final int Endposition=100;
	public static  void main(String[] args) 
	{
		rollDice();
		option();
		play();
	}
	
	

	//method for rolling a dice
	public static int rollDice()
	{
		Random r=new Random();
		int diceRoll=r.nextInt(6)+1;
		System.out.println("Number that player got on dice: "+diceRoll);
		return diceRoll;
	}
	
	
	public static int option()
	{
		Random r=new Random();
		int option=r.nextInt(3);
		return option ;		
	}
	
	
	public static void play()
	{
		int playerPosition=startPosition;
		int diceCount=0;
		while(playerPosition<=Endposition)
		{
			System.out.println(" ");
			int die=rollDice();
			diceCount++;
			int op=option();
			if(op==0)
			{
				System.out.println("Player has no play");
				System.out.println("Position: " +playerPosition);			
			}
			else if (op==1)
			{
				System.out.println("Player got Ladder");
				playerPosition+=die;
				if(playerPosition>100)
					playerPosition-=die;
				System.out.println("position: "+playerPosition);
			}
			else
			{
				System.out.println("player got Snake");
				playerPosition-=die;
				
				if(playerPosition<0)
					playerPosition=0;
				System.out.println("position: "+playerPosition);
			}
		}

		System.out.println(" ");
		System.out.println("Number of times dice rolled: "+diceCount);		
	}
	
}
				
	
	
		
	
	

	 

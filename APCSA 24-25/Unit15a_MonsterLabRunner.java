//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Unit15a_MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Unit15a_Monsters herd = new Unit15a_Monsters(size);

		for(int i=0; i<size;i++)
		{
			//read in monster values 
	
			//ask for ht
			
			//ask for wt
			
			//ask for age
	
			//instantiate a new Monster() and add it to the herd			
			
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		//print out the other stats
			
	}		
}
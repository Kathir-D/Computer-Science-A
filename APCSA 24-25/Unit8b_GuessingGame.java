//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;

public class Unit8b_GuessingGame
{
	private int upperBound;

	public Unit8b_GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner sc = new Scanner(System.in);
		int amt, random, choice;
		boolean got = false;
		int times = 0;

		System.out.print("Guessing Game - how many numbers? ");
		amt = sc.nextInt();
		random = (int) (Math.random() * (amt - 1 + 1)) + 1;
		while (got == false){
			System.out.print("Enter a number between 1 and " + amt + ": ");
			choice = sc.nextInt();
			times++;
			if (choice == random){
				got = true;
			}
		}
		System.out.println("It took " + times + " guesses to guess " + random);
		int percentError = ((times - 1) * 100) / times;
		System.out.println("You guessed wrong " + percentError + " percent of the time.");

	}

	public String toString()
	{
		String output="";
		playGame();
		return output;
	}
}

/*
Lab Description : Create a guessing game that allows you to enter the number of numbers in the
guessing game. The game will randomly( Math.random()) pick a number in the range provided and then
allow you to guess the number. The game will keep track of the number of guesses and tell you what
percentage of the time you guessed incorrectly.
Sample Data :
shown below
Sample Output :
Guessing Game - how many numbers? 5
Enter a number between 1 and 5 1
Enter a number between 1 and 5 2
Enter a number between 1 and 5 3
It took 3 guesses to guess 3.
You guessed wrong 40 percent of the time.
Do you want to play again? y
Guessing Game - how many numbers? 5
Enter a number between 1 and 5 -3
Number out of range!
Enter a number between 1 and 5 9
Number out of range!
Enter a number between 1 and 5 1
Enter a number between 1 and 5 2
Enter a number between 1 and 5 3
Enter a number between 1 and 5 4
It took 4 guesses to guess 4 .
You guessed wrong 60 percent of the time.
Do you want to play again? y
Guessing Game - how many numbers? 20
Enter a number between 1 and 20 1
Enter a number between 1 and 20 2
Enter a number between 1 and 20 3
Enter a number between 1 and 20 4
Enter a number between 1 and 20 5
Enter a number between 1 and 20 6
Enter a number between 1 and 20 7
Enter a number between 1 and 20 8
It took 8 guesses to guess 8 .
You guessed wrong 35 percent of the time.
Files Needed ::
GuessingGame.java
GuessRunner.java
A+ Computer Science GUESSING
GAME
© A+ Computer Science – Boolean Logic - www.apluscompsci.com
Do you want to play again? n
 */
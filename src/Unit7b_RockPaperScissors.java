//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

public class Unit7b_RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public Unit7b_RockPaperScissors(String player)
	{
	 playChoice = player;
	}

	public String determineWinner()
	{

		String winner="";
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}

/*
Lab Goal : The lab was designed to teach you how to use &&, ||, and !.
Lab Description : Generate a random choice for the computer player. Next, the person player will
make a choice. Finally, you take the two choices and see which one of the players is the winner. You will
need to use Math.random().
Sample Data :
random – see below
Sample Output :
Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had P
!Computer wins <<Paper Covers Rock>>!
Do you want to play again? y
Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had P
!Computer wins <<Paper Covers Rock>>!
Do you want to play again? y
Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had S
!Player wins <<Rock Breaks Scissors>>!
Do you want to play again? y
Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had R
!Draw Game!
Do you want to play again? y
Rock-Paper-Scissors - pick your weapon[R,P,S]:: R
player had R
computer had S
!Player wins <<Rock Breaks Scissors>>!
Do you want to play again? y
Rock-Paper-Scissors - pick your weapon[R,P,S]:: P
player had P
computer had S
!Computer wins <<Scissors Cuts Paper>>!
Do you want to play again? n
 */
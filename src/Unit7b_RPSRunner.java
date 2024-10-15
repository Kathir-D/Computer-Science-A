//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.*;
import static java.lang.System.*;

public class Unit7b_RPSRunner
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Unit7b_RockPaperScissors game = new Unit7b_RockPaperScissors();


//		while (true)

		String player = "";
		int nums = Math.random(0,2);
		switch (nums){
			case 0:
				player = "R";
				break;
			case 1:
				player = "P"
				break;
			case 2:

		}


		out.print("type in your prompt [R,P,S] :: ");
		char response = (char) sc.nextShort();

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
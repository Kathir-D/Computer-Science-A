//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.*;

public class Unit7b_RPSRunner {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String player = "";
    String playAgain = "y";

    while (playAgain.equals("y")) {
      out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
      player = sc.next().toUpperCase();

      Unit7b_RockPaperScissors game = new Unit7b_RockPaperScissors(player);
      game.setCompChoice();

      out.println(game);
      out.println(game.determineWinner());

      out.print("Do you want to play again? [y/n]:: ");
      playAgain = sc.next().toLowerCase();
    }
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

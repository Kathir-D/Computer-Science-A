//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import java.util.HashMap;

public class Unit7b_RockPaperScissors {

  private String playChoice;
  private String compChoice;
  private static HashMap<String, String> hm = new HashMap<>();

  static {
    hm.put("R", "Rock");
    hm.put("P", "Paper");
    hm.put("S", "Scissors");
  }

  public Unit7b_RockPaperScissors(String player) {
    playChoice = player;
  }

  public String determineWinner() {
    if (playChoice.equals(compChoice)) {
      return "!Draw Game!";
    } else if (
      (playChoice.equals("R") && compChoice.equals("S")) ||
      (playChoice.equals("P") && compChoice.equals("R")) ||
      (playChoice.equals("S") && compChoice.equals("P"))
    ) {
      return (
        "!Player wins <<" +
        hm.get(playChoice) +
        " beats " +
        hm.get(compChoice) +
        ">>!"
      );
    } else {
      return (
        "!Computer wins <<" +
        hm.get(compChoice) +
        " beats " +
        hm.get(playChoice) +
        ">>!"
      );
    }
  }

  public void setCompChoice() {
    int nums = (int) (Math.random() * 3);
    switch (nums) {
      case 0:
        compChoice = "R";
        break;
      case 1:
        compChoice = "P";
        break;
      case 2:
        compChoice = "S";
        break;
    }
  }

  public String toString() {
    return (
      "player had " +
      hm.get(playChoice) +
      "\ncomputer had " +
      hm.get(compChoice)
    );
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

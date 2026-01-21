package CS22526.Labs.Unit8.BJ;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import static java.lang.System.*;

import java.util.Scanner;

public class BlackJack {

  private Player player;
  private Dealer dealer;

  public BlackJack() {
    player = new Player();
    dealer = new Dealer();
  }

  public void playGame() {
    Scanner keyboard = new Scanner(System.in);
    char choice = 0;

    do {
      dealer.shuffle();
      player.resetHand();
      dealer.resetHand();

      player.addCardToHand(dealer.deal());
      dealer.addCardToHand(dealer.deal());
      player.addCardToHand(dealer.deal());
      dealer.addCardToHand(dealer.deal());

      out.println("\nPLAYER ");
      out.println("Cards in Hand:  \n" + player);
      out.println("Hand Value:  " + player.getHandValue());

      if (player.getHandValue() == 21) {
        out.println("\nBlackjack! You have 21!");
      }

      while (player.getHandValue() < 21) {
        out.println("\nDo you want to hit (y/n)? ");
        choice = keyboard.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
          player.addCardToHand(dealer.deal());
          out.println("\nPLAYER ");
          out.println("Cards in Hand :: \n" + player);
          out.println("Hand Value:  " + player.getHandValue());
          if (player.getHandValue() > 21) {
            out.println("\nPlayer busts!");
            break;
          }
        } else {
          break;
        }
      }

      out.println("\nDEALER ");
      out.println("Cards in Hand :: \n" + dealer);
      out.println("Hand Value :: " + dealer.getHandValue());

      while (dealer.hit() && dealer.getHandValue() <= 21) {
        dealer.addCardToHand(dealer.deal());
        out.println("\nDEALER hits");
        out.println("Cards in Hand :: \n" + dealer);
        out.println("Hand Value :: " + dealer.getHandValue());
      }

      int playerTotal = player.getHandValue();
      int dealerTotal = dealer.getHandValue();

      if (playerTotal > 21 && dealerTotal <= 21) {
        out.println("\nDealer wins - Player busted!");
        dealer.setWinCount(dealer.getWinCount() + 1);
      } else if (playerTotal <= 21 && dealerTotal > 21) {
        out.println("\nPlayer wins - Dealer busted!");
        player.setWinCount(player.getWinCount() + 1);
      } else if (playerTotal > 21 && dealerTotal > 21) {
        out.println("\nBoth players bust!");
      } else if (playerTotal < dealerTotal) {
        out.println("\nDealer wins - Dealer has bigger hand value!");
        dealer.setWinCount(dealer.getWinCount() + 1);
      } else if (playerTotal > dealerTotal) {
        out.println("\nPlayer wins - Player has bigger hand value!");
        player.setWinCount(player.getWinCount() + 1);
      } else {
        out.println("\nTie game!");
      }

      out.println("\nPlayer wins: " + player.getWinCount());
      out.println("Dealer wins: " + dealer.getWinCount());

      out.println("\nDo you want to play again (y/n)? ");
      choice = keyboard.next().charAt(0);
    } while (choice == 'y' || choice == 'Y');

    out.println("\nThanks for playing!");
  }

  public static void main(String[] args) {
    BlackJack game = new BlackJack();
    game.playGame();
  }
}

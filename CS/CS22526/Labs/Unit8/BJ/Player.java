package CS22526.Labs.Unit8.BJ;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class Player {

  private ArrayList<Card> hand;
  private int winCount;

  public Player() {
    hand = new ArrayList<Card>();
    winCount = 0;
  }

  public Player(int score) {
    hand = new ArrayList<Card>();
    winCount = score;
  }

  public void addCardToHand(Card temp) {
    hand.add(temp);
  }

  public void resetHand() {
    hand.clear();
  }

  public void setWinCount(int numwins) {
    winCount = numwins;
  }

  public int getWinCount() {
    return winCount;
  }

  public int getHandSize() {
    return hand.size();
  }

  public int getHandValue() {
    int total = 0;
    int aceCount = 0;

    for (Card card : hand) {
      total += card.getValue();
      if (card.getValue() == 11) {
        aceCount++;
      }
    }

    while (total > 21 && aceCount > 0) {
      total -= 10;
      aceCount--;
    }

    return total;
  }

  public boolean hit() {
    return getHandValue() < 17;
  }

  public String toString() {
    String output = "";
    for (Card card : hand) {
      output += card + "\n";
    }
    return output;
  }
}

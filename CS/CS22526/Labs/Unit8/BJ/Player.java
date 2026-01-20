package CS22526.Labs.Unit8.BJ;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class Player
{
   private ArrayList<Card> hand;
   private int winCount;

   public Player ()
   {
     hand = new ArrayList<Card>();
     winCount = 0;
   }

   public Player (int score)
   {
      hand = new ArrayList<Card>();
      winCount = score;
   }

   public void addCardToHand( Card temp )
   {
     hand.add(temp);
   }

   public void resetHand( )
   {
     hand.clear();
   }

   public  void setWinCount( int numwins )
   {
      winCount = numwins;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
      return 0;
   }

   public  boolean  hit( )
   {
      return false;
   }

   public String toString()
   {
      return "";
   }
}
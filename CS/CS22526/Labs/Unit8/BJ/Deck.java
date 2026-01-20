package CS22526.Labs.Unit8.BJ;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 
//Date -

import java.util.Stack;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private Stack StackOfCards;

	public Deck ()
	{
    StackOfCards = new Stack<Card>();

    for (int i = 0; i < NUMSUITS; i++) {
      for (int j = 1; j <= NUMFACES; j++) {
        StackOfCards.push(new Card(j, SUITS[i]));
      }
    }
  }

   public void shuffle ()
	{
    StackOfCards.clear();
    Stack<Card> tmepDeck = new Stack<Card>();

    for (int i = 0; i < NUMSUITS; i++) {
      for (int j = 1; j <= NUMFACES; j++) {
        tmepDeck.push(new Card(j, SUITS[i]));
      }
    }

    Collections.shuffle(StackOfCards);
		StackOfCards = tmepDeck;
    //add 52 cards to the stack
		//random maybe
	}	

   //accessors
	public int  size ()
	{
		return StackOfCards.size();
	}

	public int numCardsLeft()
	{
		return StackOfCards.size();
	}

	public Card nextCard()
	{
		return (Card) StackOfCards.pop();
	}

	public String toString()
	{
		return StackOfCards.toString().replaceAll(",","\n");
	}
 }
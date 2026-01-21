package CS22526.Labs.Unit8.BJ;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Dealer extends Player
{
	private Deck deck;

	public Dealer() {
		super();
		deck = new Deck();
	}

	public void  shuffle()
	{
	   deck.shuffle();
	}

	public Card  deal(){
	   return deck.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deck.numCardsLeft();
	}

	public boolean hit()
	{
	   return getHandValue() < 17;
    }
}









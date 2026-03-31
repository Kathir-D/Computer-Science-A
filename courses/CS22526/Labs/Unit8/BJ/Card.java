package CS22526.Labs.Unit8.BJ;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Card {

  public static final String FACES[] = {
    "ZERO",
    "ACE",
    "TWO",
    "THREE",
    "FOUR",
    "FIVE",
    "SIX",
    "SEVEN",
    "EIGHT",
    "NINE",
    "TEN",
    "JACK",
    "QUEEN",
    "KING",
  };

  private String suit;
  private int face;

  public Card() {
    this.suit = "";
    this.face = 0;
  }

  public Card(int face, String suit) {
    this.suit = suit;
    this.face = face;
  }

  public void setFace(int face) {
    this.face = face;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public int getFace() {
    return face;
  }

  public String getSuit() {
    return suit;
  }

  public String getValueString() {
    return FACES[face];
  }

  public int getValue() {
    return face;
  }

  public boolean equals(Card obj) {
    return this.face == obj.getValue() && this.suit.equals(obj.getSuit());
  }

  public String toString() {
    return getValueString() + " of " + getSuit() + " | value = " + getValue();
  }
}

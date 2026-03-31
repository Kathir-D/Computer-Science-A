package CS22526.Labs.Unit8.BJ;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class BlackJackCard extends Card {

  public BlackJackCard() {
    super();
  }

  public BlackJackCard(int face, String suit) {
    super(face, suit);
  }

  public int getValue() {
    switch (String.valueOf(super.getValueString())) {
      case "ZERO":
        return 0;
      case "ACE":
        return 11;
      case "TWO":
        return 2;
      case "THREE":
        return 3;
      case "FOUR":
        return 4;
      case "FIVE":
        return 5;
      case "SIX":
        return 6;
      case "SEVEN":
        return 7;
      case "EIGHT":
        return 8;
      case "NINE":
        return 9;
      case "TEN":
        return 10;
      case "JACK":
        return 10;
      case "QUEEN":
        return 10;
      case "KING":
        return 10;
    }

    return 0;
  }
}

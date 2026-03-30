package CS.CS22526.Labs.Unit10;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class Number {

  private int theValue;

  public Number(int value) {
    this.theValue = value;
  }

  public int getValue() {
    return theValue;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Number)) {
      return false;
    }
    Number other = (Number) obj;
    return theValue == other.theValue;
  }

  public int hashCode() {
    return Math.abs(theValue) % 10;
  }

  public String toString() {
    return "" + theValue;
  }
}

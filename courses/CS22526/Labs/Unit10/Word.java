package CS22526.Labs.Unit10;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class Word {

  private String theValue;

  public Word(String s) {
    theValue = s;
  }

  public String getValue() {
    return theValue;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Word)) return false;
    Word other = (Word) obj;
    return theValue.equals(other.theValue);
  }

  public int hashCode() {
    int vowelCount = 0;
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < theValue.length(); i++) {
      if (vowels.indexOf(theValue.charAt(i)) >= 0) vowelCount++;
    }
    return (vowelCount * theValue.length()) % 10;
  }

  public String toString() {
    return theValue;
  }
}

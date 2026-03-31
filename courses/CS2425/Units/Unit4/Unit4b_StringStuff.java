package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit4b_StringStuff {

  private String word;

  public Unit4b_StringStuff(String w) {
    word = w;
  }

  public String getFirstLastLetters() {
    return "" + word.charAt(0) + word.charAt(word.length() - 1);
  }

  public String getMiddleLetter() {
    return "" + word.charAt(word.length() / 2);
  }

  public int diffInASCII(char Letter) {
    char c = Letter;
    int cASCII = c;
    int castcASCII = (int) cASCII;
    char x = word.charAt(0);
    int xASCII = x;
    int castxASCII = (int) xASCII;

    return castxASCII - castcASCII;
  }

  public boolean sameFirstLastLetters() {
    String one = String.valueOf(word.charAt(0));
    String two = String.valueOf(word.charAt(word.length() - 1));

    if (one.equals(two)) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return (
      "Enter a word :: " +
      word +
      "\n" +
      "Has first last letters :: " +
      getFirstLastLetters() +
      "\n" +
      "Has middle letter :: " +
      getMiddleLetter() +
      "\n" +
      "has same first and last letter :: " +
      sameFirstLastLetters() +
      "\n" +
      "Difference in ascii values " +
      word +
      " minus " +
      "C" +
      " == " +
      diffInASCII('c') +
      "\n"
    );
  }
}
/*
        return "SS# " + socialNum + " has a total of " + sum + "\n";
 */

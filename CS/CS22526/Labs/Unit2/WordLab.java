package CS22526.Labs.Unit2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class WordLab implements Comparable<WordLab> {

  private String word;

  public WordLab(String s) {
    word = s;
  }

  public int compareTo(WordLab rhs) {
    if (word.length() < rhs.word.length()) {
      return -1;
    } else if (word.length() > rhs.word.length()) {
      return 1;
    } else {
      return word.compareTo(rhs.word);
    }
  }

  public String toString() {
    return word;
  }
}

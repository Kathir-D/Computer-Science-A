package CS22526.Labs.Unit2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class WordLab2 implements Comparable<WordLab2> {

  private String word;

  public WordLab2(String s) {
    word = s;
  }

  private int numVowels() {
    String vowels = "AEIOUaeiou";
    int vowelCount = 0;

    for (int i = 0; i < word.length(); i++) {
      if (vowels.indexOf(word.charAt(i)) != -1) {
        vowelCount++;
      }
    }

    return vowelCount;
  }

  public int compareTo(WordLab2 rhs) {
    if (numVowels() < rhs.numVowels()) {
      return -1;
    } else if (numVowels() > rhs.numVowels()) {
      return 1;
    } else {
      return word.compareTo(rhs.word);
    }
  }

  public String toString() {
    return word;
  }
}

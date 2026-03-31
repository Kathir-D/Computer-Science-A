package CS22526.Labs.Unit1; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StringSearch {

  /*
   *method countWords will count the occurrences of word in sent
   *there may many occurrences of word or none at all
   */
  public static int countWords(String sent, String word) {
    int count = 0;
    int position = 0;

    for (int i = 0; i < sent.length() / word.length(); i++) {
      position = sent.indexOf(word, position);

      if (position == -1) {
        break;
      } else {
        count++;
        position += word.length();
      }
    }

    return count;
  }

  /*
   *method countLetters will count the occurrences of letter in sent
   *there may many occurrences of letter or none at all
   */
  public static int countLetters(String sent, String letter) {
    int count = 0;

    char[] arr = sent.toCharArray();

    for (int i = 0; i < sent.length(); i++) {
      if (arr[i] == letter.toCharArray()[0]) {
        count++;
      }
    }

    return count;
  }
}

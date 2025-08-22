package CS22526.Labs.Unit1;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LongPalindrome {

  /*
   *method getAllPalins will return an array list that contains
   *all of the palindromes contained within word
   *palindromes must have a minimum length of 2
   */
  public static ArrayList<Palin> getAllPalins(String word) {
    ArrayList<Palin> palins = new ArrayList<>();
    Palin p = new Palin();

    for (int i = 0; i < word.length(); i++) {
      for (int k = i + 2; k <= word.length(); k++) {
        String PalinString = word.substring(i, k);
        p = new Palin(PalinString);
        if (p.isPalin()) {
          int location = insertLocation(palins, p);
          palins.add(location, p);
        }
      }
    }

    return palins;
  }

  /*
   *method insertLocation will look at the list and determine where to
   *put the new Palin so that the sorted order is maintained
   */
  private static int insertLocation(ArrayList<Palin> list, Palin pal) {
    for (int i = 0; i < list.size(); i++) {
      if (pal.getWord().compareTo(list.get(i).getWord()) <= 0) {
        return i;
      }
    }

    return list.size();
  }

  /*
   *method getLongestPalin will return the longest
   *palindrome contained within word
   *a palindrome must a minimum length of 2
   */
  public static Palin getLongestPalin(String word) {
    Palin PalinLongest = new Palin();
    ArrayList<Palin> palins = getAllPalins(word);
    String longest = "";
    int longestPalin = 0;

    for (int i = 0; i < palins.size(); i++) {
      longest = palins.get(i).getWord().toString();
      if (longest.length() > longestPalin) {
        longestPalin = longest.length();
        PalinLongest = palins.get(i);
      }
    }

    return PalinLongest;
  }
}

package CS22526.Labs.Unit1;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;

public class LongPalindromeRunner {

  public static void main(String args[]) {
    String[] words = {
      "bobcat",
      "bobracecarcat",
      "alligatorslikegroovycatslikemadamandrooroo",
      "idrovetothelibraryinmyracecartolearnaboutpanama",
    };

    // Process each test case
    for (String word : words) {
      System.out.println(LongPalindrome.getAllPalins(word));
      System.out.println(LongPalindrome.getLongestPalin(word));
    }
  }
}

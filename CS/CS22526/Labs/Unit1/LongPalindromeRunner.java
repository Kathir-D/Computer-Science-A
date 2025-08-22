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
    System.out.println(LongPalindrome.getAllPalins("bobcat"));
    System.out.println(LongPalindrome.getLongestPalin("bobcat") + "\n");

    System.out.println(LongPalindrome.getAllPalins("bobracecarcat"));
    System.out.println(LongPalindrome.getLongestPalin("bobracecarcat") + "\n");

    System.out.println(
      LongPalindrome.getAllPalins("alligatorslikegroovycatslikemadamandrooroo")
    );
    System.out.println(
      LongPalindrome.getLongestPalin(
        "alligatorslikegroovycatslikemadamandrooroo"
      ) +
      "\n"
    );

    System.out.println(
      LongPalindrome.getAllPalins(
        "idrovetothelibraryinmyracecartolearnaboutpanama"
      )
    );
    System.out.println(
      LongPalindrome.getLongestPalin(
        "idrovetothelibraryinmyracecartolearnaboutpanama"
      ) +
      "\n"
    );
  }
}

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package CS22526.Labs.Unit4;

import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets {

  private Set<Integer> odds = new TreeSet<Integer>();
  private Set<Integer> evens = new TreeSet<Integer>();

  public OddEvenSets() {
    // for some reason it errors out if I initialize the sets here instead of above
  }

  public OddEvenSets(String line) {
    String[] numbers = line.split(" ");

    for (String number : numbers) {
      if (Integer.parseInt(number) % 2 == 0) {
        evens.add(Integer.parseInt(number));
      } else {
        odds.add(Integer.parseInt(number));
      }
    }
  }

  public String toString() {
    return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
  }
}

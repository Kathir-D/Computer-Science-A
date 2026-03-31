//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

package CS22526.Labs.Unit4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniquesDupes {

  public static Set<String> getUniques(String input) {
    Set<String> uniques = new TreeSet<>();

    String[] s = input.split(" ");

    uniques.addAll(Arrays.asList(s));

    return uniques;
  }

  public static Set<String> getDupes(String input) {
    Set<String> dupes = new TreeSet<>();
    Set<String> seen = new TreeSet<>();

    String[] s = input.split(" ");

    for (String word : s) {
      if (seen.contains(word)) {
        dupes.add(word);
      } else {
        seen.add(word);
      }
    }
    return dupes;
  }
}

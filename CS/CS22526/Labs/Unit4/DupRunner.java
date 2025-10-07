//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package CS22526.Labs.Unit4;

import static java.lang.System.*;

import java.util.*;

public class DupRunner {

  public static void main(String[] args) {
    String test1 = "a b c d e f g h a b c d e f g h i j k";
    out.println("Original List : " + test1);
    out.println("Uniques : " + UniquesDupes.getUniques(test1));
    out.println("Dupes : " + UniquesDupes.getDupes(test1));
    out.println();

    String test2 = "one two three one two three six seven one two";
    out.println("Original List : " + test2);
    out.println("Uniques : " + UniquesDupes.getUniques(test2));
    out.println("Dupes : " + UniquesDupes.getDupes(test2));
    out.println();

    String test3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
    out.println("Original List : " + test3);
    out.println("Uniques : " + UniquesDupes.getUniques(test3));
    out.println("Dupes : " + UniquesDupes.getDupes(test3));
  }
}

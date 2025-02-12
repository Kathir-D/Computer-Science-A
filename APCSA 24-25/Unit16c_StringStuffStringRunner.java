//(c) A+ Computer Science
// www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;

public class Unit16c_StringStuffStringRunner {

  public static void main(String args[]) {
    Unit16c_StringStuffString s = new Unit16c_StringStuffString();
    String[] ss =
      "one eleven11 thirteen 1234 22two three 4four 5five 66it a bee".split(
          " "
        );
    ArrayList<String> sf;
    sf = new ArrayList<String>(Arrays.asList(ss));
    s.lengthSort(sf);
    System.out.println(sf);
    //add more test cases
  }
}
/*
Lab Goal : This lab was designed to teach your more about ArrayList and sorting algorithms.
Lab Description : For this problem, you will write a method that will sort Strings by length.
All Strings with the same length will be sorted by alpha.
Use either the selection sort algorithm or insertion sort algorithm to help you write this method.
Sample Data :
one, three, z, a
one eleven11 thirteen 1234 22two three 4four 5five 66it a bee
Sample Output :
[a, z, one, three]
[a, bee, one, 1234, 66it, 22two, 4four, 5five, three, eleven11, thirteen]
 */

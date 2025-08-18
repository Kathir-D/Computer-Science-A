package CSA2425; //(c) A+ Computer Science

// www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;

public class Unit16c_StringStuffDigitRunner {

  public static void main(String args[]) {
    Unit16c_StringStuffDigit s = new Unit16c_StringStuffDigit();

    ArrayList<String> sf1 = new ArrayList<>(Arrays.asList("7a7", "888", "9"));
    ArrayList<String> sf2 = new ArrayList<>(
      Arrays.asList("1one", "three22", "z", "a7")
    );
    s.digitSort(sf1);
    s.digitSort(sf2);
    System.out.println(sf1);
    System.out.println(sf2);
    //add more test cases
  }
}
/*
Lab Goal : This lab was designed to teach your more about ArrayList and sorting algorithms.
Lab Description : For this problem, you will write a method that will sort Strings by the number of digits
[0-9]. All Strings with the same number of digits will be sorted by alpha.
Use either the selection sort algorithm or insertion sort algorithm to help you write this method.
Sample Data :
7a7, 888, 9
1one, three22, z, a7]
Sample Output :
[9, 7a7, 888]
[z, 1one, a7, three22]
 */

package CSA2425; //(c) A+ Computer Science

// www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unit16c_IntStuffRunner {

  public static void main(String args[]) {
    List<Integer> sf;
    List<Integer> rf;
    sf = new ArrayList<Integer>(
      Arrays.asList(34, 666, 1234, 5, 7, 9, 11, 111111, 876, 9999)
    );
    rf = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 11, 22, 33, 111, 222, 333)
    );
    Unit16c_IntStuff.selectionDigitSumSort(sf);
    Unit16c_IntStuff.insertionDigitSumSort(rf);
    System.out.println(sf);
    System.out.println(rf);
    //add more test cases
  }
}
/*
Lab Goal : This lab was designed to teach you more about ArrayList and sorting algorithms.
Lab Description : For this problem, you will write a method that will sort integers by the sum of their
digits. You will need to use % 10 and / 10 to chop up each integer in order to access the digits of each integer.
Use either the selection sort algorithm or insertion sort algorithm to help you write this method.
Sample Data :
34,666,1234,5,7,9,11,111111,876,9999
1,2,3,11,22,33,111,222,333
Sample Output :
[11, 5, 111111, 7, 34, 9, 1234, 666, 876, 9999]
[1, 2, 11, 3, 111, 22, 33, 222, 333]
 */

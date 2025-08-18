package CSA2425;

import java.util.ArrayList;
import java.util.List;

public class Unit16c_IntStuff {

  private ArrayList<Integer> arr = new ArrayList<Integer>();

  public static int getDigitSum(Integer n) {
    int sum = 0;
    String num = n.toString();

    for (int i = 0; i < num.length() + 1; i++) {
      sum += n % 10;
      n /= 10;
    }

    return sum;
  }

  public static void selectionDigitSumSort(List<Integer> list) {
    //selection sort
    for (int i = 0; i < list.size() - 1; i++) {
      int min = i;
      for (int j = i + 1; j < list.size(); j++) {
        if (getDigitSum(list.get(j)) < getDigitSum(list.get(min))) {
          min = j;
        }
      }
      int temp = list.get(i);
      list.set(i, list.get(min));
      list.set(min, temp);
    }
    //sort ints by the sum of their digits
  }

  public static void insertionDigitSumSort(List<Integer> list) {
    //insertion sort
    for (int i = 1; i < list.size(); i++) {
      int key = list.get(i);
      int j = i - 1;
      while (j >= 0 && getDigitSum(list.get(j)) > getDigitSum(key)) {
        list.set(j + 1, list.get(j));
        j--;
      }
      list.set(j + 1, key);
    }
    //sort ints by the sum of their digits
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

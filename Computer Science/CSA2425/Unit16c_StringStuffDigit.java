package CSA2425;

import java.util.ArrayList;

public class Unit16c_StringStuffDigit {

  public static int getDigCount(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        count++;
      }
    }

    return count;
  }

  public static void digitSort(ArrayList<String> list) {
    //selection sort
    for (int i = 0; i < list.size() - 1; i++) {
      int min = i;
      for (int j = i + 1; j < list.size(); j++) {
        if (getDigCount(list.get(j)) < getDigCount(list.get(min))) {
          min = j;
        }
      }
      String temp = list.get(i);
      list.set(i, list.get(min));
      list.set(min, temp);
    }
    //sort strings by # of digits [0-9]
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

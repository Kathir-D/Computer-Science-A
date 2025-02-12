import java.util.ArrayList;

public class Unit16c_StringStuffString {

  public static void lengthSort(ArrayList<String> list) {
    //insertion sort
    for (int i = 1; i < list.size(); i++) {
      int key = list.get(i).length();
      String keyString = list.get(i);
      int j = i - 1;
      while (j >= 0 && list.get(j).length() > key) {
        list.set(j + 1, list.get(j));
        j--;
      }
      list.set(j + 1, keyString);
    }
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

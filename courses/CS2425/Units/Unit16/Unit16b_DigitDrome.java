package CSA2425;

import java.util.ArrayList;

public class Unit16b_DigitDrome {

  // IDK if this works correctly

  //create an arraylist instance variable
  private ArrayList<Integer> dd;

  //write a constructor
  Unit16b_DigitDrome() {
    dd = new ArrayList<Integer>();
  }

  //write create group
  public void createGroup(ArrayList<Integer> ar) {
    for (int x : ar) {
      dd.add(getLeft(x) + getRight(x));
    }
  }

  //write get left
  public int getLeft(int x) {
    String s = Integer.toString(x);
    return Integer.parseInt(s.substring(0, 1));
  }

  //write get right
  public int getRight(int x) {
    return x % 10;
  }

  //write isPalin
  public boolean isPalin() {
    for (int i = 0; i < dd.size() / 2; i++) {
      if (dd.get(i) != dd.get(dd.size() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  //write a toString
  public String toString() {
    return dd.toString();
  }
}
/*
Lab Goal : This lab was designed to teach you more class and methods using an ArrayList.
Lab Description :
For this problem, you need to make a numeric palindrome class named DigitDrome.
The DigitDrome class contains one instance variable which is an ArrayList of integers.
The ArrayList instance variable stores all of the left and right digit sums.
The DigitDrome class has 5 methods.
The createGroup method builds the ArrayList of integers stored inside the class.
The createGroup method goes through the parameter passed in and sums all of the left and right digits of each
value in the parameter.
The getLeft and getRight methods must be called in createGroup to create each of the digit sums.
Each of the left and right sums is stored in the ArrayList instance variable.
1257 would result in 8 being added to the ArrayList.
The getLeft method will return the left digit of any number passed in.
The getRight method will return the right digit of any number passed in.
The isPalin method will go through the digit sums to see if the ArrayList values are a palindrome.
A palindrome is a group of values that read the same forward as backward.
The ToString method will return the arraylist instance variable
 */

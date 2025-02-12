//(c) A+ Computer Science
// www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;

public class Unit16b_DigitDromeRunner {

  public static void main(String args[]) {
    Unit16b_DigitDrome dd = new Unit16b_DigitDrome();

    System.out.println(dd.getLeft(92351));
    System.out.println(dd.getRight(92351));
    ArrayList<Integer> x;

    x = new ArrayList<Integer>(Arrays.asList(111, 222, 333, 313, 3234, 44));
    dd.createGroup(x);
    System.out.println(dd);
    System.out.println(dd.isPalin());

    x = new ArrayList<Integer>(Arrays.asList(2, 1, 2));
    dd = new Unit16b_DigitDrome();
    dd.createGroup(x);
    System.out.println(dd);
    System.out.println(dd.isPalin());

    x = new ArrayList<Integer>(Arrays.asList(2152, 1, 333, 333, 1, 2152));
    dd = new Unit16b_DigitDrome();
    dd.createGroup(x);
    System.out.println(dd);
    System.out.println(dd.isPalin());

    x = new ArrayList<Integer>(Arrays.asList(717));
    dd = new Unit16b_DigitDrome();
    dd.createGroup(x);
    System.out.println(dd);
    System.out.println(dd.isPalin());

    x = new ArrayList<Integer>(Arrays.asList(81, 77));
    dd = new Unit16b_DigitDrome();
    dd.createGroup(x);
    System.out.println(dd);
    System.out.println(dd.isPalin());

    x = new ArrayList<Integer>(Arrays.asList(81, 77, 9));
    dd = new Unit16b_DigitDrome();
    dd.createGroup(x);
    System.out.println(dd);
    System.out.println(dd.isPalin());

    x = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 81, 77, 9)
    );
    dd = new Unit16b_DigitDrome();
    dd.createGroup(x);
    System.out.println(dd);
    System.out.println(dd.isPalin());

    x = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 10, 11, 12));
    dd = new Unit16b_DigitDrome();
    dd.createGroup(x);
    System.out.println(dd);
    System.out.println(dd.isPalin());
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

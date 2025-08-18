package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit8a_DigitCounter {

  public static int go(int number) {
    int sum = 0;
    while (number > 0) {
      sum++;
      number = number / 10;
    }
    return sum;
  }
}
/*
Lab Goal : This lab will focus on decision making and iteration [ looping ] while reviewing accessing
numeric digits using mod and divide.
Lab Description : Write a program that will count up how many digits a number contains. You must
use a loop and % to access each of the individual digits. Use / to reduce the number so that you can count all
of the digits.
Sample Data
234
10000
111
9005
84645
8547
123456789
55556468
8525455
8514548
111111
1212121212
222222
Sample Output
3
5
3
4
5
4
9
8
7
7
6
10
6
 */

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9a_GCD {

  public static long getGCD(int numOne, int numTwo) {
    long gcd = 0;

    for (int i = 1; i < numTwo; i++) {
      if (numOne % i == 0 && numTwo % i == 0) {
        gcd = i;
      }
    }

    return gcd;
  }
}
/*
Lab Goal : This lab was designed to teach you how to use for loops and as a review of mod %.
Lab Description : Determine the greatest common divisor between two numbers. The greatest
common divisor is the largest number that will evenly divide into both numbers.
The GCD of 2 and 4 is 2.
The GCD of 5 and 50 is 5.
The GCD of 11 and 110 is 11.
Sample Data :
5 25
4 400
8 80
15 45
6 66
9 9
9 543
15 40
6 51
Sample Output :
the gcd of 5 and 25 is 5
the gcd of 4 and 400 is 4
the gcd of 8 and 80 is 8
the gcd of 15 and 45 is 15
the gcd of 6 and 66 is 6
the gcd of 9 and 9 is 9
the gcd of 9 and 543 is 3
the gcd of 15 and 40 is 5
the gcd of 6 and 51 is 3
 */

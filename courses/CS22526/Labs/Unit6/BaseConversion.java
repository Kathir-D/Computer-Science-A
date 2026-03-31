package CS22526.Labs.Unit6;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BaseConversion {

  private String number;
  private int base;

  public BaseConversion(String num, int b) {
    number = num;
    base = b;
  }

  public void setNumBase(String num, int b) {
    number = num;
    base = b;
  }

  private int convertToTen() {
    int q = number.length();
    int base10 = 0;

    char[] digits = number.toCharArray();

    for (int i = 0; i < digits.length; i++) {
      char c = digits[digits.length - 1 - i];

      int digitValue;

      if (c >= '0' && c <= '9') {
        digitValue = c - '0';
      } else {
        if (c >= 'A' && c <= 'Z') {
          digitValue = c - 'A' + 10;
        } else {
          digitValue = 0;
        }
      }

      if (digitValue >= base) {
        System.out.println("Error: Invalid digit for base " + base);
        return -1;
      }

      base10 += (int) (digitValue * Math.pow(base, i));
    }

    return base10;
  }

  public String getNum(int newBase) {
    int base10 = convertToTen();

    if (base10 == 0) {
      return "0";
    }

    String newNum = "";

    while (base10 > 0) {
      int rem = base10 % newBase;
      base10 = base10 / newBase;

      // Handle bases > 10 (hexadecimal)
      if (rem < 10) {
        newNum += rem;
      } else {
        newNum += (char) ('A' + (rem - 10));
      }
    }

    String finalNum = "";
    for (int i = newNum.length() - 1; i >= 0; i--) {
      finalNum += newNum.charAt(i);
    }

    return finalNum;
  }

  public String toString() {
    return number + "-" + base;
  }
}
/*
Lab Goal : This lab was designed to teach you more about base conversion.
Lab Description : Read in a number and a base and a new base. You are then to output the original
number and original base and the new number in the new base.
Sample Data :
10 10 2
AB 16 10
345 6 4
25 10 2
127 10 16
1024 7 16
97342 10 16
1010010010001001 2 16
Sample Output :
10-10 == 1010-2
AB-16 == 171-10
345-6 == 2021-4
25-10 == 11001-2
127-10 == 7F-16
1024-7 == 169-16
97342-10 == 17C3E-16
1010010010001001-2 == A489-16
© A+ Computer Science – Number Systems - www.apluscompsci.com
algorithm help
ANY BASE to BASE TEN
Given 32 in base 4, you could convert it to base
10 using the following formula ::
4^3 4^2 4^1 4^0
* * * *
0 + 0 + 3 + 2
0 * 64 + 0 * 16 + 3 * 4 + 2 * 1 = 14
BASE TEN to ANY BASE
loop as long as num is greater than 0
while ( num > 0 )
{
get remainder - % new base
reduce num - / new base
}
if new base is 2 and num is 65
new base num / remainder %
2 |65 1
2 |32 0
2 |16 0
2 |8 0
2 |4 0
2 |2 0
2 |1 1
65 base 10 = 100 0001 base 2
% and div are your friends.
Files Needed ::
BaseConversion.java
BaseRunner.java
A+ Computer Science BASE CONVERSION
 */

//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9a_TwoToTen {

  public static long getBaseTen(String bin) {
    return Integer.parseInt(bin, 2);
  }
}
/*
Lab Goal : This lab was designed to teach you how to use for loops and a little bit about base conversion.
Lab Description : Convert a base 2 – binary number to base ten.
1101 base 2 = 13 base 10
1111 base 2 = 15 base 10
11111 base 2 = 31 base 10
10000 base 2 = 16 base 10
Sample Data :
1010
1100
1110
1111
11111
111111
1110101
10101010101
1010101010110
111111111111111111
Sample Output :
1010 == 10
1100 == 12
1110 == 14
1111 == 15
11111 == 31
111111 == 63
1110101 == 117
10101010101 == 1365
1010101010110 == 5462
111111111111111111 == 262143
How does binary work?
Binary is a power of 2 number system.
24 23 22 21 20
16 8 4 2 1
1 1 0 1 0 = 26
Files Needed ::
TwoToTen.java
TwoToTenRunner.java
A+ Computer Science BINARY TO TEN

 */

package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name

public class Unit9a_TwoToTenRunner {

  public static void main(String[] args) {
    System.out.println("1010 == " + Unit9a_TwoToTen.getBaseTen("1010"));
    System.out.println("1100 == " + Unit9a_TwoToTen.getBaseTen("1100"));
    System.out.println("1110 == " + Unit9a_TwoToTen.getBaseTen("1110"));
    System.out.println("1111 == " + Unit9a_TwoToTen.getBaseTen("1111"));
    System.out.println("11111 == " + Unit9a_TwoToTen.getBaseTen("11111"));
    System.out.println("111111 == " + Unit9a_TwoToTen.getBaseTen("111111"));
    System.out.println("1110101 == " + Unit9a_TwoToTen.getBaseTen("1110101"));
    System.out.println(
      "10101010101 == " + Unit9a_TwoToTen.getBaseTen("10101010101")
    );
    System.out.println(
      "1010101010110 == " + Unit9a_TwoToTen.getBaseTen("1010101010110")
    );
    System.out.println(
      "111111111111111111 == " +
      Unit9a_TwoToTen.getBaseTen("111111111111111111")
    );
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

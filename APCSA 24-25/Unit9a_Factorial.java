//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9a_Factorial {

  public static long getFactorial(int num) {
    long factorial = 1;

    for (int i = 0; i < num; i++) {
      factorial *= num - i;
    }

    return factorial;
  }
}
/*
Lab Goal : This lab was designed to teach you how to use for loops and what factorial is.
Lab Description : Generate the factorial for any given number.
The factorial of 5 is 5x4x3x2x1 = 120.
The factorial of 4 is 4x3x2x1 = 24.
Sample Data :
5
4
8
15
6
9
3
Sample Output :
factorial of 5 is 120
factorial of 4 is 24
factorial of 8 is 40320
factorial of 15 is 1307674368000
factorial of 6 is 720
factorial of 9 is 362880
factorial of 3 is 6
algorithm help
For loop starting at one and going to number
sum of the multiplicative values of num
Files Needed ::
Factorial.java
FactorialRunner.java
A+ Computer Science FACTORIAL

 */

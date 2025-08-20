package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name

public class Unit9a_CoolNumbersRunner {

  public static void main(String[] args) {
    System.out.println(
      Unit9a_CoolNumbers.countCoolNumbers(250) +
      " cool numbers between 6 - " +
      250
    );
    System.out.println(
      Unit9a_CoolNumbers.countCoolNumbers(1250) +
      " cool numbers between 6 - " +
      1250
    );
    System.out.println(
      Unit9a_CoolNumbers.countCoolNumbers(2250) +
      " cool numbers between 6 - " +
      2250
    );
    System.out.println(
      Unit9a_CoolNumbers.countCoolNumbers(5500) +
      " cool numbers between 6 - " +
      5500
    );
    System.out.println(
      Unit9a_CoolNumbers.countCoolNumbers(9500) +
      " cool numbers between 6 - " +
      9500
    );
    System.out.println(
      Unit9a_CoolNumbers.countCoolNumbers(23500) +
      " cool numbers between 6 - " +
      23500
    );
    System.out.println(
      Unit9a_CoolNumbers.countCoolNumbers(32500) +
      " cool numbers between 6 - " +
      32500
    );
  }
}
/*
Lab Goal : This lab will focus on loops, decision making, and methods.
Lab Description : Complete methods isCoolNum( n ) && countCoolNumbers( n ).
isCoolNum( n) will determine if a number is a cool number. A cool number is any number that has a
remainder of 1 when divided by 3,4,5, and 6. countCoolNumbers will count the number of cool numbers
between 6 and the parameter passed in.
Basic for loop syntax :
for(int x=5; x<200; x=x+20)
{
//do something
}
Sample Data
250
1250
2250
5500
9500
23500
32500
Sample Output :
4 cool numbers between 6 - 250
20 cool numbers between 6 - 1250
37 cool numbers between 6 - 2250
91 cool numbers between 6 - 5500
158 cool numbers between 6 - 9500
391 cool numbers between 6 - 23500
541 cool numbers between 6 - 32500
Files Needed ::
CoolNumbers.java
CoolNumbersRunner.java
A+ Computer Science COOL
NUMBERS

 */

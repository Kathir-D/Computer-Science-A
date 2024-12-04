//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit6a_NumberCheckerRunner {

  public static void main(String args[]) {
    System.out.println(Unit6a_NumChecker.check(212));
    System.out.println(Unit6a_NumChecker.check(100));
    System.out.println(Unit6a_NumChecker.check(25));
    System.out.println(Unit6a_NumChecker.check(88));
    System.out.println(Unit6a_NumChecker.check(99));
    System.out.println(Unit6a_NumChecker.check(7));
    System.out.println(Unit6a_NumChecker.check(8));
    System.out.println(Unit6a_NumChecker.check(10));
    System.out.println(Unit6a_NumChecker.check(5));
  }
}
/*
Lab Description : Your check method should receive a number and evaluate it. If the number is evenly
divisible by 5, return 1. If the number is evenly divisible by 4, return 2. If the number is evenly divisible by 3,
return 3. Return 4 for all other cases.
Sample Data :
212
100
25
88
99
7
8
10
5
Sample Output :
2
1
1
2
3
4
2
1
1
 */
/*
input

212
100
25
88
99
7
8
10
5


output

2
1
1
2
3
4
2
1
1

*/

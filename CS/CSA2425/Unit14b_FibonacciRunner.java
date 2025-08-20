package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit14b_FibonacciRunner {

  public static void main(String args[]) {
    Unit14b_Fibonacci fib = new Unit14b_Fibonacci(50); // set size to 50
    System.out.println(fib.getFibo(1)); // should print 1
    System.out.println(fib.getFibo(2)); // should print 1
    System.out.println(fib.getFibo(3)); // should print 2
    System.out.println(fib.getFibo(4)); // should print 3
    System.out.println(fib.getFibo(5)); // should print 5
    System.out.println(fib.getFibo(6)); // should print 8

    // Test case 2: Out of range index
    System.out.println("\nTest Case 2:");
    System.out.println(fib.getFibo(11)); // should print 89
    System.out.println(fib.getFibo(16)); // should print 987
    System.out.println(fib.getFibo(51)); // should print -1 (out of range)

    // Test case 3: Small size Fibonacci sequence
    System.out.println("\nTest Case 3:");
    Unit14b_Fibonacci smallFib = new Unit14b_Fibonacci(1); // set size to 1
    System.out.println(smallFib.getFibo(1)); // should print 1
    System.out.println(smallFib.getFibo(2)); // should print -1 (out of range)

    Unit14b_Fibonacci twoFib = new Unit14b_Fibonacci(2); // set size to 2
    System.out.println(twoFib.getFibo(1)); // should print 1
    System.out.println(twoFib.getFibo(2)); // should print 1
    System.out.println(twoFib.getFibo(11)); // should print -1 (out of range)
  }
}
/*
Lab Goal : The lab was designed to teach you how to use arrays to simplify solving more complex
problems.
Lab Description : Generate a Fibonacci sequence. Each number in the Fibonacci sequence is the
sum of the two preceding numbers in the sequence. The first two numbers in the sequence are both 1. The
third number is 2 , the fourth number is 3, the fifth number is 5, and the sixth number is 8. The program should
be able to return a specified number in the fibo sequence. If a number is specified that is out of range, a -1
should be returned.
Sample Data :
set size to 50
1
2
3
4
5
6
11
16
21
31
41
46
set size to 1
1
set size to 2
1
2
11
Sample Output :
1
1
2
3
5
8
89
987
10946
1346269
165580141
1836311903
1
1
1
-1
 */

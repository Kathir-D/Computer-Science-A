//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit14b_Fibonacci {

  private int[] fibSequence;

  public Unit14b_Fibonacci(int size) {
    fibSequence = new int[size];
    generateFibonacci(size);
  }

  private void generateFibonacci(int size) {
    fibSequence[0] = 1;
    fibSequence[1] = 1;
    for (int i = 2; i < size; i++) {
      fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
    }
  }

  public int getFibo(int n) {
    if (n < 1 || n > fibSequence.length) {
      return -1;
    }
    return fibSequence[n - 1];
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int num : fibSequence) {
      sb.append(num).append(" ");
    }
    return sb.toString().trim();
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
 */

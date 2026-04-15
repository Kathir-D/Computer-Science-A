package CS22526.Labs.Unit12;

import java.util.LinkedList;
import java.util.PriorityQueue;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Queue;

public class ArrayReduction {

  public static int min_cost(int[] r) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int totalCost = 0;

    for (int value : r) {
      pq.add(value);
    }

    while (pq.size() > 1) {
      int first = pq.poll();
      int second = pq.poll();
      int merged = first + second;
      totalCost += merged;
      pq.add(merged);
    }

    return totalCost;
  }

  public static void main(String[] args) {
    int[] s0 = { 212 };
    System.out.println(ArrayReduction.min_cost(s0));

    int[] s1 = { 25, 10, 20 };
    System.out.println(ArrayReduction.min_cost(s1));

    int[] s2 = { 1, 2, 3 };
    System.out.println(ArrayReduction.min_cost(s2));

    int[] s3 = { 1, 2, 3, 4, 7, 22, 33, 54, -66, 3, 4, 5, 76, 7, 999 };
    System.out.println(ArrayReduction.min_cost(s3));

    int[] s4 = { 1, 1, 1, 1, 1 };
    System.out.println(ArrayReduction.min_cost(s4));

    int[] s5 = { 1, 1 };
    System.out.println(ArrayReduction.min_cost(s5));
  }
}
/* EXPECTED OUTPUT
 0
85
9
947
12
2
*/

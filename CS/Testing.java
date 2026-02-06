import java.io.*;
import java.util.*;

public class Testing {

  public static void main(String[] args) throws Exception {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    pq.add(10);
    System.out.printf(pq.toString() + "\n");
    pq.add(7);
    System.out.println(pq.toString() + "\n");
    pq.add(9);
    System.out.println(pq.toString() + "\n");
    pq.add(8);
    System.out.println(pq.toString() + "\n");
    pq.remove();
    System.out.println(pq.toString() + "\n");
    pq.offer(1);
    Queue<Integer> q = new LinkedList<Integer>();

    q.add(1);
    q.offer(10);
    System.out.println(q.toString() + "\n");
  }
}

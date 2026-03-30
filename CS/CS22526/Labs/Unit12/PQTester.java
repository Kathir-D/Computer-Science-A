package CS.CS22526.Labs.Unit12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Queue;

public class PQTester {

  private PriorityQueue<String> pQueue;

  public PQTester() {
    pQueue = new PriorityQueue<String>();
  }

  public PQTester(String list) {
    pQueue = new PriorityQueue<String>();
    setPQ(list);
  }

  public void setPQ(String list) {
    pQueue.clear();
    String[] items = list.split(" ");
    for (String item : items) {
      pQueue.add(item);
    }
  }

  public Object getMin() {
    if (pQueue.isEmpty()) return "";
    return pQueue.peek();
  }

  public String getNaturalOrder() {
    String output = "";
    PriorityQueue<String> temp = new PriorityQueue<String>(pQueue);
    while (!temp.isEmpty()) {
      output += temp.remove() + " ";
    }
    return output.trim();
  }

  public String toString() {
    return pQueue.toString();
  }
}

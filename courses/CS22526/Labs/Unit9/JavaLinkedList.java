package CS22526.Labs.Unit9;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;

public class JavaLinkedList {

  private LinkedList<Integer> list;

  public JavaLinkedList() {
    list = new LinkedList<Integer>();
  }

  public JavaLinkedList(int[] nums) {
    list = new LinkedList<Integer>();
    for (int num : nums) {
      list.add(num);
    }
  }

  public double getSum() {
    double total = 0;
    for (int num : list) {
      total += num;
    }
    return total;
  }

  public double getAvg() {
    return getSum() / list.size();
  }

  public int getLargest() {
    int largest = Integer.MIN_VALUE;

    for (int num : list) {
      if (num > largest) {
        largest = num;
      }
    }
    return largest;
  }

  public int getSmallest() {
    int smallest = Integer.MAX_VALUE;

    for (int num : list) {
      if (num < smallest) {
        smallest = num;
      }
    }
    return smallest;
  }

  public String toString() {
    String output = "";
    output += "SUM:: " + getSum() + "\n";
    output += "AVERAGE:: " + getAvg() + "\n";
    output += "SMALLEST:: " + getSmallest() + "\n";
    output += "LARGEST:: " + getLargest() + "\n";
    return output;
  }
}

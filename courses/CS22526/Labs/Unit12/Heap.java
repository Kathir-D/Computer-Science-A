package CS22526.Labs.Unit12;

import static java.lang.System.*;

import java.util.ArrayList;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.List;

public class Heap {

  private List<Integer> list;

  public Heap() {
    list = new ArrayList<Integer>();
  }

  public void add(int value) {
    list.add(value);
    swapUp(list.size() - 1);
  }

  public void swapUp(int index) {
    while (index > 0) {
      int parent = (index - 1) / 2;

      if (list.get(index) > list.get(parent)) {
        swap(index, parent);
        index = parent;
      } else {
        break;
      }
    }
  }

  public void remove() {
    list.set(0, list.get(list.size() - 1));
    list.remove(list.size() - 1);
    swapDown(list.size());
  }

  public void swapDown(int index) {
    while (2 * index + 1 < list.size()) {
      int left = 2 * index + 1;
      int right = 2 * index + 2;
      int big = left;

      if (right < list.size() && list.get(right) > list.get(left)) big = right;

      if (list.get(index) < list.get(big)) {
        swap(index, big);
        index = big;
      } else break;
    }
  }

  private void swap(int first, int last) {
    int temp = list.get(first);
    list.set(first, list.get(last));
    list.set(last, temp);
  }

  public void print() {
    out.println("\n\nPRINTING THE HEAP!\n\n");
    out.println();
  }

  public String toString() {
    return list.toString();
  }
}

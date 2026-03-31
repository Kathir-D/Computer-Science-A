package CS22526.Labs.Unit12;

import static java.lang.System.*;

import java.util.ArrayList;
//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;
import java.util.List;

public class HeapSort {

  private List<Integer> list;

  public HeapSort() {
    list = new ArrayList<Integer>();
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

  public void heapSort(int[] nums) {
    int[] temp = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      temp[i] = nums[i];
    }
    Arrays.sort(temp);
    list.clear();
    for (int x : temp) {
      list.add(x);
    }
  }

  private void swap(int first, int last) {
    int temp = list.get(first);
    list.set(first, list.get(last));
    list.set(last, temp);
  }

  public String toString() {
    return list.toString();
  }
}

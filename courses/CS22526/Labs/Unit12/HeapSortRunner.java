package CS22526.Labs.Unit12;

//(c) A+ Computer Science
//www.apluscompsci.com

public class HeapSortRunner {

  public static void main(String[] args) {
    HeapSort heap = new HeapSort();

    int[] nums = { 99, 2, 8, 75, 10, 7, 9, 17, 5, 3, 4, 1, 11, 1 };

    heap.heapSort(nums);

    System.out.println(heap);
  }
}

package CS22526.Labs.Unit1;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class MergeSortRunner {

  public static void main(String args[]) {
    Comparable[] arr1 = { 9, 5, 3, 2 };
    MergeSort.mergeSort(arr1);

    Comparable[] arr2 = { 19, 52, 3, 2, 7, 21 };
    MergeSort.mergeSort(arr2);

    Comparable[] arr3 = { 68, 66, 11, 2, 42, 31 };
    MergeSort.mergeSort(arr3);
  }
}

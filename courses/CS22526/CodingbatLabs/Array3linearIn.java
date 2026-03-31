package CS22526.CodingbatLabs;

public class Array3linearIn {

  public boolean linearIn(int[] outer, int[] inner) {
    int i = 0, o = 0; // pointers

    while (i < inner.length && o < outer.length) {
      if (inner[i] == outer[o]) { // if same, advance pointer by 1
        i++;
        o++;
      } else if (outer[o] < inner[i]) { // Since its already in order, if inner is greater its ahead so outer's pointer needs to increase to catch up
        o++;
      } else {
        break;
      }
    }

    return i == inner.length;
  }

  public static void main(String[] args) {
    Array3linearIn obj = new Array3linearIn();

    // Test case 1
    int[] outer1 = { 1, 2, 4, 6 };
    int[] inner1 = { 2, 4 };
    System.out.println(obj.linearIn(outer1, inner1)); // should return true

    // Test case 2
    int[] outer2 = { 1, 2, 4, 6 };
    int[] inner2 = { 2, 3, 4 };
    System.out.println(obj.linearIn(outer2, inner2)); // should return false

    // Test case 3
    int[] outer3 = { 1, 2, 4, 4, 6 };
    int[] inner3 = { 2, 4 };
    System.out.println(obj.linearIn(outer3, inner3)); // should return true
  }
}
/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.


linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */

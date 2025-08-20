package CS22526.CodingbatLabs;

public class Array3squareUp {

  public int[] squareUp(int n) {
    int[] arr = new int[n * n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int index = i * n + j; // [ [0,0,0], [0,0,0], [0,0,0] ] <-- i represents which box of 3 (multiply by n bc each box has n ints)
        // j represents which int inside the box of n (add j to get the index in the box)
        if (j < n - i - 1) {
          arr[index] = 0;
        } else {
          arr[index] = n - j;
        }
      }
    }

    return arr;
  }

  public static void main(String[] args) {
    Array3squareUp obj = new Array3squareUp();
    int[] result1 = obj.squareUp(3);
    int[] result2 = obj.squareUp(2);
    int[] result3 = obj.squareUp(4);

    System.out.println(java.util.Arrays.toString(result1)); // [0, 0, 1, 0, 2, 1, 3, 2, 1]
    System.out.println(java.util.Arrays.toString(result2)); // [0, 1, 2, 1]
    System.out.println(java.util.Arrays.toString(result3)); // [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
  }
}
/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */

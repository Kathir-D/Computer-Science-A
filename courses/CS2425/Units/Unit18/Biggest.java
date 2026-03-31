//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest {

  public static int getBig(int[][] m) {
    int max = Integer.MIN_VALUE;

    for (int[] row : m) {
      for (int num : row) {
        if (num > max) {
          max = num;
        }
      }
    }

    return max;
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a matrix, an array of arrays.
Lab Description : Take the given matrix and determine which value in the matrix is the biggest.
Sample Data :
{{1,2,3},{5,5,5,5}}
{{1,2,3},{-5},{11},{21,2}}
{{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}}
{{-20, -40},{-234,-234234 } }
Sample Output :
The biggest number is :: 5
The biggest number is :: 21
The biggest number is :: 123124
The biggest number is :: -20
 */

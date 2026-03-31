public class MatrixSumming1 {

  private static int[][] m = {
    { 1, 2, 3, 4, 5 },
    { 6, 7, 8, 9, 0 },
    { 6, 7, 1, 2, 5 },
    { 6, 7, 8, 9, 0 },
    { 5, 4, 3, 2, 1 },
  };

  public static int sum() {
    int sums = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        sums += m[i][j];
      }
    }
    return sums;
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a matrix, an array of arrays.
Lab Description : Take the given matrix and sum up all of the cells in the matrix.
Sample Data :
{1, 2, 3, 4, 5}
{6, 7, 8, 9, 0}
{6, 7, 1, 2, 5}
{6, 7, 8, 9, 0}
{5, 4, 3, 2, 1}
Sample Output :
The sum is :: 111
 */

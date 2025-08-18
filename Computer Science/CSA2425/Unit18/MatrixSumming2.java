//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixSumming2 {

  private int[][] m = {
    { 1, 2, 3, 4, 5 },
    { 6, 7, 8, 9, 0 },
    { 6, 7, 1, 2, 5 },
    { 6, 7, 8, 9, 0 },
    { 5, 4, 3, 2, 1 },
  };

  public String mReturn() {
    StringBuilder sb = new StringBuilder();

    for (int[] row : m) {
      for (int num : row) {
        sb.append(num + " ");
      }
      sb.append("\n");
    }

    return sb.toString();
  }

  public int sum(int r, int c) {
    int sum = 0;
    for (int i = r - 1; i <= r + 1; i++) {
      for (int j = c - 1; j <= c + 1; j++) {
        if (i >= 0 && i < m.length && j >= 0 && j < m[i].length) {
          sum += m[i][j];
        }
      }
    }
    return sum;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int[] row : m) {
      for (int val : row) {
        sb.append(val).append(" ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a matrix, an array of arrays.
Lab Description : Load in the provided matrix and then sum up all of the cells around the provided cell
locations. Include the value of the provided location as well as all of the cells within 1 cell of the provided cell.
1, 2, 3, 4, 5
6, 7, 8, 9, 0
6, 7, 1, 2, 5
6, 7, 8, 9, 0
5, 4, 3, 2, 1
The sum of 0,0 is 16.
The sum of 1,1 is 41.
Sample Data :
2 2
0 0
4 3
4 4
2 4
1 3
Sample Output :
Matrix values
1 2 3 4 5
6 7 8 9 0
6 7 1 2 5
6 7 8 9 0
5 4 3 2 1
The sum of 2,2 is 58.
The sum of 0,0 is 16.
The sum of 4,3 is 23.
The sum of 4,4 is 12.
The sum of 2,4 is 25.
The sum of 1,3 is 37.
 */

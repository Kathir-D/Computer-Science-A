//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SpiralMatrix {

  private int[][] matrix;
  private int size;

  public SpiralMatrix() {
    this.size = 0;
  }

  public SpiralMatrix(int size) {
    setSize(size);
  }

  public void setSize(int size) {
    this.size = size;
    matrix = new int[size][size];
    createSpiral();
  }

  public void createSpiral() {
    int value = 1;
    int minRow = 0, maxRow = size - 1;
    int minCol = 0, maxCol = size - 1;

    while (value <= size * size) {
      for (int i = minCol; i <= maxCol; i++) {
        matrix[minRow][i] = value++;
      }
      minRow++;
      for (int i = minRow; i <= maxRow; i++) {
        matrix[i][maxCol] = value++;
      }
      maxCol--;
      for (int i = maxCol; i >= minCol; i--) {
        matrix[maxRow][i] = value++;
      }
      maxRow--;
      for (int i = maxRow; i >= minRow; i--) {
        matrix[i][minCol] = value++;
      }
      minCol++;
    }
  }

  public String toString() {
    StringBuilder output = new StringBuilder();
    for (int[] row : matrix) {
      for (int num : row) {
        output.append(num).append(" ");
      }
      output.append("\n");
    }
    return output.toString();
  }
}
/*
Lab Goal : The lab was designed to help you review classes, objects, files, arrays, and matrices.
Lab Description : Take each number and print a spiral matrix that size.
Sample Data :
8
7
3
2
1
Sample Output :
1 16 15 14 13
2 17 24 23 12
3 18 25 22 11
4 19 20 21 10
5 6 7 8 9
1 28 27 26 25 24 23 22
2 29 48 47 46 45 44 21
3 30 49 60 59 58 43 20
4 31 50 61 64 57 42 19
5 32 51 62 63 56 41 18
6 33 52 53 54 55 40 17
7 34 35 36 37 38 39 16
8 9 10 11 12 13 14 15
1 24 23 22 21 20 19
2 25 40 39 38 37 18
3 26 41 48 47 36 17
4 27 42 49 46 35 16
5 28 43 44 45 34 15
6 29 30 31 32 33 14
7 8 9 10 11 12 13
1 8 7
2 9 6
3 4 5
1 4
2 3
1
algorithm help
You must fill the matrix by going
DOWN, OVER(left to right), UP,
and OVER(right to left).
D
D
D
D O O O
do
for loop to down
for loop for over
for loop for up
for loop for across
while
 */

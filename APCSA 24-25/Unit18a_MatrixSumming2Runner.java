//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Unit18a_MatrixSumming2Runner {

  public static void main(String args[]) throws IOException {
    Scanner file = new Scanner(new File("APCSA 24-25/Unit18a_matsum.dat"));
    Unit18a_MatrixSumming2 matrix = new Unit18a_MatrixSumming2();
    int rows = file.nextInt();

    System.out.println("Matrix values");
    System.out.println(matrix.mReturn());

    for (int i = 0; i < rows; i++) {
      int r = file.nextInt();
      int c = file.nextInt();
      System.out.println(
        "The sum of " + r + "," + c + " is " + matrix.sum(r, c) + "."
      );
    }

    file.close();
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

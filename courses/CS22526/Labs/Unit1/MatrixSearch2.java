package CS22526.Labs.Unit1;

import java.io.*;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class MatrixSearch2 {

  private int[][] mat;

  public MatrixSearch2(int rows, int cols, int upper) {
    mat = new int[rows][cols];
    Random rand = new Random();

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        mat[row][col] = rand.nextInt(upper) + 1;
      }
    }
  }

  /*
   *findMaxPrime() will return the prime that has the largest surrounding sum
   */
  public int findMaxPrime() {
    int sum = 0;
    int cnt = 0;
    int max = 0;

    for (int row = 0; row < mat.length; row++) {
      for (int col = 0; col < mat[row].length; col++) {
        if (isPrime(mat[row][col])) {
          sum = getCountRndCell(row, col);
          if (sum > cnt) {
            max = mat[row][col];
            cnt = sum;
          }
        }
      }
    }

    return max;
  }

  public int getCountRndCell(int r, int c) {
    int cnt = 0;

    for (int row = 0; row < mat.length; row++) {
      for (int col = 0; col < mat[row].length; col++) {
        if (inBounds(r, c) && isPrime(mat[r][c])) {
          cnt++;
        }
      }
    }

    return cnt;
  }

  private boolean inBounds(int r, int c) {
    if (r >= 0 && r < mat.length && c >= 0 && c < mat[r].length) {
      return true;
    }
    return false;
  }

  private boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }

  public String toString() {
    String output = "";
    for (int row = 0; row < mat.length; row++) {
      for (int col = 0; col < mat[row].length; col++) {
        output += String.format("%4d", mat[row][col]);
      }
      output += "\n";
    }
    return output;
  }
}

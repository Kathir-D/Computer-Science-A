package CS22526.Labs.Unit1;

import java.io.*;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class MatrixSearch {

  private int[][] mat;

  /*
   *pre - mat is null
   *post - mat will be rows X cols
   *post - mat will contain integers that are <= upper and >= 1
   */
  public MatrixSearch(int rows, int cols, int upper) {
    mat = new int[rows][cols];
    Random rand = new Random();

    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        mat[row][col] = rand.nextInt(upper) + 1;
      }
    }
  }

  /*
   *pre - mat is not null
   *post - count of odd numbers will be returned
   *post - no values in mat will have been changed
   */
  public int countOdds() {
    int cnt = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] % 2 != 0) {
          cnt++;
        }
      }
    }

    return cnt;
  }

  /*
   *pre - mat is not null
   *post - count of even numbers will be returned
   *post - no values in mat will have been changed
   */
  public int countEvens() {
    int cnt = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] % 2 == 0) {
          cnt++;
        }
      }
    }

    return cnt;
  }

  /*
   *pre - mat is not null
   *post - count of prime numbers will be returned
   *post - no values in mat will have been changed
   */
  public int countPrimes() {
    int cnt = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (isPrime(mat[i][j])) {
          cnt++;
        }
      }
    }

    return cnt;
  }

  /*
   *pre - num has a value
   *post - false is returned if num is divisble by any number between 2 and itself
   *post - true is returned if num is not divisble by any number between 2 and itself
   */
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

  /*
   *pre - mat is not null
   *post - all values from mat are concatenated to a string and returned
   */
  public String toString() {
    String output = "";
    for (int row = 0; row < mat.length; row++) {
      for (int col = 0; col < mat[row].length; col++) {
        output += String.format("%4d", mat[row][col]);
      }
      output += "\n";
    }

    return (
      output +
      "\nOdds = " +
      countOdds() +
      "\nEvens = " +
      countEvens() +
      "\nPrimes = " +
      countPrimes()
    );
  }
}

package CS22526.Labs.Unit1;

import static java.lang.System.*;

import java.io.*;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class MatrixSearch2Runner {

  public static void main(String args[]) throws Exception {
    // Test case 1: 20 rows, 15 columns, max value 50
    MatrixSearch2 test1 = new MatrixSearch2(20, 15, 50);
    System.out.println(test1);
    System.out.println("Max Prime = " + test1.findMaxPrime());

    // Test case 2: 15 rows, 15 columns, max value 75
    MatrixSearch2 test2 = new MatrixSearch2(15, 15, 75);
    System.out.println(test2);
    System.out.println("Max Prime = " + test2.findMaxPrime());

    // Test case 3: 7 rows, 7 columns, max value 100
    MatrixSearch2 test3 = new MatrixSearch2(7, 7, 100);
    System.out.println(test3);
    System.out.println("Max Prime = " + test3.findMaxPrime());
  }
}

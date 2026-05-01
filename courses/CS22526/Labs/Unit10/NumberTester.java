package CS22526.Labs.Unit10;

import java.io.*;
import java.util.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class NumberTester {

  public static void main(String[] args) {
    try (
      Scanner fileScanner = new Scanner(
        new File("courses/CS22526/Labs/Unit10/numbers.dat")
      )
    ) {
      try {
        int val1 = fileScanner.nextInt();
        if (val1 < 0) throw new Exception(
          val1 + " is invalid. Only positive numbers are allowed."
        );
        System.out.println(new Number(val1).hashCode());

        int val2 = fileScanner.nextInt();
        if (val2 < 0) throw new Exception(
          val2 + " is invalid. Only positive numbers are allowed."
        );
        System.out.println(new Number(val2).hashCode());

        int val3 = fileScanner.nextInt();
        if (val3 < 0) throw new Exception(
          val3 + " is invalid. Only positive numbers are allowed."
        );
        System.out.println(new Number(val3).hashCode());
      } catch (InputMismatchException e) {
        System.out.println("Error: data contains non-integer values.");
      } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
      } finally {
        System.out.println("Number processing complete.");
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: data file was not found.");
    }
  }
}

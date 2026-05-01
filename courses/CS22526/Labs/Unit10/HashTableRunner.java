package CS22526.Labs.Unit10;

import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HashTableRunner {

  public static void main(String[] args) {
    try (
      Scanner numIn = new Scanner(
        new File("courses/CS22526/Labs/Unit10/numbers.dat")
      )
    ) {
      try {
        HashTable numberTable = new HashTable();

        int size = numIn.nextInt();
        if (size < 0) throw new Exception(
          size + " is invalid. Number must be positive "
        );

        for (int i = 0; i < size; i++) {
          int value = numIn.nextInt();
          if (value < 0) throw new Exception(
            value + " is invalid. Number must be positive "
          );
          numberTable.add(new Number(value));
        }

        out.println(numberTable);
      } catch (InputMismatchException e) {
        out.println("Error: data contains non-integer values.");
      } catch (NoSuchElementException e) {
        out.println(
          "Error: numbers.dat ended before all expected integer values were read."
        );
      } catch (Exception e) {
        out.println("Error: " + e.getMessage());
      } finally {
        out.println("Hash table processing complete.");
      }
    } catch (FileNotFoundException e) {
      out.println("Error: data file not found.");
    }
  }
}

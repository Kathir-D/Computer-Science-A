//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

package CS22526.Labs.Unit4;

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OddRunner {

  public static void main(String args[]) throws IOException {
    //more test cases
    String[] testCases = {
      "1 5 9 4 6 8 12",
      "3 5 7 17 29 4 6 56 72",
      "3 6 12 2 28 6",
      "4 4 4 4 4 4 4 4",
      "1 1 1 1 1 1 1 1",
      "1 2 3 4 5 6 7 8 9",
    };

    for (String line : testCases) {
      OddEvenSets testcase = new OddEvenSets(line);
      System.out.print(testcase);
    }
  }
}

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
    Scanner file = new Scanner(new File("CS/CS22526/Labs/Unit4/oddevent.dat"));

    while (file.hasNextLine()) {
      String line = file.nextLine();
      OddEvenSets testcase = new OddEvenSets(line);
      System.out.print(testcase);
    }

    file.close();
  }
}

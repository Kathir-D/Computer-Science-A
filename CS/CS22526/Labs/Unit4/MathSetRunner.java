//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package CS22526.Labs.Unit4;

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MathSetRunner {

  public static void main(String args[]) throws IOException {
    Scanner file = new Scanner(
      new File("CS/CS22526/Labs/Unit4/mathsetdata.dat")
    );

    while (file.hasNextLine()) {
      String line = file.nextLine();
      if (file.hasNextLine()) {
        String line2 = file.nextLine();
        MathSet testcase = new MathSet(line, line2);
        System.out.print(testcase);
        System.out.println("union - " + testcase.union());
        System.out.println("intersection - " + testcase.intersection());
        System.out.println("difference A-B - " + testcase.differenceAMinusB());
        System.out.println("difference B-A - " + testcase.differenceBMinusA());
        System.out.println(
          "symmetric difference - " + testcase.symmetricDifference()
        );
        System.out.println();
      }
    }

    file.close();
  }
}

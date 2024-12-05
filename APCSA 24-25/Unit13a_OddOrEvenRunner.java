//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Unit13a_OddOrEvenRunner {

  public static void main(String args[]) throws IOException {
    Scanner file = new Scanner(new File("APCSA 24-25/Unit13a_oddoreven.dat"));
    int size = file.nextInt();
    file.nextLine();

    for (int i = 0; i < size; i++) {
      int num = file.nextInt();
      Unit13a_OddOrEven oddOrEven = new Unit13a_OddOrEven(num);
      oddOrEven.checkOddOrEven();
    }
  }
}

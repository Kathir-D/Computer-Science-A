package CS22526.Labs.Unit5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RelativesRunner {

  public static void main(String args[]) throws IOException {
    Scanner file = new Scanner(new File("CS/CS22526/Labs/Unit5/relatives.dat"));
    Relatives relatives = new Relatives();
    int times = file.nextInt();
    file.nextLine();

    for (int i = 0; i < times; i++) {
      relatives.setPersonRelative(file.nextLine());
    }

    file.close();
    out.println(relatives);
  }
}

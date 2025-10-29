package CS22526.Labs.Unit5;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SpanRunner {

  public static void main(String args[]) throws IOException {
    SpanishToEnglish span = new SpanishToEnglish();
    Scanner file = new Scanner(new File("CS/CS22526/Labs/Unit5/spantoeng.dat"));

    int numPairs = file.nextInt();
    file.nextLine();

    for(int i = 0; i < numPairs; i++) {
      span.putEntry(file.nextLine());
    }

    while(file.hasNextLine()) {
      String sentence = file.nextLine();
      System.out.println(span.translate(sentence));
    }

    file.close();
  }
}

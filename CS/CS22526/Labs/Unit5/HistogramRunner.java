package CS22526.Labs.Unit5;

//(c) A+ Computer Science
//www.apluscompsci.com

import java.io.*;
import java.util.Scanner;

public class HistogramRunner {

  public static void main(String args[]) throws IOException {
    Scanner file = new Scanner(new File("CS/CS22526/Labs/Unit5/histogram.dat"));

    while (file.hasNextLine()) {
      String line = file.nextLine();
      Histogram hist = new Histogram(line);
      System.out.println(hist);
    }

    file.close();
  }
}

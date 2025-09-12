package CS22526.Labs.Unit2;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.*;
import java.util.*;

public class WordRunnerLab2 {

  public static void main(String args[]) throws IOException {
    try {
      Scanner file = new Scanner(new File("CS/CS22526/Labs/Unit2/word.dat"));

      int numWords = file.nextInt();
      file.nextLine();

      ArrayList<WordLab2> words = new ArrayList<>();

      for (int i = 0; i < numWords; i++) {
        String word = file.nextLine().trim();
        if (!word.isEmpty()) {
          words.add(new WordLab2(word));
        }
      }

      System.out.println("Original list:");
      for (WordLab2 word : words) {
        System.out.println(word);
      }

      Collections.sort(words);

      System.out.println("\nSorted list:");
      for (WordLab2 word : words) {
        System.out.println(word);
      }

      file.close();
    } catch (IOException e) {
      System.out.println("File not found: " + e.getMessage());
    }
  }
}

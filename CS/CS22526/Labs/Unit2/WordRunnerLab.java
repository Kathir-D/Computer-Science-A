package CS22526.Labs.Unit2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.*;
import java.util.*;

public class WordRunnerLab {

  public static void main(String[] args) {
    try {
      Scanner file = new Scanner(new File("CS/CS22526/Labs/Unit2/words.dat"));

      int numWords = file.nextInt();
      file.nextLine();

      ArrayList<WordLab> words = new ArrayList<>();

      for (int i = 0; i < numWords; i++) {
        String word = file.nextLine().trim();
        if (!word.isEmpty()) {
          words.add(new WordLab(word));
        }
      }

      System.out.println("Original list:");
      for (WordLab word : words) {
        System.out.println(word);
      }

      Collections.sort(words);

      System.out.println("\nSorted list:");
      for (WordLab word : words) {
        System.out.println(word);
      }

      file.close();
    } catch (IOException e) {
      System.out.println("File not found: " + e.getMessage());
    }
  }
}

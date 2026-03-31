package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Unit16b_MadLib {

  // idfk

  private ArrayList<String> verbs;
  private ArrayList<String> nouns;
  private ArrayList<String> adjectives;

  public Unit16b_MadLib() {
    verbs = new ArrayList<>();
    nouns = new ArrayList<>();
    adjectives = new ArrayList<>();
  }

  public Unit16b_MadLib(String fileName) {
    this();
    try {
      Scanner file = new Scanner(new File(fileName));
      while (file.hasNextLine()) {
        String line = file.nextLine();
        if (line.startsWith("VERB:")) {
          verbs.add(line.substring(5).trim());
        } else if (line.startsWith("NOUN:")) {
          nouns.add(line.substring(5).trim());
        } else if (line.startsWith("ADJECTIVE:")) {
          adjectives.add(line.substring(10).trim());
        }
      }
      file.close();
    } catch (Exception e) {
      out.println("Houston we have a problem!");
    }
  }

  public void loadNouns(String fileName) {
    loadWords(fileName, nouns);
  }

  public void loadVerbs(String fileName) {
    loadWords(fileName, verbs);
  }

  public void loadAdjectives(String fileName) {
    loadWords(fileName, adjectives);
  }

  private void loadWords(String fileName, ArrayList<String> list) {
    try {
      Scanner file = new Scanner(new File(fileName));
      while (file.hasNextLine()) {
        list.add(file.nextLine().trim());
      }
      file.close();
    } catch (Exception e) {
      out.println("Houston we have a problem!");
    }
  }

  public String getRandomVerb() {
    return getRandomWord(verbs);
  }

  public String getRandomNoun() {
    return getRandomWord(nouns);
  }

  public String getRandomAdjective() {
    return getRandomWord(adjectives);
  }

  private String getRandomWord(ArrayList<String> list) {
    if (list.isEmpty()) {
      return "";
    }
    int index = (int) (Math.random() * list.size());
    return list.get(index);
  }

  public String toString() {
    return (
      "nouns = " +
      nouns +
      "\n" +
      "verbs = " +
      verbs +
      "\n" +
      "adjectives = " +
      adjectives
    );
  }
}
/*
Lab Goal : This lab was designed to teach you more about ArrayList, Math.random(), and file input.
Lab Description : Create a Mad Lib program that reads in lists of nouns, adjectives, and verbs as well
as a story and prints out a Mad Lib. Come up with your own Mad Lib to make it more interesting.
 */

package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Unit16b_MadLibRunner {

  public static void main(String args[]) {
    Unit16b_MadLib madLib = new Unit16b_MadLib("madlib_data.txt");
    madLib.loadNouns("CSA2425/Unit16b_nouns.dat");
    madLib.loadVerbs("CSA2425/Unit16b_verbs.dat");
    madLib.loadAdjectives("CSA2425/Unit16b_adjectives.dat");

    out.println("Here is your Mad Lib story:");
    out.println(
      "Once upon a time, there was a " +
      madLib.getRandomAdjective() +
      " " +
      madLib.getRandomNoun() +
      " who loved to " +
      madLib.getRandomVerb() +
      "."
    );
  }
}
/*
Lab Goal : This lab was designed to teach you more about ArrayList, Math.random(), and file input.
Lab Description : Create a Mad Lib program that reads in lists of nouns, adjectives, and verbs as well
as a story and prints out a Mad Lib. Come up with your own Mad Lib to make it more interesting.
 */

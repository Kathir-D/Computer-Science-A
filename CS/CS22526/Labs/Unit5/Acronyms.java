package CS22526.Labs.Unit5;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.HashMap;

public class Acronyms {

  private HashMap<String, String> acronymTable;
  private String strings;

  public Acronyms() {
    strings = "";
    String table =
      "TSO - Texas State Optical\n" +
      "PDA - Personal Display of Affection\n" +
      "RBI - Runs Batted In\n" +
      "SO - Strike Out\n" +
      "FG - Field Goal\n" +
      "CPU - Central Processing Unit\n" +
      "HD - Hard Drive\n" +
      "PU - Pick Up";
    acronymTable = new HashMap<>();

    String[] x = table.split("\n");
    for (String entry : x) {
      putEntry(entry);
    }

    convert("I drove my PU to TSO to get a HD.  My CPU has a virus.\n"
        + "I sometimes SO when trying to kick a FG.  I had 2 RBI\n"
        + "at the game.  I saw 2 PDA infractions in the hall.\n");

    toString();

  }

  public void putEntry(String entry) {
    String[] parts = entry.split(" - ");
      String acronym = parts[0].trim();
      String meaning = parts[1].trim();
      acronymTable.put(acronym, meaning);
  }

  public void convert(String sent) {
    String output = "";
    String[] split = sent.trim().split(" ");

    for(int i = 0; i < split.length; i++) {
      if(acronymTable.containsKey(split[i])){
        output += " " + acronymTable.get(split[i]);
      } else {
        output += " " + split[i];
      }
    }

    strings = output.toString();
  }

  public String toString() {
    return strings;
  }
}

package CS22526.Labs.Unit5;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SpanishToEnglish {

  private Map<String, String> pairs;
  private String strings;

  public SpanishToEnglish() {
    pairs = new TreeMap<>();
    strings = "";
  }

  public void putEntry(String entry) {
    String[] parts = entry.split(" ");
    String spanish = parts[0].trim();
    String english = parts[1].trim();
    pairs.put(spanish, english);
  }

  public String translate(String sent) {
    String output = "";
    String[] split = sent.trim().split(" ");

    for(int i = 0; i < split.length; i++) {
      if(pairs.containsKey(split[i])){
        output += " " + pairs.get(split[i]);
      } else {
        output += " " + split[i];
      }
    }

    strings = output.toString();
    return output;
  }

  public String toString() {
    return strings;
  }
}

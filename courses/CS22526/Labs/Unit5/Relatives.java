package CS22526.Labs.Unit5;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Relatives {

  private Map<String, Set<String>> map;

  public Relatives() {
    map = new HashMap<String, Set<String>>();
  }

  public void setPersonRelative(String line) {
    String[] personRelative = line.split(" ");
    Set<String> relatives = map.get(personRelative[0]);

    if (relatives == null) {
      relatives = new TreeSet<String>();
      map.put(personRelative[0], relatives);
    }

    relatives.add(personRelative[1].toString());
  }

  public Set<String> getRelatives(String person) {
    return map.get(person);
  }

  public String toString() {
    String output = "";
    for (String s : map.keySet()) {
      output += s + " is related to " + getRelatives(s).toString() + "\n";
    }

    return output;
  }
}

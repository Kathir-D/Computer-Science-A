package CS22526.Labs.Unit5;

import java.util.Map;
//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;
import java.util.TreeMap;

public class Histogram {

  private Map<String, Integer> histogram;

  public Histogram(String line) {
    histogram = new TreeMap<String, Integer>();
    String[] arr = line.trim().split("\\s+");

    for (String s : arr) histogram.put(s, histogram.getOrDefault(s, 0) + 1);
  }

  public int getValue(String s) {
    return histogram.getOrDefault(s, 0);
  }

  public String toString() {
    String output = "";
    String allStars = "";

    for (String key : histogram.keySet()) {
      if (histogram.get(key) > 1) {
        allStars += key + " count = " + histogram.get(key) + "\n";
      }
    }

    return allStars;
  }
}

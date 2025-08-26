package CS22526.Labs.Unit1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.*;
import java.util.*;

public class WordSearchRunner {

  public static void main(String[] args) throws Exception {
    WordSearch ms = new WordSearch(
      8,
      "APPLEXYPXLHJKEEDEGGLLXXCGFPDGOGNMYNTAHUUPUQDGBTSBTHIGHMSILKXLTHIS"
    );

    String[] words =
      "APPLE AXE APEX CAT HEX EGG HAT COMPUTER GUM THIS TUG THIGH".split(" ");
    System.out.println(ms);
    for (String s : words) {
      if (ms.isFound(s)) {
        System.out.println(s + " was found in the matrix.");
      } else {
        System.out.println(s + " was not found in the matrix.");
      }
    }
  }
}

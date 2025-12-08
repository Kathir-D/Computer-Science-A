//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PartList {

  private TreeMap<Part, Integer> partsMap;

  public PartList() {}

  public PartList(String fileName) {
    this();
    try {
      Scanner file = new Scanner(new File("lab08d.dat"));
      //add code here to read from the file
      //and add Parts to the map

    } catch (IOException e) { //Most specific exceptions must be listed 1st
      out.println(e);
    } catch (RuntimeException e) {
      out.println(e);
    } catch (Exception e) {
      out.println(e);
    } finally {
      //no code needed here
    }
  }

  public String toString() {
    String output = "";

    return output;
  }
}

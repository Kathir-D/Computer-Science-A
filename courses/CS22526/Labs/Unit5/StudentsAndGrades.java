package CS22526.Labs.Unit5;

import java.io.*;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class StudentsAndGrades {

  private Map<Integer, Set<String>> map;

  public StudentsAndGrades() {
    map = new TreeMap<Integer, Set<String>>();
  }

  public void setStudent(String line) {
    String[] parts = line.split(" ");
    int grade = Integer.parseInt(parts[1]);
    map.putIfAbsent(grade, new TreeSet<String>());
    map.get(grade).add(parts[0]);
  }

  public String getNames(Integer grade) {
    return map.get(grade).toString();
  }

  public String toString() {
    String output = "";
    for (Integer grade : map.keySet()) {
      output += grade + " " + map.get(grade) + "\n";
    }

    return output;
  }
}

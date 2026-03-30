package CS.CS22526.Labs.Unit10;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;

public class HashTable {

  private final LinkedList<Object>[] table;

  public HashTable() {
    table = new LinkedList[10];
    for (int i = 0; i < table.length; i++) {
      table[i] = new LinkedList<>();
    }
  }

  public void add(Object obj) {
    int index = Math.abs(obj.hashCode() % table.length);
    if (!table[index].contains(obj)) {
      table[index].add(obj);
    }
  }

  public String toString() {
    StringBuilder output = new StringBuilder("HASHTABLE\n");
    for (int i = 0; i < table.length; i++) {
      output.append("bucket ").append(i).append(" ");
      for (Object obj : table[i]) {
        output.append(obj).append(" ");
      }
      output.append("\n");
    }
    return output.toString();
  }
}

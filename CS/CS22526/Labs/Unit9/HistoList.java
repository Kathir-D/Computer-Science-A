package CS22526.Labs.Unit9;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;

public class HistoList {

  private HistoNode front;
  private ListNode frontGeneric;

  public HistoList() {
    front = null;
    frontGeneric = null;
  }

  public void addLetter(char let) {
    int index = indexOf(let);
    if (index == -1) {
      front = new HistoNode(let, 1, front);
    } else {
      HistoNode node = nodeAtChar(index);
      node.setLetterCount(node.getLetterCount() + 1);
    }
  }

  public int indexOf(char let) {
    HistoNode current = front;
    int index = 0;
    while (current != null) {
      if (current.getLetter() == let) {
        return index;
      }
      current = current.getNext();
      index++;
    }
    return -1;
  }

  private HistoNode nodeAtChar(int spot) {
    HistoNode current = front;
    for (int i = 0; i < spot && current != null; i++) {
      current = current.getNext();
    }
    return current;
  }

  public String toString() {
    String output = "";
    if (frontGeneric != null) {
      ListNode current = frontGeneric;
      while (current != null) {
        ThingCount tc = (ThingCount) current.getValue();
        output += tc.toString();
        if (current.getNext() != null) {
          output += " ";
        }
        current = current.getNext();
      }
      return output + "\n";
    }
    HistoNode current = front;
    while (current != null) {
      output += current.getLetter() + " - " + current.getLetterCount();
      if (current.getNext() != null) {
        output += " ";
      }
      current = current.getNext();
    }
    return output + "\n";
  }

  public void add(Object obj) {
    if (frontGeneric != null) {
      ThingCount firstTC = (ThingCount) frontGeneric.getValue();
      if (firstTC.getThing().getClass() != obj.getClass()) {
        throw new RuntimeException("both objects are not of the same type");
      }
    }
    
    int index = indexOf(obj);
    if (index == -1) {
      ThingCount tc = new ThingCount(obj, 1);
      frontGeneric = new ListNode(tc, frontGeneric);
    } else {
      // Object exists, increment count
      ListNode node = nodeAt(index);
      ThingCount tc = (ThingCount) node.getValue();
      tc.setCount(tc.getCount() + 1);
    }
  }

  public int indexOf(Object obj) {
    ListNode current = frontGeneric;
    int index = 0;
    while (current != null) {
      ThingCount tc = (ThingCount) current.getValue();
      if (tc.equals(obj)) {
        return index;
      }
      current = current.getNext();
      index++;
    }
    return -1;
  }

  private ListNode nodeAt(int spot) {
    ListNode current = frontGeneric;
    for (int i = 0; i < spot && current != null; i++) {
      current = current.getNext();
    }
    return current;
  }
}

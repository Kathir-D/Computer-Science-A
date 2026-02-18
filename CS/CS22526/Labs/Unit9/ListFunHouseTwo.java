package CS22526.Labs.Unit9;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouseTwo {

  private ListNode theList;

  public ListFunHouseTwo() {}

  public void add(Comparable data) {
    if (theList == null) {
      theList = new ListNode(data, null);
    } else {
      ListNode curr = theList;
      while (curr.getNext() != null) {
        curr = curr.getNext();
      }
      curr.setNext(new ListNode(data, null));
    }
  }

  //this method will return the number of nodes present in list
  public int nodeCount() {
    int count = 0;
    ListNode curr = theList;
    while (curr != null) {
      count++;
      curr = curr.getNext();
    }
    return count;
  }

  //this method will create a new node with the same value as the first node and add this
  //new node at the front of the list.  Once finished, the first node will occur twice.
  public void doubleFirst() {
    if (theList != null) {
      ListNode newNode = new ListNode(theList.getValue(), theList);
      theList = newNode;
    }
  }

  //this method will create a new node with the same value as the last node and add this
  //new node at the end.  Once finished, the last node will occur twice.
  public void doubleLast() {
    if (theList != null) {
      ListNode curr = theList;
      while (curr.getNext() != null) {
        curr = curr.getNext();
      }
      ListNode newNode = new ListNode(curr.getValue(), null);
      curr.setNext(newNode);
    }
  }

  // curr : 1 -> 2 -> 3 -> null
  // makes new node: 3 -> null
  // updated curr: 1 -> 2 -> 3 -> 3 -> null

  //method skipEveryOther will remove every other node
  public void skipEveryOther() {
    ListNode curr = theList;
    while (curr != null && curr.getNext() != null) {
      curr.setNext(curr.getNext().getNext());
      curr = curr.getNext();
    }
  }

  //this method will set the value of every xth node in the list
  public void setXthNode(int x, Comparable value) {
    int count = 1;
    ListNode curr = theList;
    while (curr != null) {
      if (count % x == 0) {
        curr.setValue(value);
      }
      count++;
      curr = curr.getNext();
    }
  }

  //this method will remove every xth node in the list
  public void removeXthNode(int x) {
    if (theList == null) return;

    int count = 1;
    if (count % x == 0) {
      theList = theList.getNext();
      count++;
    }

    ListNode prev = theList;
    ListNode curr = theList == null ? null : theList.getNext();
    count = 2;

    while (curr != null) {
      if (count % x == 0) {
        prev.setNext(curr.getNext());
        curr = curr.getNext();
      } else {
        prev = curr;
        curr = curr.getNext();
      }
      count++;
    }
  }

  //this method will return a String containing the entire list
  public String toString() {
    String output = "";
    ListNode curr = theList;
    while (curr != null) {
      output += curr.getValue() + " ";
      curr = curr.getNext();
    }
    return output;
  }
}

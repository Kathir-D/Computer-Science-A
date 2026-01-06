package CS22526.Labs.Unit7;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;

public class IntStack {

  //pick your storage for the stack
  //you can use the an array or an ArrayList

  //option 1
  private int[] rayOfInts;
  private int numInts;

  //option 2
  private ArrayList<Integer> stack;

  public IntStack() {
    stack = new ArrayList<Integer>();
  }

  public void push(int item) {
    stack.add(item);
  }

  public int pop() {
    int size = stack.size();
    int pops = stack.get(size - 1);
    stack.remove(size - 1);
    return pops;
  }

  public boolean isEmpty() {
    if (stack.size() == 0) {
      return true;
    }
    return false;
  }

  public int peek() {
    int size = stack.size();
    return stack.get(size - 1);
  }

  public String toString() {
    return stack.toString();
  }
}

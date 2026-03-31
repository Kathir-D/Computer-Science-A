package CS22526.Labs.Unit8;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;

public class IntQueueRunner {

  public static void main(String[] args) {
    IntQueue test = new IntQueue();
    test.add(5);
    test.add(7);
    test.add(9);
    System.out.println(test);
    System.out.println(test.isEmpty());
    System.out.println(test.remove());
    System.out.println(test.peek());
    System.out.println(test.remove());
    System.out.println(test.remove());
    System.out.println(test.isEmpty());
    System.out.println(test);
  }
}

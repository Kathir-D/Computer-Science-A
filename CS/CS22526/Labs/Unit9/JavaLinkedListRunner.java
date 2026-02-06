package CS22526.Labs.Unit9;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;

public class JavaLinkedListRunner {

  public static void main(String[] args) {
    JavaLinkedList test = new JavaLinkedList(
      new int[] { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 }
    );
    out.println(test);

    test = new JavaLinkedList(
      new int[] { 24, 75, 86, 37, 82, 94, 111, 82, 43 }
    );
    out.println(test);

    test = new JavaLinkedList(new int[] { 0, 4, 5, 2, 1, 4, 6 });
    out.println(test);
  }
}

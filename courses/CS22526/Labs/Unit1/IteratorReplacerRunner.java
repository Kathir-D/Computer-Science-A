package CS22526.Labs.Unit1;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IteratorReplacerRunner {

  public static void main(String[] args) {
    IteratorReplacer test = new IteratorReplacer("a b c a b c a", "a", "+");
    test.replace();
    out.println(test);

    test.setEmAll("a b c d e f g h i j x x x x x", "x", "7");
    test.replace();
    out.println(test);

    test.setEmAll("1 2 3 4 5 6 a b c a b c b", "b", "#");
    test.replace();
    out.println(test);
  }
}

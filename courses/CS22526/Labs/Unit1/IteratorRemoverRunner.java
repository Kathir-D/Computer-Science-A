package CS22526.Labs.Unit1;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorRemoverRunner {

  public static void main(String[] args) {
    IteratorRemover test = new IteratorRemover("a b c a b c a a", "a");
    test.remove();
    out.println(test);

    test.setTest("a b c d e f g h i j x x x x x", "x");
    test.remove();
    out.println(test);

    test.setTest("1 2 3 4 5 6 a b c a b c b", "b");
    test.remove();
    out.println(test);
  }
}

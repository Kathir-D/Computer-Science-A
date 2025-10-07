//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package CS22526.Labs.Unit4;

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MathSet {

  private Set<Integer> one;
  private Set<Integer> two;

  public MathSet() {
    one = new TreeSet<Integer>();
    two = new TreeSet<Integer>();
  }

  public MathSet(String o, String t) {
    super();
    one = new TreeSet<Integer>();
    two = new TreeSet<Integer>();
  }

  public Set<Integer> union() {
    return null;
  }

  public Set<Integer> intersection() {
    return null;
  }

  public Set<Integer> differenceAMinusB() {
    return null;
  }

  public Set<Integer> differenceBMinusA() {
    return null;
  }

  public Set<Integer> symmetricDifference() {
    return null;
  }

  public String toString() {
    return "Set one " + one + "\n" + "Set two " + two + "\n";
  }
}

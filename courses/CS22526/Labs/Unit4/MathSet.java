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
    one = new TreeSet<>();
    two = new TreeSet<>();

    String[] first = o.split(" ");
    String[] second = t.split(" ");

    for (String num : first) {
      one.add(Integer.parseInt(num));
    }

    for (String num : second) {
      two.add(Integer.parseInt(num));
    }
  }

  public Set<Integer> union() {
    Set<Integer> union = new TreeSet<Integer>(one);
    union.addAll(two);

    return union;
  }

  public Set<Integer> intersection() {
    Set<Integer> intersection = new TreeSet<Integer>();

    for (Integer num : one) {
      if (two.contains(num)) {
        intersection.add(num);
      }
    }

    return intersection;
  }

  public Set<Integer> differenceAMinusB() {
    Set<Integer> differenceAminusB = new TreeSet<Integer>();

    for (Integer num : one) {
      if (!two.contains(num)) {
        differenceAminusB.add(num);
      }
    }

    return differenceAminusB;
  }

  public Set<Integer> differenceBMinusA() {
    Set<Integer> differenceBminusA = new TreeSet<Integer>();

    for (Integer num : two) {
      if (!one.contains(num)) {
        differenceBminusA.add(num);
      }
    }

    return differenceBminusA;
  }

  public Set<Integer> symmetricDifference() {
    Set<Integer> symmetricDifference = new TreeSet<Integer>();

    symmetricDifference.addAll(differenceAMinusB());
    symmetricDifference.addAll(differenceBMinusA());

    return symmetricDifference;
  }

  public String toString() {
    return "Set one " + one + "\n" + "Set two " + two + "\n";
  }
}

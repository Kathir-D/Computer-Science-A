//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit5a_AddSubMult {

  public static double check(double a, double b) {
    if (a > b) {
      return a + b;
    }
    if (b > a) {
      return b - a;
    }
    if (a == b) {
      return a * b;
    } else {
      return 0;
    }
  }
}
/*
If a is > b, return a + b. If b is > a, return
b - a. If a is equal to b, return a * b.
 */

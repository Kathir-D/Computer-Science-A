//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit4a_AddOnlyNums {

  public static int go(String a, String b) {
    return (
      Integer.parseInt("" + (a.replaceAll("[^0-9]+", ""))) +
      Integer.parseInt("" + (b.replaceAll("[^0-9]+", "")))
    );
  }
}

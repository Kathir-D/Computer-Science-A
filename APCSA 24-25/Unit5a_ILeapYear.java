//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit5a_ILeapYear {

  public static boolean isLeapYear(int year) {
    boolean a;
    if (year % 4 == 0) {
      a = true;
    } else {
      a = false;
    }
    return a;
  }
}

package CS22526.Labs.Unit6;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BaseRunner {

  public static void main(String[] args) {
    String[] nums = {
      "10 10 2",
      "AB 16 10",
      "345 6 4",
      "25 10 2",
      "127 10 16",
      "1024 7 16",
      "97342 10 16",
      "1010010010001001 2 16",
    };

    for (String s : nums) {
      String[] parts = s.split(" ");
      String number = parts[0];
      int oldBase = Integer.parseInt(parts[1]);
      int cnvBase = Integer.parseInt(parts[2]);

      BaseConversion bc = new BaseConversion(number, oldBase);
      out.println(bc + " == " + bc.getNum(cnvBase) + "-" + cnvBase);
    }
  }
}

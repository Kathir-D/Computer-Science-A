package CS22526.Labs.Unit2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeral implements Comparable<RomanNumeral> {

  private Integer number;
  private String roman;

  private static final int[] NUMBERS = {
    1000,
    900,
    500,
    400,
    100,
    90,
    50,
    40,
    10,
    9,
    5,
    4,
    1,
  };

  private static final String[] LETTERS = {
    "M",
    "CM",
    "D",
    "CD",
    "C",
    "XC",
    "L",
    "XL",
    "X",
    "IX",
    "V",
    "IV",
    "I",
  };

  public RomanNumeral(String str) {
    roman = str;
    number = 0;
  }

  public RomanNumeral(Integer orig) {
    roman = "";
    number = orig;
  }

  public void setRoman(String roman) {
    this.roman = roman;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getRoman() {
    String s = "";
    int temp = number;

    for (int i = 0; i < NUMBERS.length; i++) {
      while (temp >= NUMBERS[i]) {
        s += LETTERS[i];
        temp -= NUMBERS[i];
      }
    }
    
    return s;
  }

  public int getNumber() {
    return number;
  }

  public int compareTo(RomanNumeral r) {
    return 0;
  }

  @Override
  public String toString() {
    setRoman(getRoman());
    return roman;
  }
}

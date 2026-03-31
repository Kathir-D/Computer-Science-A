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
    return intToRoman(number);
  }

  public int getNumber() {
    return romanToInt(roman);
  }

  private String intToRoman(int value) {
    StringBuilder sb = new StringBuilder();
    int temp = value;

    for (int i = 0; i < NUMBERS.length; i++) {
      while (temp >= NUMBERS[i]) {
        sb.append(LETTERS[i]);
        temp -= NUMBERS[i];
      }
    }

    return sb.toString();
  }

  private int romanToInt(String r) {
    int total = 0;
    String remaining = r.toUpperCase();

    for (int i = 0; i < NUMBERS.length; i++) {
      String s = LETTERS[i];
      while (remaining.startsWith(s)) {
        total += NUMBERS[i];
        remaining = remaining.substring(s.length());
      }
    }

    return total;
  }

  public int compareTo(RomanNumeral r) {
    return this.getNumber() - r.getNumber();
  }

  @Override
  public String toString() {
    return getRoman();
  }
}

package CS22526.Labs.Unit1; //(c) A+ Computer Science

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;

//define class Palin
//instance variable - String
//constructors
//getLength method - returns an int
//getWord method - returns a String
//isPalin method - returns a boolean
//toString method - returns a String

public class Palin {

  String s = "";

  public Palin(String word) {
    s = word;
  }

  public Palin() {
    s = "";
  }

  public int getLength() {
    return s.length();
  }

  public String getWord() {
    return s;
  }

  public boolean isPalin() {
    StringBuilder sb = new StringBuilder(s);

    if ((sb.reverse().toString()).equals(s)) {
      return true;
    }
    return false;
  }

  public String toString() {
    return s;
  }
}

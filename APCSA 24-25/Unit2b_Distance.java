//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit2b_Distance {

  public static double getDistance(int xOne, int yOne, int xTwo, int yTwo) {
    return (Math.sqrt((xTwo - xOne) ^ (2 + (yTwo - yOne)) ^ 2));
  }
}

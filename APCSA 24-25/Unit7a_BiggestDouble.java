//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class Unit7a_BiggestDouble {

  public static double getBiggest(double a, double b, double c, double d) {
    if (a > b && a > c && a > d) {
      return a;
    }
    if (b > a && b > c && b > d) {
      return b;
    }
    if (c > a && c > b && c > d) {
      return c;
    }
    if (d > a && d > b && d > c) {
      return d;
    }
    return 1231;
  }
}
/*
Lab Goal : The lab was designed to teach you how to use &&, ||, and !.
Lab Description : Compare four doubles to see which is the biggest.
Sample Data :
4.5 6.7 7.8 9.0
14.51 6.17 71.8 1.0
41.15 816.7 17.8 19.0
884.5 16.7 7.8 9.0
4.5 -456.7 677.8 9.0
4.5 16.7 -7.8 -9.0
Sample Output :
4.5 6.7 7.8 9.0
biggest = 9.0
14.51 6.17 71.8 1.0
biggest = 71.8
41.15 816.7 17.8 19.0
biggest = 816.7
884.5 16.7 7.8 9.0
biggest = 884.5
4.5 -456.7 677.8 9.0
biggest = 677.8
4.5 16.7 -7.8 -9.0
biggest = 16.7
 */

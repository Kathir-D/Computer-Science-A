package CSA2425; //(c) A+ Computer Science

// www.apluscompsci.com
//Name -

public class Unit7a_DoubleRunner {

  public static void main(String[] args) {
    System.out.println(Unit7a_BiggestDouble.getBiggest(4.5, 6.7, 7.8, 9.0));
    System.out.println(Unit7a_BiggestDouble.getBiggest(14.51, 6.17, 71.8, 1.0));
    System.out.println(
      Unit7a_BiggestDouble.getBiggest(41.15, 816.7, 17.8, 19.0)
    );
    System.out.println(Unit7a_BiggestDouble.getBiggest(884.5, 16.7, 7.8, 9.0));
    System.out.println(
      Unit7a_BiggestDouble.getBiggest(4.5, -456.7, 677.8, 9.0)
    );
    System.out.println(Unit7a_BiggestDouble.getBiggest(4.5, 16.7, -7.8, -9.0));
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

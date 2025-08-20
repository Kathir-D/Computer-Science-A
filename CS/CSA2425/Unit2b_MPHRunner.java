package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class Unit2b_MPHRunner {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Unit2b_MilesPerHour obj = new Unit2b_MilesPerHour();

    out.print("Enter distance :: ");
    int dist = sc.nextInt();
    out.print("Enter hrs :: ");
    int hrs = sc.nextInt();
    out.print("Enter mins :: ");
    int mins = sc.nextInt();

    out.println(Math.round((int) obj.getMPH(dist, hrs, mins)) + " MPH");
  }
}
/*

45 0 32 = 84 MPH
96 1 43 = 56 MPH
100 2 25 = 41 MPH
50 2 25 = 21 MPH
10 10 19 = 1 MPH
100 50 77 = 2 MPH

*/

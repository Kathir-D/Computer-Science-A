import java.util.*;

public class StatsRunner {

  public static void main(String[] args) {
    Stats r = new Stats();
    r.add("A DOO B WOP C DOO WOP DOO WOP");
    r.add("APLUS COMP SCI IS THE BEST!");
    r.add("A A A B B B C C C");
    r.add("SHOOBY DOOBY DOO");
    r.add("A A B B WOO WOO");
    System.out.println(r);
  }
}
/*

Sample Input

A DOO B WOP C DOO WOP DOO WOP
APLUS COMP SCI IS THE BEST! 
A A A B B B C C C    		   	
SHOOBY DOOBY DOO
A A B B WOO WOO
 
Expected output

A 1 3 3 3 5 5 
APLUS 2 
B 1 3 3 3 5 5 
BEST! 2 
C 1 3 3 3 
COMP 2 
DOO 1 1 1 4 
DOOBY 4 
IS 2 
SCI 2 
SHOOBY 4 
THE 2 
WOO 5 5 
WOP 1 1 1 

*/

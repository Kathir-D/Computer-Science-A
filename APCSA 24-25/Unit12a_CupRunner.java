//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;

public class Unit12a_CupRunner {

  public static void main(String[] args) {
    System.out.println("made a cup of 10");
    Unit12a_Cup c = new Unit12a_Cup(10);
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("add " + c.add(5));
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("add " + c.add(2));
    System.out.println("num adds " + c.getNumAdds());
    System.out.println("is full " + c.isFull());
    System.out.println("will overflow 10 " + c.willOverflow(10));
    System.out.println("pour 7 ");
    c.pour(7);
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("is full " + c.isFull());
    System.out.println("made a cup of 50");
    c = new Unit12a_Cup(50);
    System.out.println("will overflow 73 " + c.willOverflow(73));
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("add " + c.add(23));
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("add " + c.add(11));
    System.out.println("num adds " + c.getNumAdds());
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("is full " + c.isFull());
    System.out.println("will overflow 10 " + c.willOverflow(10));
    System.out.println("pour 7 ");
    c.pour(7);
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("is full " + c.isFull());
    System.out.println("made a cup of 30");
    c = new Unit12a_Cup(30);
    double[] r = { 3, 2, 1 };
    System.out.println("add lots " + c.addLots(r));
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("will overflow 10 " + c.willOverflow(10));
    double[] rr = { 1, 12, 6 };
    System.out.println("add lots " + c.addLots(rr));
    System.out.println("num adds " + c.getNumAdds());
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("is full " + c.isFull());
    System.out.println("will overflow 20 " + c.willOverflow(20));
    System.out.println("add " + c.add(9));
    System.out.println("num adds " + c.getNumAdds());
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("is full " + c.isFull());
    System.out.println("pour 10 ");
    c.pour(10);
    System.out.println("amt in cup " + c.getAmtInCup());
    System.out.println("is full " + c.isFull());
  }
}
/*
Lab Goal : This lab was designed to teach you more designing and writing classes. Use the same runner
code below and associated comments to create a Cup class.
Lab Description : Write a Cup class that will simulate storing liquid in a cup. You can add to the cup
and pour from the cup.
made a cup of 10
amt in cup 0.0
add 0.0
amt in cup 5.0
add 0.0
num adds 2
is full false
will overflow 10 true
pour 7
amt in cup 0.0
is full false
made a cup of 50
will overflow 73 true
amt in cup 0.0
add 0.0
amt in cup 23.0
add 0.0
num adds 2
amt in cup 34.0
is full false
will overflow 10 false
pour 7
amt in cup 27.0
is full false
made a cup of 30
add lots 0.0
amt in cup 6.0
will overflow 10 false
add lots 0.0
num adds 6
amt in cup 25.0
is full false
will overflow 20 true
add 4.0
num adds 7
amt in cup 30.0
is full true
pour 10
amt in cup 20.0
is full false
*/

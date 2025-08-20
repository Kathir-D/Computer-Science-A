//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit17a_ToyRunner {

  public static void main(String[] args) {
    Unit17a_Toy t = new Unit17a_Toy("sorry");
    System.out.println(t.getCount());
    System.out.println(t);
    System.out.println(t.getName());
    Unit17a_Toy s = new Unit17a_Toy("ji goe");
    System.out.println(s.getCount());
    s.setCount(5);
    System.out.println(s.getCount());
    System.out.println(s);
  }
}
/*
Lab Goal : This lab was designed to review basic class creation and to introduce and demonstrate how to
use an ArrayList.
Lab Description : Create a Toy class that stores a Toy name and a count and how many of that toy
exist. Use the sample runner code below to help you create the class and define the methods.
Sample Runner Code :
Toy t = new Toy( "sorry" );
System.out.println( t.getCount() );
System.out.println( t );
System.out.println( t.getName() );
Toy s = new Toy( "ji goe" );
System.out.println(s.getCount() );
s.setCount( 5 );
System.out.println(s.getCount() );
System.out.println( s );
Sample Output :
1
sorry 1
sorry
1
5
ji goe 5
 */

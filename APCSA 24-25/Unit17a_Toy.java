//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design and create
//your Toy class

//Use the lab handout
//and sample runner
//code provided
//to help you

public class Unit17a_Toy {

  private int count;
  private String name;

  public Unit17a_Toy() {
    count = 1;
    name = "";
  }

  public Unit17a_Toy(String s) {
    count = 1;
    name = s;
  }

  public int getCount() {
    return count;
  }

  public String getName() {
    return name;
  }

  public void setCount(int x) {
    count = x;
  }

  public String toString() {
    return name + " " + count;
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

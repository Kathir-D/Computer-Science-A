// (c) A+ Computer Science
// www.apluscompsci.com
// Name -

public class Unit17a_ToyStoreRunner {

  public static void main(String args[]) {
    Unit17a_ToyStore sto = new Unit17a_ToyStore();
    System.out.println(sto);
    String[] s =
      "sorry bat sorry sorry sorry train train teddy teddy ball ball".split(
          " "
        );
    sto.loadToys(s);
    System.out.println(sto);
    System.out.println("max == " + sto.getMostFrequentToy());
    System.out.println(sto.getThatToy("sorry"));
  }
}
/*
Lab Goal : This lab was designed to review basic class creation and to introduce and demonstrate how to
use an ArrayList.
Lab Description : Create a program that will store a list of Toys and keep track of how many times a
particular toy occurs.
BONUS CHALLENGE - Write a method to return the Toy that occurs in the list most frequent and another
method to sort the toys by count.
Sample Runner Code :
ToyStore sto = new ToyStore();
System.out.println( sto );
String[] s;
s = "sorry bat sorry sorry sorry train train teddy teddy ball ball".split(" ");
sto.loadToys( s );
System.out.println( sto );
System.out.println( "max == " + sto.getMostFrequentToy() );
System.out.println( sto.getThatToy( "sorry" ) );
Sample Output :
[]
[sorry 4, bat 1, train 2, teddy 2, ball 2]
max == sorry
sorry 4
 */

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;

public class Unit17a_ToyStore {

  private ArrayList<Unit17a_Toy> toyList;

  public Unit17a_ToyStore() {
    toyList = new ArrayList<>();
  }

  public void loadToys(String[] toys) {
    for (String toyName : toys) {
      Unit17a_Toy toy = getThatToy(toyName);
      if (toy == null) {
        toyList.add(new Unit17a_Toy(toyName));
      } else {
        toy.setCount(toy.getCount() + 1);
      }
    }
  }

  public Unit17a_Toy getThatToy(String nm) {
    for (Unit17a_Toy t : toyList) {
      if (t.getName().equals(nm)) {
        return t;
      }
    }
    return null;
  }

  public String getMostFrequentToy() {
    Unit17a_Toy x = null;

    if (toyList.size() > 0) {
      x = toyList.get(0);
    }

    for (int i = 1; i < toyList.size(); i++) {
      if (toyList.get(i).getCount() > x.getCount()) {
        x = toyList.get(i);
      }
    }

    return x.getName();
  }

  public void sortToysByCount() {
    // insertion sort
    for (int i = 1; i < toyList.size(); i++) {
      Unit17a_Toy temp = toyList.get(i);
      int j = i - 1;
      while (j >= 0 && toyList.get(j).getCount() > temp.getCount()) {
        toyList.set(j + 1, toyList.get(j));
        j--;
      }
      toyList.set(j + 1, temp);
    }
  }

  public String toString() {
    return Arrays.toString(toyList.toArray());
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

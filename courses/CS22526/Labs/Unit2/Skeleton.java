package CS22526.Labs.Unit2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Skeleton implements Monster {

  public String name;
  public int size;

  public Skeleton() {
    name = "";
    size = 0;
  }

  public Skeleton(String name) {
    this.name = name;
    size = 0;
  }

  public Skeleton(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public int getHowBig() {
    return size;
  }

  public String getName() {
    return name;
  }

  public boolean isBigger(Monster other) {
    return this.size > other.getHowBig();
  }

  public boolean isSmaller(Monster other) {
    return this.size < other.getHowBig();
  }

  public boolean namesTheSame(Monster other) {
    return this.name.equals(other.getName());
  }

  public String toString() {
    return name + " " + size;
  }
}
/*
Your class will store
the name and size of your monster. The monster class you create must implement the Monster interface.
Compare two monsters to see which is biggest and which is smallest. For extra credit, create a second
monster class of a different type and compare the two different monsters
 */

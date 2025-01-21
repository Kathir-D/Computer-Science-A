//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;

public class Unit15a_Monsters {

  private Unit15a_Monster[] myMonsters;

  public Unit15a_Monsters(int size) {
    myMonsters = new Unit15a_Monster[size];
  }

  public void add(int spot, Unit15a_Monster m) {
    myMonsters[spot] = m;
  }

  public Unit15a_Monster getLargest() {
    if (myMonsters.length == 0) return null;
    Unit15a_Monster largest = myMonsters[0];
    for (Unit15a_Monster m : myMonsters) {
      if (m.isBigger(largest)) largest = m;
    }
    return largest;
  }

  public Unit15a_Monster getSmallest() {
    if (myMonsters.length == 0) return null;
    Unit15a_Monster smallest = myMonsters[0];
    for (Unit15a_Monster m : myMonsters) {
      if (m.isSmaller(smallest)) smallest = m;
    }
    return smallest;
  }

  public String toString() {
    return "" + Arrays.toString(myMonsters);
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays of references.
Lab Description : Create a Monster[ ] array to store x number of Monster. You can use the Monster
class you created in the writing classes unit. You can copy and paste the Monster.java file into this lab folder.
Sample Output :
How many monsters are in the herd? :: 5
Enter the ht :: 1
Enter the wt :: 2
Enter the age :: 3
Enter the ht :: 3
Enter the wt :: 2
Enter the age :: 1
Enter the ht :: 2
Enter the wt :: 2
Enter the age :: 2
Enter the ht :: 3
Enter the wt :: 4
Enter the age :: 5
Enter the ht :: 5
Enter the wt :: 4
Enter the age :: 3
HERD :: [1 2 3, 3 2 1, 2 2 2, 3 4 5, 5 4 3]
SMALLEST :: 1 2 3
LARGEST :: 5 4 3
A+ Computer Science MONSTER
MASH

 */

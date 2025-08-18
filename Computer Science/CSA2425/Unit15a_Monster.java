package CSA2425; //(c)A+ Computer Science

//www.apluscompsci.com

public class Unit15a_Monster {

  private int weight;
  private int height;
  private int age;

  public Unit15a_Monster(int a, int h, int w) {
    age = a;
    height = h;
    weight = w;
  }

  //height is 1st, weight is 2nd, and age is 3rd
  public boolean isBigger(Unit15a_Monster other) {
    if (height > other.height) return true;
    if (height < other.height) return false;
    if (weight > other.weight) return true;
    if (weight < other.weight) return false;
    if (age > other.age) return true;
    return false;
  }

  public boolean isSmaller(Unit15a_Monster other) {
    if (height < other.height) return true;
    if (height > other.height) return false;
    if (weight < other.weight) return true;
    if (weight > other.weight) return false;
    if (age < other.age) return true;
    return false;
  }

  public String toString() {
    return "" + height + " " + weight + " " + age;
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

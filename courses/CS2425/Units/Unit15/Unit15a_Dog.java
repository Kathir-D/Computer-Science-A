package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com

public class Unit15a_Dog {

  private int age;
  private String name;

  public Unit15a_Dog(int a, String n) {
    age = a;
    name = n;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String toString() {
    return "" + age + " " + name;
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays of references.
Lab Description : Use the Dog, Doggies, and DoggiesRunner classes. Complete the
getNameOfOldest and getNameOfYoungest methods in the Doggies class.
Sample Output :
How many Dogs are in the pack? :: 5
Enter the age :: 20
Enter the name :: Sammy
Enter the age :: 10
Enter the name :: Benny
Enter the age :: 5
Enter the name :: Wilee
Enter the age :: 30
Enter the name :: Kelley
Enter the age :: 2
Enter the name :: Baby
pack :: [20 Sammy, 10 Benny, 5 Wilee, 30 Kelley, 2 Baby]
NAME OF OLDEST :: Kelley
NAME OF YOUNGEST :: Baby
 */

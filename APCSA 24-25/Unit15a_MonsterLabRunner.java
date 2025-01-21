//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Unit15a_MonsterLabRunner {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("How many monsters are in the herd? :: ");
    int size = keyboard.nextInt();
    Unit15a_Monsters herd = new Unit15a_Monsters(size);

    for (int i = 0; i < size; i++) {
      System.out.print("Enter the ht :: ");
      int ht = keyboard.nextInt();

      System.out.print("Enter the wt :: ");
      int wt = keyboard.nextInt();

      System.out.print("Enter the age :: ");
      int age = keyboard.nextInt();

      Unit15a_Monster monster = new Unit15a_Monster(age, ht, wt);
      herd.add(i, monster);
    }

    System.out.println("HERD :: " + herd);
    System.out.println("SMALLEST :: " + herd.getSmallest());
    System.out.println("LARGEST :: " + herd.getLargest());
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

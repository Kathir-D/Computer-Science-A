package CS22526.Labs.Unit2;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class MonsterRunner {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    out.print("Enter 1st monster's name : ");
    String name1 = keyboard.next();
    out.print("Enter 1st monster's size : ");
    int size1 = keyboard.nextInt();
    out.print("Enter 2nd monster's name : ");
    String name2 = keyboard.next();
    out.print("Enter 2nd monster's size : ");
    int size2 = keyboard.nextInt();

    Monster monster1 = new Skeleton(name1, size1);
    Monster monster2 = new Skeleton(name2, size2);

    out.println("Monster 1 – " + monster1);
    out.println("Monster 2 – " + monster2);

    if (monster1.isBigger(monster2)) {
      out.println("Monster one is bigger than Monster two.");
    } else if (monster1.isSmaller(monster2)) {
      out.println("Monster one is smaller than Monster two.");
    } else {
      out.println("Monster one is the same size as Monster two.");
    }

    if (monster1.namesTheSame(monster2)) {
      out.println("Monster one has the same name as Monster two.");
    } else {
      out.println("Monster one does not have the same name as Monster two.");
    }
  }
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.lang.*;
import java.util.*;

public class Unit12a_MonsterRunner {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter 1st monster's name : ");
    String name = keyboard.next();
    System.out.print("Enter 1st monster's size : ");
    int size = keyboard.nextInt();
    Unit12a_Monster mOne = new Unit12a_Monster(name, size);
    System.out.print("Enter 2nd monster's name : ");
    name = keyboard.next();
    System.out.print("Enter 2nd monster's size : ");
    size = keyboard.nextInt();
    Unit12a_Monster mTwo = new Unit12a_Monster(name, size);
    if (mOne.isSameSize(mTwo) == true) {
      System.out.println("Monster one the same size as Monster two.");
    } else if (mOne.isBigger(mTwo) == true) {
      System.out.println("Monster one is bigger than Monster two.");
    } else if (mOne.isSmaller(mTwo) == true) {
      System.out.println("Monster one is smaller than Monster two.");
    }

    if (mOne.namesTheSame(mTwo) == true) {
      System.out.println("Monster one has the same name as Monster two.");
    } else {
      System.out.println("Monster does not have the same name as Monster two.");
    }
  }
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class Unit15b_GradeBookRunner {

  public static void main(String args[]) throws Exception {
    System.out.println("Welcome to the Class Stats program!");

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the class name : ");
    String className = sc.nextLine();

    System.out.print("Enter the number of students : ");
    int numStudents = sc.nextInt();
    sc.nextLine();

    Unit15b_Class theClass = new Unit15b_Class(className, numStudents);

    for (int i = 0; i < numStudents; i++) {
      System.out.print("Enter a student name : ");
      String stuName = sc.nextLine();

      System.out.print("Enter the number of grades : ");
      int c = sc.nextInt();

      double[] g = new double[c];
      for (int x = 0; x < c; x++) {
        System.out.print("Enter a grade : ");
        g[x] = sc.nextDouble();
      }

      theClass.addStudent(i, new Unit15b_Student(stuName, g));
      sc.nextLine();
    }

    System.out.println("\n\n" + theClass);

    System.out.println("Failure List = " + theClass.getFailureList(70));
    System.out.println(
      "Highest Average = " + theClass.getStudentWithHighestAverage()
    );
    System.out.println(
      "Lowest Average = " + theClass.getStudentWithLowestAverage()
    );

    System.out.println("Class average = " + theClass.getClassAverage());
  }
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.io.File;
import java.util.*;

public class Unit15b_GradeBookFileRunner {

  public static void main(String args[]) throws Exception {
    out.println("Welcome to the Class Stats program!");

    Scanner file = new Scanner(new File("APCSA 24-25/Unit15b_gradebook.dat"));
    String className = file.nextLine();
    int numStudents = file.nextInt();
    file.nextLine();
    out.println(className);

    Unit15b_Class theClass = new Unit15b_Class(className, numStudents); // collection of the students

    for (int i = 0; i < numStudents; i++) {
      String studentName = file.nextLine();
      out.println(studentName);
      int numGrades = file.nextInt();
      double[] grades = new double[numGrades];
      double sum = 0;

      for (int j = 0; j < numGrades; j++) {
        double x = file.nextDouble();
        sum += x;
        grades[j] = x;
        Unit15b_Grade grade = new Unit15b_Grade(x);
        out.print(x + " " + grade.getLetterGrade() + " ");
      }

      double RA = Math.round((sum / numGrades) * 100.0) / 100.0;
      out.printf(" |  " + "%.2f", (sum / numGrades));
      out.println();

      Unit15b_Student student = new Unit15b_Student(studentName, grades); // each student
      theClass.addStudent(i, student);

      if (file.hasNextLine()) file.nextLine();
    }

    out.println("Failure List = " + theClass.getFailureList(70));
    out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
    out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());
    out.println("Class average = " + theClass.getClassAverage());
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays of references.
Lab Description : You will modify the existing gradebook program to use data file input to load in the
grade, student and class information. You can review data file input by looking back at unit 13.
Sample Input( gradebook.dat ) :
AP Computer Science AB
8
Hardly Surviving
3
70.2 65.3 45.1
Sammy Morgan
4
100 100 100 100
Ben Jamin
3
95.1 99.2 86.4
Sally Brainbaum
5
100.0 100 100.0 100 99
Shude Studymore
4
76.0 81.6 79.2 88.8
Bart Simpson
6
95.1 99.2 86.4 100 100 100
Chicken Little
5
100.0 100 100.0 100 45
Marky Mark
2
1 95
Sample Output :
Welcome to the Class Stats program!
AP Computer Science AB
Hardly Surviving = 70.2 C 65.3 D 45.1 F 60.20
Sammy Morgan = 100.0 A 100.0 A 100.0 A 100.0 A 100.00
Ben Jamin = 95.1 A 99.2 A 86.4 B 93.57
Sally Brainbaum = 100.0 A 100.0 A 100.0 A 100.0 A 99.0 A 99.80
Shude Studymore = 76.0 C 81.6 B 79.2 B 88.8 B 81.40
Bart Simpson = 95.1 A 99.2 A 86.4 B 100.0 A 100.0 A 100.0 A 96.78
Chicken Little = 100.0 A 100.0 A 100.0 A 100.0 A 45.0 F 89.00
Marky Mark = 1.0 F 95.0 A 48.00
Failure List = Hardly Surviving Marky Mark
Highest Average = Sammy Morgan
Lowest Average = Marky Mark
Class average = 83.59375
 */

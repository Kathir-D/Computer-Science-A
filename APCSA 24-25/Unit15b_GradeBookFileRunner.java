//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.io.File;
import java.util.Scanner;

public class Unit15b_GradeBookFileRunner {

  public static void main(String args[]) throws Exception {
    out.println("Welcome to the Class Stats program!");

    Scanner file = new Scanner(new File("Unit15b_gradebook.dat"));
    String className = file.nextLine();
    int numStudents = file.nextInt();
    file.nextLine();
    //make a new class

    //read in the information for each student

    //read in the student name

    //read in the student's grades

    //add a new student to the class

    //print out the class

    //    out.println("Failure List = " + theClass.getFailureList(70));
    //    out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
    //    out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());
    //
    //    out.println("Class average = " + theClass.getClassAverage());
  }
}

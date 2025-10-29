package CS22526.Labs.Unit5;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StudentsAndGradesRunner {

  public static void main(String args[]) throws IOException {
    Scanner file1 = new Scanner(new File("students.dat"));
    StudentsAndGrades sg1 = new StudentsAndGrades();
    int times = file1.nextInt();
    file1.nextLine();

    for (int i = 0; i < times; i++) {
      sg1.setStudent(file1.nextLine());
    }

    System.out.println(sg1);
    Scanner file2 = new Scanner(new File("students2.dat"));
    StudentsAndGrades sg2 = new StudentsAndGrades();
    times = file2.nextInt();
    file2.nextLine();

    for (int i = 0; i < times; i++) {
      sg2.setStudent(file2.nextLine());
    }

    System.out.println(sg2);
    file1.close();
    file2.close();
  }
}

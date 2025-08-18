package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Unit15b_Grades {

  private Unit15b_Grade[] grades;

  public Unit15b_Grades(double[] list) {
    grades = new Unit15b_Grade[list.length];
    for (int i = 0; i < list.length; i++) {
      grades[i] = new Unit15b_Grade(list[i]);
    }
  }

  public void setGrade(int pos, double grade) {
    grades[pos] = new Unit15b_Grade(grade);
  }

  public double getSum() {
    double sum = 0;
    for (Unit15b_Grade grade : grades) {
      sum += grade.getNumericGrade();
    }
    return sum;
  }

  public double getLowGrade() {
    double low = Double.MAX_VALUE;
    for (Unit15b_Grade grade : grades) {
      if (grade.getNumericGrade() < low) {
        low = grade.getNumericGrade();
      }
    }
    return low;
  }

  public double getHighGrade() {
    double high = -Double.MAX_VALUE;
    for (Unit15b_Grade grade : grades) {
      if (grade.getNumericGrade() > high) {
        high = grade.getNumericGrade();
      }
    }
    return high;
  }

  public int getNumGrades() {
    return grades.length;
  }

  public String toString() {
    return Arrays.toString(grades);
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays of references.
Lab Description : You will create a Student class to store student name and grade information. The Grades
class will store an array of Grade objects. The Grades class will keep track of a student’s grades. The Grades class will
have methods to return the low grade, high grade, sum of all grades, and other related methods. You must use the Grade
methods when writing the methods for the Grades class.
Class Grades :
public class Grades
{
private Grade[] grades;
public Grades( double[] list )
{
}
public void setGrade(int pos, double grade)
{
}
public double getSum()
{
return 0;
}
public double getLowGrade()
{
return 0;
}
public double getHighGrade()
{
return 0;
}
public int getNumGrades()
{
return 0;
}
public String toString()
{
return "";
}
}
Sample Input(GradesRunner.java) :
90 85 95.5 77.5 88
10 70 90 92.5 85 95.5 77.5 88 100.0
Sample Output :
90.0 A 85.0 B 95.5 A 77.5 C 88.0 B
sum = 436.0
num grades = 5
low grade = 77.5
high grade = 95.5
10.0 F 70.0 C 90.0 A 92.5 A 85.0 B 95.5 A 77.5 C 88.0 B 100.0 A
sum = 708.5
Files Needed ::
Grades.java
GradesRunner.java
A+ Computer Science
Gradebook 1
© A+ Computer Science –Array of References - www.apluscompsci.com
num grades = 9
low grade = 10.0
high grade = 100.0
 */

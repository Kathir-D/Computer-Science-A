package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit15b_GradesRunner {

  public static void main(String args[]) {
    double[] vals = { 90, 85, 95.5, 77.5, 88 };
    Unit15b_Grades test = new Unit15b_Grades(vals);
    System.out.println(test);
    System.out.println("sum = " + test.getSum());
    System.out.println("num grades = " + test.getNumGrades());
    System.out.println("low grade = " + test.getLowGrade());
    System.out.println("high grade = " + test.getHighGrade());

    double[] vals2 = { 10, 70, 90, 92.5, 85, 95.5, 77.5, 88, 100.0 };
    Unit15b_Grades test2 = new Unit15b_Grades(vals2);
    System.out.println(test2);
    System.out.println("sum = " + test2.getSum());
    System.out.println("num grades = " + test2.getNumGrades());
    System.out.println("low grade = " + test2.getLowGrade());
    System.out.println("high grade = " + test2.getHighGrade());
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

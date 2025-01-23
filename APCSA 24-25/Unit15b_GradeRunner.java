//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit15b_GradeRunner {

  public static void main(String args[]) {
    Unit15b_Grade x = new Unit15b_Grade(75.3);
    System.out.println(x);

    Unit15b_Grade y = new Unit15b_Grade(33);
    System.out.println(y);

    Unit15b_Grade z = new Unit15b_Grade(97.1);
    System.out.println(z);
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays of references.
Lab Description : You will create a Grade class to store a single grade. The Grade class will have one
constructor, a getNumericGrade method, a getLetterGrade method, and a toString.
The getNumericGrade method will return the numeric value of the Grade.
The getLetterGrade method will return the letter grade value of the Grade.
For the getLetterGrade method, A is 90 and up, B is 80 to 89, C is 70 to 79, D is 60 to 69, and F is 59 and below.
Class Grade:
public class Grade
{
private double value;
public Grade( double v )
{
}
public double getNumericGrade()
{
return 0;
}
public String getLetterGrade()
{
return "";
}
public String toString()
{
return "";
}
}
Sample Input(GradeRunner.java) :
75.3
33
97.1
Sample Output :
75.3 C
33.0 F
97.1 A
 */

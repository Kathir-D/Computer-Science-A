//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//create the Grade class here

public class Unit15b_Grade {

  private double value;

  public Unit15b_Grade(double v) {
    value = v;
  }

  public double getNumericGrade() {
    return value;
  }

  public String getLetterGrade() {
    if (value >= 90) {
      return "A";
    }
    if (value >= 80) {
      return "B";
    }
    if (value >= 70) {
      return "C";
    }
    if (value < 70) {
      return "F";
    }
    return "Error";
  }

  public String toString() {
    return getNumericGrade() + " " + getLetterGrade();
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

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit15b_Student {

  private String myName;
  private Unit15b_Grades myGrades;

  public Unit15b_Student(String name, double[] gradeList) {
    myName = name;
    myGrades = new Unit15b_Grades(gradeList);
  }

  public void setGrade(int spot, double grade) {
    myGrades = new Unit15b_Grades(new double[] { grade });
  }

  public String getName() {
    return myName;
  }

  public int getNumGrades() {
    return myGrades.getNumGrades();
  }

  public double getSum() {
    return myGrades.getSum();
  }

  public double getAverage() {
    return myGrades.getSum() / myGrades.getNumGrades();
  }

  public double getAverageMinusLow() {
    return (
      (myGrades.getSum() - myGrades.getLowGrade()) /
      (myGrades.getNumGrades() - 1)
    );
  }

  public double getHighGrade() {
    return myGrades.getHighGrade();
  }

  public double getLowGrade() {
    return myGrades.getLowGrade();
  }

  public String toString() {
    return myName + " = " + myGrades.toString();
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays of references.
Lab Description : You will create a Student class that will store student grade information. The Student class
will house the student’s name and all grades. You must use the methods from the Grades class to write the methods for
the Student class.
Class Student :
public class Student
{
private String myName;
private Grades myGrades;
//constructors
public void setName(String name){
}
public void setGrade(int spot, double grade){
}
public int getNumGrades(){
return 0;
}
public double getSum(){
return 0;
}
public double getAverage(){
return 0;
}
public double getAverageMinusLow(){
return 0;
}
public double getHighGrade(){
return 0;
}
public double getLowGrade(){
return 0;
}
}
Sample Input(StudentRunner.java) :
"Billy Bob", 90 85 95.5 77.5 88
"Sally Sue", 100 100 99
Sample Output :
Billy Bob = 90.0 A 85.0 B 95.5 A 77.5 C 88.0 B
sum = 436.0
average = 87.2
average - low = 89.625
low grade = 77.5
high grade = 95.5
Sally Sue = 100.0 A 100.0 A 99.0 A
sum = 299.0
average = 99.66666666666667
average - low = 100.0
Files Needed ::
Grades.java
GradesRunner.java
Student.java
StudentRunner.java
A+ Computer Science
Gradebook 2
© A+ Computer Science – Array of References - www.apluscompsci.com
low grade = 99.0
high grade = 100.0
 */

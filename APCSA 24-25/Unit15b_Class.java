//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit15b_Class {

  private String name;
  private Unit15b_Student[] studentList;

  public Unit15b_Class() {
    name = "";
    studentList = new Unit15b_Student[0];
  }

  public Unit15b_Class(String name, int stuCount) {
    this.name = name;
    studentList = new Unit15b_Student[stuCount];
  }

  public void addStudent(int stuNum, Unit15b_Student s) {
    studentList[stuNum] = s;
  }

  public String getClassName() {
    return name;
  }

  public double getStudentAverage(int stuNum) {
    return studentList[stuNum].getAverage();
  }

  public double getStudentAverage(String stuName) {
    return studentList[0].getAverage();
  }

  public String getStudentName(int stuNum) {
    return studentList[stuNum].getName();
  }

  public double getClassAverage() {
    double sum = 0.0;
    for (Unit15b_Student s : studentList) {
      sum += s.getAverage();
    }
    return sum / studentList.length;
  }

  public String getStudentWithHighestAverage() {
    Unit15b_Student highest = studentList[0];
    for (Unit15b_Student s : studentList) {
      if (s.getAverage() > highest.getAverage()) {
        highest = s;
      }
    }
    return highest.getName();
  }

  public String getStudentWithLowestAverage() {
    Unit15b_Student lowest = studentList[0];
    for (Unit15b_Student s : studentList) {
      if (s.getAverage() < lowest.getAverage()) {
        lowest = s;
      }
    }
    return lowest.getName();
  }

  public String getFailureList(double failingGrade) { // list so it needs to check for multiple
    //    for (Unit15b_Student s : studentList) {
    //      if (s.getAverage() < failingGrade) {
    //        return s.getName();
    //      }
    //    }

    StringBuilder listOfFailures = new StringBuilder();
    for (Unit15b_Student s : studentList) {
      if (s.getAverage() < failingGrade) {
        listOfFailures.append(s.getName());
        listOfFailures.append(", ");
      }
    }
    return listOfFailures.toString();
  }

  public String toString() {
    return "";
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays of references.
Lab Description : You will create a Class that will store information about grades for an entire class of students.
The Class will store a class name and an array of Students. Each Student will have a name and a list of grades. You
must use the Student class methods to write the Class.
Class Class :
public class Class
{
private String name;
private Student[] studentList;
//constructors
public void addStudent(int stuNum, Student s){ }
public String getClassName(){ return ""; }
public double getClassAverage(){
return 0.0;
}
public double getStudentAverage(int stuNum){
return 0.0;
}
public double getStudentAverage(String stuName){
return 0.0;
}
public String getStudentName(int stuNum){
return "";
}
public String getStudentWithHighestAverage(){
return "";
}
public String getStudentWithLowestAverage(){
return "";
}
public String getFailureList(double failingGrade){
return "";
}
}
Sample Input(ClassRunner.java) :
See the main of ClassRunner.java.
Sample Output :
Comp Sci 1
Jimmy = 100.0 A 90.0 A 80.0 B 60.0 D 82.50
Sandy = 100.0 A 100.0 A 80.0 B 70.0 C 87.50
Fred = 50.0 F 50.0 F 70.0 C 68.0 D 23.0 F 52.20
Sam = 100.0 A 100.00
Jimmy's average = 82.50
Sandy's average = 87.50
Fred's average 52.20
Sam's average 100.00
Sandy's average 87.50
Failure List = Fred
Highest Average = Sam
Files Needed ::
Grades.java
GradesRunner.java
Student.java
StudentRunner.java
Class.java
ClassRunner.java
A+ Computer Science
Gradebook 3
© A+ Computer Science –Array of References - www.apluscompsci.com
Lowest Average = Fred
Class Average = 80.55
 */

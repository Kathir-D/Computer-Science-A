package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Unit15b_ClassRunner {

  public static void main(String args[]) {
    Unit15b_Class test = new Unit15b_Class("Comp Sci 1", 4);

    double[] stu1 = { 100, 90, 80, 60 };
    test.addStudent(0, new Unit15b_Student("Jimmy", stu1));

    double[] stu2 = { 100, 100, 80, 70 };
    test.addStudent(1, new Unit15b_Student("Sandy", stu2));

    double[] stu3 = { 50, 50, 70, 68, 23 };
    test.addStudent(2, new Unit15b_Student("Fred", stu3));

    double[] stu4 = { 100 };
    test.addStudent(3, new Unit15b_Student("Sam", stu4));

    out.println(test);

    out.println(
      String.format(
        test.getStudentName(0) + "\'s average = %.2f",
        test.getStudentAverage(0)
      )
    );
    out.println(
      String.format(
        test.getStudentName(1) + "\'s average = %.2f",
        test.getStudentAverage(1)
      )
    );
    out.println(
      String.format(
        test.getStudentName(2) + "\'s average %.2f",
        test.getStudentAverage(2)
      )
    );
    out.println(
      String.format(
        test.getStudentName(3) + "\'s average %.2f",
        test.getStudentAverage(3)
      )
    );

    out.println(
      String.format(
        "Sandy" + "\'s average %.2f",
        test.getStudentAverage("Sandy")
      )
    );

    out.println("Failure List = " + test.getFailureList(70));
    out.println("Highest Average = " + test.getStudentWithHighestAverage());
    out.println("Lowest Average = " + test.getStudentWithLowestAverage());

    out.println(String.format("Class Average = %.2f", test.getClassAverage()));
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

package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit15b_StudentRunner {

  public static void main(String args[]) {
    double[] vals1 = { 90, 85, 95.5, 77.5, 88 };
    Unit15b_Student stu = new Unit15b_Student("Billy Bob", vals1);
    System.out.println(stu);
    System.out.println("sum = " + stu.getSum());
    System.out.println("average = " + stu.getAverage());
    System.out.println("average - low = " + stu.getAverageMinusLow());
    System.out.println("low grade = " + stu.getLowGrade());
    System.out.println("high grade = " + stu.getHighGrade() + "\n\n");

    double[] vals2 = { 100, 100, 99 };
    Unit15b_Student other = new Unit15b_Student("Sally Sue", vals2);
    System.out.println(other);
    System.out.println("sum = " + other.getSum());
    System.out.println("average = " + other.getAverage());
    System.out.println("average - low = " + other.getAverageMinusLow());
    System.out.println("low grade = " + other.getLowGrade());
    System.out.println("high grade = " + other.getHighGrade() + "\n\n");
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

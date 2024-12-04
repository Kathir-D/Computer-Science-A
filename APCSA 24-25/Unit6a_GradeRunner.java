//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class Unit6a_GradeRunner {

  public static void main(String args[]) {
    System.out.println(Unit6a_Grade.getLetterGrade(99));
    System.out.println(Unit6a_Grade.getLetterGrade(78));
    System.out.println(Unit6a_Grade.getLetterGrade(92));
    System.out.println(Unit6a_Grade.getLetterGrade(31));
    System.out.println(Unit6a_Grade.getLetterGrade(82));
    System.out.println(Unit6a_Grade.getLetterGrade(77));
    System.out.println(Unit6a_Grade.getLetterGrade(73));
    System.out.println(Unit6a_Grade.getLetterGrade(55));
    System.out.println(Unit6a_Grade.getLetterGrade(65));
  }
}
/*
Lab Description : You will write a method that will received a numeric grade. The method will return
the letter grade that corresponds with each numeric grade. Scanner is not required, but makes the lab much
more interesting.
Take a number and calculate its letter grade.
A is >= 90
B is >= 80 and <90
C is >= 75 and <80
D is >= 70 and <75
F is <70
Sample Data :
78
92
31
82
77
73
55
65
Sample Output :
Enter a number grade :: 78
78 is a C
Enter a number grade :: 92
92 is a A
Enter a number grade :: 31
31 is a F
Enter a number grade :: 82
82 is a B
Enter a number grade :: 77
77 is a C
Enter a number grade :: 73
73 is a D
Enter a number grade :: 55
55 is a F
Enter a number grade :: 65
65 is a F
 */

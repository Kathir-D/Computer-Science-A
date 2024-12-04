//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit6a_Grade {

  public static String getLetterGrade(int numGrade) {
    String letGrade = "";

    if (numGrade >= 90) {
      letGrade = "A";
    } else if (numGrade >= 80 && numGrade < 90) {
      letGrade = "B";
    } else if (numGrade >= 75 && numGrade < 80) {
      letGrade = "C";
    } else if (numGrade >= 70 && numGrade < 75) {
      letGrade = "D";
    } else {
      letGrade = "F";
    }

    return numGrade + " is a " + letGrade;
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

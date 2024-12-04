//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit10a_TriangleOne {

  //this lab is setup with a single static method
  //there are no instance variables or additional methods / constructors

  public static String go(String let, int size) {
    String output = "";

    for (int i = 1; i < size + 1; i++) {
      for (int x = 0; x < i; x++) {
        output += let;
      }
      output += "\n";
    }

    return output;
  }
}
/*

© A+ Computer Science – Nested Loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use nested loops. You will also learn how to make
some cool shapes.
Lab Description : Use nested loops to print out the triangle letter pattern show below.
Sample Data :
3 A
7 X
1 R
5 T
4 W
Sample Output :
A
AA
AAA
X
XX
XXX
XXXX
XXXXX
XXXXXX
XXXXXXX
R
T
TT
TTT
TTTT
TTTTT
W
WW
WWW
WWWW
algorithm help
output="";
loop i = 1 to size
{
loop j = 1 to i
{
output = output + letter
}
output = output + "\n"
}
Files Needed ::
TriangleOne.java
TriangleOneRunner.java
A+ Computer Science TRIANGLE ONE

 */

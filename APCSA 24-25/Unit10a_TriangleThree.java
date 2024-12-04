//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit10a_TriangleThree {

  public static String go(int size, String let) {
    String output = "";

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        output += " ";
      }
      for (int k = 0; k < i + 1; k++) {
        output += let;
      }
      output += "\n";
    }

    return output + "\n";
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
loop i that runs size times
{
loop j
{
output = output + " "
}
loop k
{
output = output + letter
}
output = output + "\n"
}
Files Needed ::
TriangleThree.java
TriangleThreeRunner.java
A+ Computer Science TRIANGLE
THREE

 */

package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit10a_Box {

  public static String go(int size) {
    String output = "";

    for (int i = size; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        output += "*";
      }
      // Inner loop for "#"
      for (int k = 0; k < (size - i + 1); k++) {
        output += "#";
      }
      // Move to the next line after each row
      output += "\n";
    }

    return output + "\n";
  }
}
/*
© A+ Computer Science – Nested Loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use nested loops. You will also learn how to make
some cool shapes.
Lab Description : Use nested loops to print out the box pattern show below.
Sample Data :
3
4
5
2
1
Sample Output :
***#
**##
*###

****#
***##
**###
*####

*****#
****##
***###
**####
*#####

**#
*##
*#
algorithm help
output="";
loop i that runs num times
{
loop j
{
output += "*"
}
loop k
{
output += "#"
}
output += "\n"
}
Files Needed ::
Box.java
BoxRunner.java
A+ Computer Science LOOP BOX

 */
